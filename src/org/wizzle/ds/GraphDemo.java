package org.wizzle.ds;

public class GraphDemo {
	
	public static void main(String...args) {
		
	}
}

/**
 * Graph using adjacency matrix.
 * @author viju
 *
 */
class Graph {
	
	private Boolean adj[][];
	private int vertexCount;
	public Graph(int vertexCount){
		adj = new Boolean[vertexCount][vertexCount];
		this.vertexCount = vertexCount;
	}
	
	public void addEdge(int i, int j){
		if(i >= 0 && j >= 0 && (i < vertexCount) && (j < vertexCount)){
			adj[i][j] = true;
			adj[j][i] = true;
		}
	}
	
	public void removeEdge(int i, int j){
		if(i >= 0 && j >= 0 && (i < vertexCount) && (j < vertexCount)){
			adj[i][j] = false;
			adj[j][i] = false;
		}
		
	}
	
	public boolean isEdge(int i, int j){
		if(i >= 0 && j >= 0 && (i < vertexCount) && (j < vertexCount)){
			return adj[i][j];
		} 

		return false;
	}
}

/**
 * Graph using adjacency list.
 * @author viju
 *
 */
class LGraph{
	//TODO: Implement adjacency list graph.
	
	public LGraph() {
	}
	
	
	
}
