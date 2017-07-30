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
/**
 * Using int 
 * @author viju
 *
 */
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
