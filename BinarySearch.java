
public class BinarySearch {

	public static int nonRecursive(int[] arr, int key) {
		int high = arr.length - 1;
		int low = 0;

		while (high != low) {
			int mid = (high + low) / 2;

			if (key < arr[mid])
				high =  mid - 1;
			else if (key > arr[mid])
				low = mid + 1;
			else 
				return mid;
		}

		return -1;
	}


	public static void printArr(int[] arr) {
		for (int a : arr)
			System.out.print(a + " ");
		
		System.out.println();
	}

	// Testing
	public static void main(String[] args) {
		int[] list = {1, 3, 5, 7, 8, 10, 14};
		
		printArr(list);
		System.out.println("Key is in index: " + nonRecursive(list, 11));
	}
}
