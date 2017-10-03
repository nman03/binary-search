
public class BinarySearch {
	
	// Using loops
	public static int nonRecursive(int[] arr, int key) {
		int high = arr.length - 1;
		int low = 0;

		while (high >= low) {
			int mid = (high + low) / 2;

			if (key < arr[mid])
				high =  mid - 1;
			else if (key > arr[mid])
				low = mid + 1;
			else 
				return mid;
		}

		return -1; // when key is not in the list
	}
	
	// Helper Method
	public static int recursive(int[] arr, int key) {
		return recursive(arr, 0, arr.length - 1, key);
	}

	// Using recusions
	public static int recursive(int[] arr, int low, int high, int key) {
		
		int mid = (high + low) / 2;
			
		if (high >= low) {
			if (key < arr[mid]) 
				return recursive(arr, low, mid - 1, key);
			else if (key > arr[mid])
				return recursive(arr, mid + 1, high, key);
			else 
				return mid;
		}
		
		return -1; // when key is not in the list
			
	}

	// Main
	public static void printArr(int[] arr) {
		for (int a : arr)
			System.out.print(a + " ");
		
		System.out.println();
	}

	public static void main(String[] args) {
		int[] list = {1, 3, 5, 7, 8, 10, 14};
		
		printArr(list);
		System.out.println("(Non-recursive) Key is in index: " + nonRecursive(list, 1));
		System.out.println("(Recursive) Key is in index: " + recursive(list, 7));
	}
}
