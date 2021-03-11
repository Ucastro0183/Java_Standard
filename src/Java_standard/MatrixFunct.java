package Java_standard;

/**
 * File: MatrixFunct.java<br><br>
 * This class includes the most common operation on matrix.
 * 
 * @author Ulises
 *
 */
public class MatrixFunct {

	/**
	 * <pre><b>public int[][]</b> multiplyMatrix(int[][] matrix1, int[][] matrix2)</pre>
	 * Multiplies two matrix, for which the second matrix should have the same
	 * number of rows as the number of columns of the first matrix.<br><br>
	 * @param matrix1 First matrix to multiply 
	 * @param matrix2 Second matrix to multiply by
	 */
	public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		if (cols(matrix1)!=rows(matrix2)) return null;
		int[][] result = new int[rows(matrix1)][cols(matrix2)];
		for (int i=0; i<rows(matrix1); i++) {
			for (int j=0; j<cols(matrix2); j++){
				result[i][j] = multiplyArr(row(matrix1,i), col(matrix2,j));
			}
		}
		
		return result;
	}
	
	/**
	 * <pre><b>public int[][]</b> scalarMatrix(int[][] matrix, int multiple)</pre>
	 * Multiplies each value of the matrix for some scalar number.<br><br> 
	 * @param matrix Matrix to escalate 
	 * @param multiple Valor to multiply by
	 */
	public int[][] scalarMatrix(int[][] matrix, int multiple) {
		int[][] result = new int[rows(matrix)][cols(matrix)];
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++){
				result[i][j] = matrix[i][j] * multiple;
			}
		}
		return result;
	}
	
	/**
	 * <pre><b>public int[][]</b> sumMatrix(int[][] matrix1, int[][] matrix2)</pre>
	 * Sums two matrix generating another matrix.<br><br>
	 * @param matrix1 first matrix to add
	 * @param matrix2 second matrix to add
	 * @return Returns the resulting matrix of the addition operation.
	 */
	public int[][] sumMatrix(int[][] matrix1, int[][] matrix2) { 
		int rows = max(rows(matrix1),rows(matrix2));
		int cols = max(cols(matrix1),cols(matrix2));
		int[][] result = new int[rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				result[i][j] = 0;
				if ((i<=rows(matrix1))&&(j<=cols(matrix1))) result[i][j] += matrix1[i][j]; 
				if ((i<=rows(matrix2))&&(j<=cols(matrix2))) result[i][j] += matrix2[i][j];
			}
		}
		return result;
	}
	
	/**
	 * <pre><b>public int[][]</b> sumMatrix(int[][] matrix1, int[][] matrix2)</pre>
	 * Subtraction of two matrix generating another matrix.<br><br>
	 * @param matrix1 first matrix to subtract
	 * @param matrix2 second matrix to subtract
	 * @return Returns the resulting matrix of the subtraction operation.
	 */
	public int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
		return sumMatrix(matrix1, scalarMatrix(matrix2, -1));
	}
	
	/**
	 * <pre><b>public int[][]</b> transformMatrix(int[][] matrix)</pre>
	 * Returns the matrix transposed.<br><br>
	 * @param matrix Original matrix to transpose
	 * @return	Transpose of the original matrix.
	 */
	public int[][] transposeMatrix(int[][] matrix) {
		int[][] result = new int[cols(matrix)][rows(matrix)];
			for (int i=0; i<cols(matrix); i++) {
				for(int j=0; j<rows(matrix); j++) {
					result[i][j] = matrix[j][i];
				}
			}
		return result;
	}
	
	/**
	 * <pre><b>public boolean</b> isSquared(int[][] matrix)</pre>
	 * Indicates if a matrix has the same number of rows and columns.<br><br>
	 * @param matrix Matrix to evaluate
	 * @return condition if the matrix is squared.
	 */
	public boolean isSquared(int[][] matrix) {
		return rows(matrix)==cols(matrix);
	}
	
	/**
	 * <pre><b>public boolean</b> isDiagonal(int[][] matrix)</pre>
	 * Indicates if all the element outside the diagonal of the matrix are zeros.<br><br>
	 * @param matrix Matrix to evaluate
	 * @return condition if the matrix is diagonal.
	 */
	public boolean isDiagonal(int[][] matrix) {
		for (int i=0; i<rows(matrix); i++) {
			for (int j=0; j<cols(matrix); j++) {
				if ((i!=j)&&(matrix[i][j]!=0)) return false;
			}
		}
		return true;
	}
	
	/**
	 * <pre><b>public boolean</b> isUpperTriang(int[][] matrix)</pre>
	 * Indicates if all the element below the diagonal of the matrix are zeros.<br><br>
	 * @param matrix Matrix to evaluate
	 * @return condition if the matrix is upper triangular.
	 */
	public boolean isUpperTriang(int[][] matrix) {
		for (int i=0; i<rows(matrix); i++) {
			for (int j=0; j<cols(matrix); j++) {
				if ((i>j)&&(matrix[i][j]!=0)) return false;
			}
		}
		return true;
	}

	/**
	 * <pre><b>public boolean</b> isLowerTriang(int[][] matrix)</pre>
	 * Indicates if all the element above the diagonal of the matrix are zeros.<br><br>
	 * @param matrix Matrix to evaluate
	 * @return condition if the matrix is lower triangular.
	 */
	public boolean isLowerTriang(int[][] matrix) {
		for (int i=0; i<rows(matrix); i++) {
			for (int j=0; j<cols(matrix); j++) {
				if ((i<j)&&(matrix[i][j]!=0)) return false;
			}
		}
		return true;
	}

	/**
	 * <pre><b>private int</b> max(int x, int y)</pre>
	 * Returns the maximum of two values.<br><br>
	 * @param x First value to evaluate
	 * @param y Second value to evaluate
	 * @return Returns the maximum of the two values
	 */
	private int max(int x, int y) {
		if (x >= y) return x;
		return y;
	}
	
	/**
	 * <pre><b>private int</b> rows(int[][] matrix)</pre>
	 * Returns the number of rows of the matrix.<br><br>
	 * @param matrix Matrix to evaluate.
	 * @return the number of rows.
	 */
	private int rows(int[][] matrix) {
		return matrix.length;
	}
	
	/**
	 * <pre><b>private int</b> rows(int[][] matrix)</pre>
	 * Returns the number of columns of the matrix.<br><br>
	 * @param matrix Matrix to evaluate.
	 * @return the number of columns.
	 */
	private int cols(int[][] matrix) {
		return matrix[0].length;
	}
	
	/**
	 * <pre><b>public int[]</b> row(int[][] matrix, int index)</pre>
	 * Gives the index(th) row of the matrix as a vector. The index should be 
	 * smaller or equal to the number of rows of the matrix.<br><br>
	 * @param matrix Matrix from which the vector is taken
	 * @param index Index of the row to take.
	 * @return The row specified by the index.
	 */
	public int[] row(int[][] matrix, int index) {
		if (index > rows(matrix)) return null;
		int[] row = new int[cols(matrix)];
		for (int i=0; i<cols(matrix); i++) {
			row[i]=matrix[index][i];
		}
		return row;
	}
	
	/**
	 * <pre><b>public int[]</b> col(int[][] matrix, int index)</pre>
	 * Gives the index(th) column of the matrix as a vector. The index should be 
	 * smaller or equal to the number of columns of the matrix.<br><br>
	 * @param matrix Matrix from which the vector is taken
	 * @param index Index of the column to take.
	 * @return The column specified by the index.
	 */
	public int[] col(int[][] matrix, int index) {
		if (index > cols(matrix)) return null;
		int[] col = new int[rows(matrix)];
		for (int i=0; i<rows(matrix); i++) {
			col[i]=matrix[i][index];
		}
		return col;
	}
	
	/**
	 * <pre><b>public int</b> multiplyArr(int[] arr1, int[] arr2)</pre>
	 * This method multiplies two arrays. both arrays should be of the same size.<br><br>
	 * @param arr1 First array to multiply
	 * @param arr2 Second array to multiply
	 * @return Result of the multiplication of both arrays.
	 */
	public Integer multiplyArr(int[] arr1, int[] arr2) {
		if (arr1.length!=arr2.length) return null;
		int result = 0;
		for (int i=0; i<arr1.length; i++) {
			result += arr1[i] * arr2[i];
		}
		return result;
	}
	
}
