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
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Build arrays to use in test.
		ArrayMaker arrays = new ArrayMaker();
		int[] arr = arrays.getArray(100000);		
		int[] ascArr = arrays.ascSort(arr);
		int[] descArr = arrays.descSort(ascArr);
		
		System.out.println("Average QuickSort = " + Calculation.CalcAvg(arr, 0) + "  ns\n");
		System.out.println("Average QuickSort = " + Calculation.CalcAvg(ascArr, 0) + "  ns\n");
		System.out.println("Average QuickSort = " + Calculation.CalcAvg(descArr, 0) + "  ns\n");
		
		System.out.println("Average SelectionSort = " + Calculation.CalcAvg(arr, 1) + "  ns\n");
		System.out.println("Average SelectionSort = " + Calculation.CalcAvg(ascArr, 1) + "  ns\n");
		System.out.println("Average SelectionSort = " + Calculation.CalcAvg(descArr, 1) + "  ns\n");

	}
}