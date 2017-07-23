/**
MIT License

Copyright (c) 2017 viju

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

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
