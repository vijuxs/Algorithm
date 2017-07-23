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

import java.util.Vector;

public class StackDemo {

	public static void main(String...args) {
		
		/* ack stck = new Stack();
		// 5,4
		// 5
		//--
		stck.push(5);
		stck.push(4);
		
		try {
			System.out.println(stck.pop());
			System.out.println(stck.pop());
			if(!stck.isEmpty()){
				System.out.println(stck.peek());
			}
		} catch (StackException e) {
			e.printStackTrace();
		}
		
		*/
		
		GStack<String> gstck = new GStack<>();
		gstck.push("one");
		gstck.push("two");
		gstck.push("three");
		
		if(!gstck.isEmpty()) {
			try {
				System.out.println(gstck.peek());
				System.out.println(gstck.pop());
				System.out.println(gstck.pop());
				System.out.println(gstck.pop());
				System.out.println(gstck.peek());
			} catch (StackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class GStack<E> {
	private Vector<E> elements;
	private int top;
	
	public GStack(){
		elements = new Vector<>();
		this.top = -1;
		
	}
	
	public void push(E elem) {
		this.elements.addElement(elem);
		this.top++;
	}
	
	public E pop() throws StackException {
		
		if(isEmpty()){
			throw new StackException("Stack is empty.");
		}
		
		E elem = (E) this.elements.remove(top);
		this.top--;
		return elem;
		
	}
	
	public E peek() throws StackException {
		
		if(isEmpty()){
			throw new StackException("Stack is empty.");
		}
		
		return this.elements.elementAt(top);
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
}

class Stack {
	
	private Vector<Integer> elements;
	private int top;
	
	public Stack() {
		elements = new Vector<>();
		this.top = -1;
	}
	
	public void push(Integer elem) {
		this.elements.addElement(elem);
		this.top = this.elements.lastIndexOf(elem);
	}
	
	public int pop() throws StackException {
		
		if(this.isEmpty()){
			throw new StackException("Stack is empty.");
		}
		int removedElement = (int) this.elements.remove(top);
		top--;
		return removedElement;
	}
	
	public int peek() throws StackException{
		if(this.isEmpty()){
			throw new StackException("Stack is empty.");
		}
		return (int) this.elements.elementAt(top);
	}
	
	public boolean isEmpty(){
		
		return this.top == -1;
	}
}

class StackException extends Exception {

	public StackException(String exc){
		super(exc);
	}
}
