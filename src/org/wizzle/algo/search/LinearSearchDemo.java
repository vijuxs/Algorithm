package org.wizzle.algo.search;

/**
 * Given an array of N elements and a integer K , return the position of first occurence of K in given array.  
 * Position of first element is considered as 1. Output -1 if the number is not found in an array.
 * @author viju
 *
 */
public class LinearSearchDemo {
	
	public static void main(String...args) {
		int[] array = {2,4,5,10,12};
		int key = 8;
		System.out.println(search(array, key));
	}
	
	public static int search(int[] array, int key) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(key == array[i]) {
				return i;
			}
		}
		
		return -1;
	}
}
