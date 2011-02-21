import java.util.*;

/**
 * Main class.
 * 
 * @author Lasse
 *
 */

public class Main {

	/**
	 * Main method.
	 * 
	 * The program creates three separate arrays, one filled with random integers, 
	 * one with the integers sorted in an ascending order (small to big) and one 
	 * last array with the integers sorted in a descending manner (big to small).
	 * 
	 * We can then run the calculation on the different sorting algorithms. 
	 * We use Calculation.CalcAvg() which creates an ArrayList with 100 elements 
	 * and fills these with the time measurement returned from the sorting algorithms. 
	 * It then returns the sum divided by number of elements (100). 
	 * In this way we have a convenient way of getting a lot of measurements.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Build arrays to use in test.
		ArrayMaker arrays = new ArrayMaker();
		int[] arr = arrays.getArray(50000);		
		int[] ascArr = arrays.ascSort(arr);
		int[] descArr = arrays.descSort(ascArr);
		
		System.out.println("QuickSort random= " + Calculation.CalcAvg(arr, 0) + "  ns\n");
		System.out.println("QuickSort asc= " + Calculation.CalcAvg(ascArr, 0) + "  ns\n");
		System.out.println("QuickSort desc= " + Calculation.CalcAvg(descArr, 0) + "  ns\n");
		
		System.out.println("SelectionSort random= " + Calculation.CalcAvg(arr, 1) + "  ns\n");
		System.out.println("SelectionSort asc= " + Calculation.CalcAvg(ascArr, 1) + "  ns\n");
		System.out.println("SelectionSort desc= " + Calculation.CalcAvg(descArr, 1) + "  ns\n");

	}
}