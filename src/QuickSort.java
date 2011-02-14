import java.util.Arrays;

public class QuickSort {
	
	public void run(int[] arr) {
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	// [-23, 1, 3, 4]

}
