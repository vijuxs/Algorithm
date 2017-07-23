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
