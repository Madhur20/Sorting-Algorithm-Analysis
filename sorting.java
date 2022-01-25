
import javax.swing.ToolTipManager;
import java.util.Random;


public class sorting {

   
    public static void main(String[] args) {


    	//Creating a sorted array
        int[] sortedarr = new int[50000];
        for(int i=0;i<5;i++)
            sortedarr[i] = i;
        
        //creating a reversed array
        int[] revarr = new int[50000];
        for(int i=0;i<=49999;i++)
            revarr[i] = 49999-i;
        
        //creating almost ordered array
        int almostarr [] = new int [50000];
        for ( int i = 0 ; i < almostarr.length-1 ; i++) {
        	if(i%100 != 0) {
        		almostarr[i] = i;
        	}
        	else {
        		almostarr[i] = (int)Math.random()*50000;
        	}
         }
        
        //creating random array
        int[] randarr = new int[50000];
        for(int i=0;i<50000;i++)
            randarr[i] = (int) (Math.random()*50000);
        
        
        //calling every sorting using every type or arrays
        System.out.println("*****For Sorted Array****");
        int[] temparr = sortedarr.clone();
        Insertion(temparr);
        
        temparr = sortedarr.clone();
        Selection(temparr);
        
        temparr = sortedarr.clone();
        Quick(temparr);
        
        temparr = sortedarr.clone();
        Merge(temparr);
        
        temparr = sortedarr.clone();
        Heap(temparr);
        
        temparr = sortedarr.clone();
        Radix(temparr);
        
        System.out.println("****For Reversed Array****");
        temparr = revarr.clone();
        Insertion(temparr);
        
        temparr = revarr.clone();
       Selection(temparr);
        
        temparr = revarr.clone();
        Quick(temparr);
        
        temparr = revarr.clone();
        Merge(temparr);

        temparr = revarr.clone();
        Heap(temparr);
        
        temparr = revarr.clone();
        Radix(temparr);
        
        System.out.println("****For Almost Sorted Array****");
        temparr = almostarr.clone();
        Insertion(temparr);
        
        temparr = almostarr.clone();
        Selection(temparr);
        
        temparr = almostarr.clone();
        Quick(temparr);
        
        temparr = almostarr.clone();
        Merge(temparr);

        temparr = almostarr.clone();
        Heap(temparr);
        
        temparr = almostarr.clone();
        Radix(temparr);
        
        System.out.println("****For Random Array****");
        temparr = randarr.clone();
        Insertion(temparr);
        
        temparr = randarr.clone();
        Selection(temparr);
        
        temparr = randarr.clone();
        Quick(temparr);
        
        temparr = randarr.clone();
        Merge(temparr);

        temparr = randarr.clone();
        Heap(temparr);
        
        temparr = randarr.clone();
        Radix(temparr);
        
        
    }
    
    //method for Insertion sort calling and measuring complexities
    public static void Insertion(int [] array) {
        long start = System.currentTimeMillis();
        InsertionSort.insertionSort(array);
        long finish = System.currentTimeMillis();
        long Ttime = finish - start;				//total time
        
        System.out.println("sortingInsertion()");
        System.out.println("Total time: " + Ttime);
        InsertionSort.print();					//calling print method for # of comparisons and movements
    }
    
    //method for Selection sort
    public static void Selection(int [] array) {
        long start = System.currentTimeMillis();
        SelectionSort.selectionSort(array);
        long finish = System.currentTimeMillis();
        long Ttime = finish - start;				//total time
        
        System.out.println("sortingSelection()");
        System.out.println("Total time: " + Ttime);
        SelectionSort.print();					//calling print method for # of comparisons and movements
    }
    
  //method for Quick sort
    public static void Quick(int [] array) {
        long start = System.currentTimeMillis();
        QuickSort.quickSort(array);
        long finish = System.currentTimeMillis();
        long Ttime = finish - start;				//total time
        
        System.out.println("sortingQuick()");
        System.out.println("Total time: " + Ttime);
        QuickSort.print();						//calling print method for # of comparisons and movements
    }
    
  //method for Merge sort
    public static void Merge(int [] array) {
        long start = System.currentTimeMillis();
        MergeSort.mergeSort(array);
        long finish = System.currentTimeMillis();
        long Ttime = finish - start;				//total time
        
        System.out.println("sortingMerge()");
        System.out.println("Total time: " + Ttime);
        MergeSort.print();						//calling print method for # of comparisons and movements
    }
    
  //method for Radix sort
    public static void Radix(int [] array) {
        long start = System.currentTimeMillis();
        RadixSort.radixsort(array, array.length);
        long finish = System.currentTimeMillis();
        long Ttime = finish - start;				//total time
        
        System.out.println("sortingRadix()");
        System.out.println("Total time: " + Ttime);
        RadixSort.print();						//calling print method for # of comparisons and movements
    }

  //method for Heap sort
    public static void Heap(int [] array) {
        long start = System.currentTimeMillis();
        HeapSort.heapSort(array);
        long finish = System.currentTimeMillis();
        long Ttime = finish - start;				//total time
        
        System.out.println("sortingHeap()");
        System.out.println("Total time: " + Ttime);
        HeapSort.print();						//calling print method for # of comparisons and movements
    }
}
