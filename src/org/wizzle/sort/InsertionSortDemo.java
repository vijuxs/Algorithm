package org.wizzle.sort;

public class InsertionSortDemo {

	public static void main(String...strings) {
		int[] array = {3,4,10,5,1,6};
		InsertionSort.sort(array);
		
		for(int i = 0; i < array.length; i++){
			System.out.print (array[i] + " ");
			
		}
	}
}

class InsertionSort {
	
	public static void sort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			
			for (int j = i; j > 0 && array[j] < array[j-1]; j--) {
				swap(array, j, j-1);
				
			}
		}
	}
	
	private static void swap(int[] array, int one, int two) {
		
		int tempValue = array[one];
		array[one] = array[two];
		array[two] = tempValue;
	}
	
}
