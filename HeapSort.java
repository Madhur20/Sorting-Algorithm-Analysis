
public class HeapSort {
	static int comparisons=0, movements=0;
	/** Heap sort method */
	public static <E extends Comparable<E>> void heapSort(int[] list) {
		// Create a Heap of integers
		Heap<E> heap = new Heap<>();
		//Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);

		// Remove elements from the heap
		for (int i = list.length - 1; i >= 0; i--) {
			Object x = (E) heap.remove();
        	movements++;
        	list[i] = (Integer)x;
		}
	}
	static void print() {
		System.out.println("comparisons: " + comparisons);
		System.out.println("Movements: " + movements);
		comparisons=0; movements=0;
	}

}