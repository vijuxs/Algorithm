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
