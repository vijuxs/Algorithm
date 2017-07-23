package org.wizzle.matrix;

public class MatrixDemo {
	
	public static void main(String[] strings) {
		
		Matrix m = new Matrix(3,3);
		
		m.randomize(9);
		
		System.out.println(m);
		
		Matrix n = new Matrix(3,2);
		
		n.randomize(9);
		
		System.out.println(n);
		
		try {
			
			System.out.println(m.multiply(n));
		
		} catch (MatrixException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void main(String strings){
		
		
		
		
		
		
		
	}
}
