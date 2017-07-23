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

package org.wizzle.matrix;

import java.util.Random;

public class Matrix {
	
	private int rows;
	private int cols;
	private int[][] values; 
	
	public Matrix(){}
	
	public Matrix(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
		values = new int[rows][cols];
		
	}
	
	/**
	 * Any matrix that has the same values at respective (row, col) is equal to this matrix.
	 */
	
	@Override
	public boolean equals(Object object) {
		
		if(!(object instanceof Matrix)) {
			return false;
		}
		
		Matrix anotherMatrix = (Matrix) object;
		
		if(this.rows != anotherMatrix.rows || this.cols != anotherMatrix.cols) {
			return false;
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(this.values[i][j] != anotherMatrix.values[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		
		StringBuffer rtstr = new StringBuffer();
		rtstr.append("[\n");
		
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				rtstr.append(this.values[i][j] + " ");
			}
			rtstr.append("\n");
		}
		
		rtstr.append("]");
		return new String(rtstr);
	}
	
	/**
	 * Adds a scalar n to the matrix.
	 * @param n
	 */
	public void add(int n){
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				this.values[i][j] += n;
			}
		}
	}
	
	/**
	 * Subtracts a scalar n from the matrix.
	 * @param n
	 */
	public void subtract(int n){
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				this.values[i][j] -= n;
			}
		}
	}
	
	/**
	 * Adds a matrix to the invoking matrix. <br> The matrix passed as argument remains unchanged after the operation.
	 * @param matrix
	 * @throws MatrixException
	 */
	public void add(Matrix matrix) throws MatrixException {
		if(!(matrix instanceof Matrix)) {
			throw new MatrixException("Not a matrix.");
		}
		
		if(this.rows != matrix.rows || this.cols != matrix.cols) {
			throw new MatrixException("Dissimilar matrix.");
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				this.values[i][j] += matrix.values[i][j];
			}
		}
		
	}
	
	/**
	 * Subtracts the positional values of the supplied matrix.
	 * @param matrix
	 * @throws MatrixException
	 */
	public void subtract(Matrix matrix) throws MatrixException {
		if(!(matrix instanceof Matrix)) {
			throw new MatrixException("Not a matrix.");
		}
		
		if(this.rows != matrix.rows || this.cols != matrix.cols) {
			throw new MatrixException("Dissimilar matrix.");
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				this.values[i][j] -= matrix.values[i][j];
			}
		}
	}
	
	/**
	 * Multiplies the matrix values by a scalar n.
	 * @param n
	 */
	public void scale(int n){
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				this.values[i][j] *= n;
			}
		}
	}
	
	/**
	 * Multiplies the invoking matrix by the another matrix. The values of the invoking matrix remain unchanged.
	 * @param matrix
	 * @return
	 * @throws MatrixException
	 */
	public Matrix multiply(Matrix matrix) throws MatrixException {
		
		if(!(matrix instanceof Matrix)) {
			throw new MatrixException("Not a matrix.");
		}
		
		if(this.cols != matrix.rows) {
			
			throw new MatrixException("Cannot multiply.");
			
		}
		
		Matrix result = new Matrix(this.rows, matrix.cols);
		
		int ci = 0;
		int cj = 0;
	
		for(int ai = 0, bj = 0; ai < this.rows && bj < matrix.cols;) {
			
			for(int aj = 0, bi = 0; aj < this.cols && bi < matrix.rows ; aj++, bi++) {
				result.values[ci][cj] += this.values[ai][aj] * matrix.values[bi][bj];
			}
			
			if(cj == result.cols -1) {
				ci++;
				cj = 0;
			} else 
				cj++;
			if(bj == matrix.cols-1){
				ai++;
				bj = 0;
			} else 
				bj++;
				
		}
		
		return result;
	}
	
	/**
	 * Initializes the matrix with random numbers. The range is from 0 to randomInt.
	 * @param randomInt
	 */
	public void randomize(int randomInt){
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				this.values[i][j] = new Random().nextInt(randomInt);
			}
		}
	}
}
