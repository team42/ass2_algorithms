import java.util.Random;
import java.util.Arrays;

/**
 * Class for creating and sorting arrays.
 * 
 * @author Team42
 * @version 21/2-2011 14:08
 *
 */
public class ArrayMaker {
	private int[] array;

    /**
     * Creates an array with random numbers
     * Specify size of array with "length"
     * 
     * @param length: Size of array
     * @return Array with random numbers
     */
    private int[] createArray(int length) {
        array = new int[length];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
        return array;
    }
    
    /**
     * Sort array in ascending order.
     * 
     * @param arr
     * @return Array sorted in ascending order.
     */
    public int[] ascSort(int[] arr) {    	
    	int[] ascArr = Arrays.copyOf(arr, arr.length);
    	Arrays.sort(ascArr);
    	return ascArr;
    }
    
    /**
     * Sort array in descending order.
     * 
     * Taken from http://wiki.answers.com/Q/Sort_the_array_of_integers_in_Descending_order
     * 
     * @param arr
     * @return Array sorted in descending order.
     */
    public int[] descSort(int[] arr) {
    	int[] descArr = Arrays.copyOf(arr, arr.length);
    	int temp;
    	// reverse the array 
    	for( int i = 0; i < descArr.length/2; ++i ) { 
	    	temp = descArr[i]; 
	    	descArr[i] = descArr[descArr.length - i - 1]; 
	    	descArr[descArr.length - i - 1] = temp; 
    	}
    	return descArr;
    }
  
   /**
    * Get array.
    *
    * @param length: Size of array
    * @return Array created by createArray
    */
   public int[] getArray(int length) {
       this.createArray(length);
       return array;
   }
}
