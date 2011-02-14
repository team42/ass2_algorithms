import java.util.Arrays;

public class QuickSort {
	
	public void run(int[] arr) {	
		System.out.print("QuickSort: ");
		long t0 = System.nanoTime();
		Arrays.sort(arr);
		long t = System.nanoTime()- t0;
		
		System.out.println(t + "ns");
	}
}
