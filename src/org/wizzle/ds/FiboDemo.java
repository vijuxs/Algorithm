package org.wizzle.ds;

public class FiboDemo {
	
	public static void main(String...strings) {
		System.out.println(fibo(3));
	}
	
	public static int fibo(int num){
		
		if(num <= 1) return num;
		
		return fibo(num - 2) + fibo(num -1);
	}

}
