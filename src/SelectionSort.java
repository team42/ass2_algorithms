import java.util.Arrays;


public class SelectionSort {
	
	public void run(int[] arr) {
		System.out.print("SelectionSort: ");
		long t0 = System.currentTimeMillis();
		
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
	    long t = System.currentTimeMillis()- t0;
	   	System.out.println(t + "ms");
	}	
}
