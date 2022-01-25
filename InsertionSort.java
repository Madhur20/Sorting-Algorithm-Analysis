
public class InsertionSort {
	static long comparisons=0, movements=0;
	/** The method for sorting the numbers */
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that
		 list[0..i] is sorted. */
			int currentElement = list[i];
			int k;
			boolean flag = false;
			for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
				comparisons++;
				flag = true;
				list[k + 1] = list[k];
				movements++;
			}
			if(k>=0) {
			comparisons++;
			}
			if(flag)
				movements++;

			// Insert the current element into list[k + 1]
			list[k + 1] = currentElement;
			
		}
	}

	static void print() {
		System.out.println("comparisons: " + comparisons);
		System.out.println("Movements: " + movements);
		comparisons=0; movements=0;
	}
}

