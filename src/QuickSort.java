import java.util.*;

/**
 * Implementation of Javas built-in QuickSort algorithm.
 *   
 * @author Team42
 * @version 21/2-2011 14:08
 *
 */
public class QuickSort {
	
	/**
	 * Method to sort array using Java's built-in sort.
	 * 
	 * In order to measure the time it takes for the algorithm to sort the array, 
     * we use the System.nanoTime() method to get the time difference in nano seconds.
 	 * 
	 * @param arr - Array to sorted. 
	 * @return arrList - ArrayList containing value
	 */
	public static long run(int[] arr) {	
		long t0 = System.nanoTime();
		Arrays.sort(arr);
		long t = System.nanoTime()- t0;
				
//		System.out.println(arrList.toString());
		return t;
	}
}
