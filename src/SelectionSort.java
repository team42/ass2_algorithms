/**
 * The authors own implementation of a selection sort algorithm.
 * 
 * @author Team42
 * @version 21/2-2011 14:08
 *
 */
public class SelectionSort {
	
	/**
	 * Method implementing the selection sort algorithm.
	 * 
	 * The first for loop takes a element, i, to be compared (running from start to end-1) 
	 * and using the second for loop to get the next element, j, to compare to.	 * 
	 * If the element i is bigger than j we switch the two values.
	 * 
	 * In order to measure the time it takes for the algorithm to sort the array, 
	 * we use the System.nanoTime() method to get the time difference in nano seconds.
	 * 
	 * @param arr - Array to be sorted using the selection sort algorithm.
	 */
	public static long run(int[] arr) {
		long t0 = System.nanoTime();
		
	    for (int i=0; i<arr.length-1; i++) {
	        for (int j=i+1; j<arr.length; j++) {
	            if (arr[i] > arr[j]) {
	                // Exchange elements
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    long t = System.nanoTime() - t0;
	   	return t;
	}	
}
