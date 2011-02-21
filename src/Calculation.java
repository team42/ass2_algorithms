import java.util.ArrayList;
import java.util.Iterator;

/**
 * Used for calculating average running time of different sorting algorithms.
 * 
 * @author Lasse
 *
 */
public class Calculation {
	
	public static float CalcAvg(int[] arr, int sortType) {	
		
		long sortedArr = 0;
		if (sortType == 0) {
			sortedArr = QuickSort.run(arr);
		} else {
			sortedArr = SelectionSort.run(arr); 
		}
		
		/**
		 *  Insert the running time of sorting algorithm 
		 *  (return value from QuickSort or SelectionSort) 
		 *  into arraylist.
		 */
		ArrayList<Long> arrList = new ArrayList<Long>();
		for(int i=0;i<100;i++) {
			arrList.add(sortedArr);
		}
		
		// Sum the elements in arraylist and divide by number of elements.
		Iterator<Long> ite = arrList.iterator();
		float sum = 0;
		while(ite.hasNext()) {
			sum += (Long) ite.next();
		}		
		float avg = sum/arrList.size();		
		return avg;
	}
}
