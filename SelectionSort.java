
public class SelectionSort {
	/** The method for sorting the numbers */
	static long comparisons=0, movements=0;
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				comparisons++;
				if (currentMin > list[j]) {
					
					currentMin = list[j];
					
					currentMinIndex = j;
				}
				
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				movements+=2;
				list[currentMinIndex] = list[i];
				list[i] = (int) currentMin;
				
			}
		}
	}
	static void print() {
		System.out.println("comparisons: " + comparisons);
		System.out.println("Movements: " + movements);
		comparisons=0; movements=0;
	}
}