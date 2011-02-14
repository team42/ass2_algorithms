import java.util.Arrays;

/**
 * $Id$
 * 
 * @author Lasse
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayMaker arrays = new ArrayMaker();
		int[] arr = arrays.getArray(50000);
		
		int[] ascArr = arrays.ascSort(arr);
		int[] descArr = arrays.descSort(ascArr);
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(ascArr));
//		System.out.println(Arrays.toString(descArr));
			
		QuickSort quickSort = new QuickSort();		
		quickSort.run(arr);
		quickSort.run(ascArr);
		quickSort.run(descArr);

		SelectionSort selSort = new SelectionSort();
		selSort.run(arr);
		selSort.run(ascArr);
		selSort.run(descArr);
	}
}