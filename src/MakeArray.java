import java.util.Random;

public class MakeArray {
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
            array[i] = rand.nextInt(41) + 10;
        }

        return array;
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
