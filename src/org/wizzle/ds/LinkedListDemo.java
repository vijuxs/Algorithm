package org.wizzle.ds;

public class LinkedListDemo {

	public static void main(String...strings){
		LinearLinkedList<String> l = new LinearLinkedList<>();
		
		l.insert("one");
		l.insert("two");
		l.insert("three");
		l.insert("two");
		
		System.out.println(l);
		
	}
}

class LinearLinkedList<E> {

	private Node<E> head;
	
	public LinearLinkedList() {
		head = new Node<>();
		
	}
	
	public void insert(E elem) {
		Node<E> n = new Node<>();
		n.data = elem;
		
		Node<E> endNode = traverseLast();
		endNode.next = n;
	}
	
	public void remove(E elem) {
		//TODO: Implement.
		/**
		 * Maybe it needs to be removed by index as well.
		 * 
		 */
	}
	
	public Node<E> traverseLast() {
		
		Node<E> currentNode = this.head;
		
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
			
		}
		
		return currentNode;
	}
	
	@Override
	public String toString() {
		
		if(this.head.getNext() == null) {
			return "[]";
		}
		
		Node<E> currentNode = this.head.getNext();
		StringBuffer buff = new StringBuffer();
		buff.append("[");

		while(currentNode != null){
			buff.append(currentNode.getData());
		
			if(currentNode != null && currentNode.getNext() != null){
				buff.append(", ");
			}
			currentNode = currentNode.getNext();
		}
		
		buff.append("]");
		return buff.toString();
	}
	
	@SuppressWarnings("hiding")
	private class Node<E> {
		private E data;
		private Node <E> next;
		
		public Node<E> getNext() {
			return this.next;
		}
		public E getData() {
			return this.data;
		}
	}
}
