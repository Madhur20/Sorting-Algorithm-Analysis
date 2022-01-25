public class QuickSort {
	static long comparisons=0, movements=0;
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	/** Partition the array list[first..last] */
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search

		while (high > low) {
			// Search forward from left
			while (low <= high && list[low] <= pivot) {
				comparisons++;
				low++;
			}
				
			if(low<=high) {
				comparisons++;
			}

			// Search backward from right
			while (low <= high && list[high] > pivot) {
				comparisons++;
				high--;
			}
			
			if(low<=high) {
				comparisons++;
			}

			// Swap two elements in the list
			if (high > low) {
				movements+=2;
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		while (high > first && list[high] >= pivot) {
			high--;
			comparisons++;
		}
		if(high>first) {
			comparisons++;
		}
		
		comparisons++;

		// Swap pivot with list[high]
		if (pivot > list[high]) {
			movements+=2;
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else {
			return first;
		}
	}
	static void print() {
		System.out.println("comparisons: " + comparisons);
		System.out.println("Movements: " + movements);
		comparisons=0; movements=0;
	}

//	/** A test method */
//	public static void main(String[] args) {
//		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
//		quickSort(list);
//		for (int i = 0; i < list.length; i++)
//			System.out.print(list[i] + " ");
//	}
}