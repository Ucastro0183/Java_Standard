package Java_standard;

/**
 * File: ArrFunct.java<br><br>
 * This Class implements most commons operations on arrays.
 * 
 * @author ucastro
 *
 */	
public class ArrFunct {
	
	/**
	 * <pre><b>public static void</b> swap(int[] arr, int item1, int item2)</pre>
	 * This method swaps two items in an array, items item1 and item2
	 * will be interchanged
	 * @param arr Array to modify
	 * @param item1 first element to swap
	 * @param item2 second element to swap
	 */
	public static void swap(int[] arr, int item1, int item2) {
		// check both index exist in array length
		if (item1>arr.length) return;
		if (item2>arr.length) return;
		int aux = arr[item1];
		arr[item1]=arr[item2];
		arr[item2]=aux;
		return;
	}
	
	/**
	 * <pre><b>public static void</b> OrderArr(int[] arr, int index1, int index2)</pre>
	 * This method orders an array in ascending order for some interval elements 
	 * from index1 to index2 both included. 
	 * @param arr Array to be ordered
	 * @param index1 Begin element to start ordering
	 * @param index2 Last element to order
	 */
	public static void OrderArr(int[] arr, int index1, int index2) {
		// Check that index's are included in arr length
		if (arr.length< index2) index2=arr.length; 
		if (index1<0) return; 
		if (index1>=index2)return;
		for (int i=index1; i<index2; i++){
			for (int j=i+1; j<index2; j++){
				if (arr[i]>arr[j]) swap(arr,i,j);
			}
		}
	}
	
	/**
	 * <pre><b>public static void</b> OrderArr(int[] arr)</pre>
	 * This method orders an array in ascending order  
	 * in its entire length. 
	 * @param arr Array to be ordered
	 */
	public static void OrderArr(int[] arr) {
		OrderArr(arr, 0, arr.length );
	}
	
	/**
	 * <pre><b>public static boolean</b> IsOrdered(int[] arr)</pre>
	 * This function evaluates an array and returns true if the same is ordered,
	 * it does not indicates if it is ascending nor descending order
	 * @param arr Array to be evaluated 
	 */
	public static boolean IsOrdered(int[] arr) {
		if (arr.length<=1) return true;
		if (arr[0]<arr[1]){
			for (int i=0; i < (arr.length); i++){
				if (arr[i]>arr[i+1]) return false;
			}
		} else{
			for (int i=0; i < (arr.length); i++){
				if (arr[i]<arr[i+1]) return false;
			}
		}
		return true;
	}
	
	/**
	 * <pre><b>public static int[]</b> copyArr(int[] arr)</pre>
	 * This method copies an array of int into a new instance.<br><br>
	 * @param arr Original array to be copied.
	 * @return A new instance of array with the same contents of the original array
	 */
	public static int[] copyArr(int[] arr) {
		int[] result = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			result[i] = arr[i];
		}
		return result;
	}
	
	/**
	 * <pre><b>public static boolean</b> isItemFound(int[] arr, int item)</pre>
	 * This method indicates if certain item is found within an array.<br><br>
	 * @param arr array where to look for the item.
	 * @param item Item searched.
	 * @return True if the item is in the array.
	 */
	public static boolean isItemFound(int[] arr, int item) {
		int[] copy = copyArr(arr); // array copy used to leave original array unchanged.
		OrderArr(copy);
		for (int i=0; i<copy.length; i++) {
			if (item > copy[i]) break;
			if (item == copy[i]) return true;
		}			
		return false;
	}
	
	/**
	 * <pre><b>public static int</b> linearSearch(int[] arr, int item)</pre>
	 * This method gives the location of an item in an array.<br><br>
	 * @param arr array where to look for the item.
	 * @param item Item searched.
	 * @return Location of the item found, -1 if not located.
	 */
	public static int linearSearch(int[] arr, int item) {
		int index = -1;
		for (int i=0; i<arr.length; i++) {
			if (item == arr[i]) {
				index = i;
				break;
			}
		}			
		return index;
	}
	
	/**
	 * <pre><b>public static int</b> binarySearch(int[] arr, int item)</pre>
	 * This method gives the location of an item in an array. 
	 * The array should be ordered.<br><br>
	 * @param arr array where to look for the item.
	 * @param item Item searched.
	 * @return Location of the item found, -1 if not located.
	 */
	public static int binarySearch(int[] arr, int item) {

		int left = 0;
		int right = arr.length;
		
		while(left<right) {
			int mid = (left - right) / 2; 
			if (item == arr[mid]) {
				return mid;
			} else if (item > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}			
		return -1;
	}
	
	/**
	 * <pre><b>public static int</b> multiplyArr(int[] arr1, int[] arr2)</pre>
	 * This method multiplies two arrays. both arrays should be of the same size.<br><br>
	 * @param arr1 First array to multiply
	 * @param arr2 Second array to multiply
	 * @return Result of the multiplication of both arrays.
	 */
	public static Integer multiplyArr(int[] arr1, int[] arr2) {
		if (arr1.length!=arr2.length) return null;
		int result = 0;
		for (int i=0; i<arr1.length; i++) {
			result += arr1[i] * arr2[i];
		}
		return result;
	}

}
