

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MakeArray makeArr = new MakeArray();
		int[] arr = makeArr.getArray(5000);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		
		//int[] arr = new int[] {4, 1, 3, -23};
		
		QuickSort quickSort = new QuickSort();		
		quickSort.run(arr);
		System.out.print("\n");
		SelectionSort selSort = new SelectionSort();
		selSort.run(arr);
	}
}