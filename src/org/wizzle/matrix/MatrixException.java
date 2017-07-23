package org.wizzle.matrix;

public 
class MatrixException extends Exception {
	
	String message;
	
	public MatrixException() {
		
	}
	
	public MatrixException(String message) {
		
		super(message);
	
	}
	
	@Override
	public String toString() {
		
		return message;
	}
}
