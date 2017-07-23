package org.wizzle.algo.search;

/***
 * Return index of the key.
 * @author viju
 *
 */
public class BinarySearchDemo {
	
	public static void main(String...args) {
		
		int[] array = {2,3,5,7,23,30};
		int key = 30;
		System.out.println("With recursion = " + binarySearch(array, 0, array.length, key));
		System.out.println("Without recursion = " + binarySearchWhile(array, key));
		
	}
	
	/**
	 * With recursion.
	 * @param array
	 * @param low
	 * @param high
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] array, int low, int high, int key) {
		
		int mid = (low + high)/2;
		
		if (low < high) {
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] < key) {
				return binarySearch(array, mid + 1, high, key);
			} else if (array[mid] > key) {
				return binarySearch(array, low, mid, key);
			}
		}
		return -1;
	}
	/**
	 * Better implementation.
	 * @param array
	 * @param key
	 * @return
	 */
	public static int binarySearchWhile(int[] array, int key) {
		int low = 0;
		int high = array.length;
		int mid = 0;
		while(low < high) {
			
			mid = (low + high) / 2;
			
			if(key == array[mid]) {
				return mid;
			} else if (key < array[mid]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
}
