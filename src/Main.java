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
			
		// Insert the running time of sorting algorithm into arraylist.
		ArrayList<Long> arrList = new ArrayList<Long>();
		for(int i=0;i<100;i++) {
			arrList.add(QuickSort.run(arr));
		}
		
		// Sum the elements in arraylist and divide by number of elements.
		Iterator<Long> i = arrList.iterator();
		float sum = 0;
		while(i.hasNext()) {
			sum += (Long) i.next();
		}
		
		float avg = sum/arrList.size();
		
		System.out.println(avg + " ns");
		
//		quickSort.run(ascArr);
//		quickSort.run(descArr);
		

//		SelectionSort selSort = new SelectionSort();
//		selSort.run(arr);
//		selSort.run(ascArr);
//		selSort.run(descArr);
	}
}