import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class zad1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(4, 9, 21, 12, 8, 5));
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2 = (ArrayList<Integer>) arr1.clone();
        BubbleSort sort1 = new BubbleSort();
        long start1 = System.nanoTime();
        sort1.bubbleSort(arr1);
        long end1 = System.nanoTime();
        sort1.printArray(arr1);
        System.out.println("BubbleSort time in nano seconds: " + (end1 - start1));
        QuickSort sort2 = new QuickSort();
        long start2 = System.nanoTime();
        sort2.quickSort(arr2, 0, arr1.size() - 1);
        long end2 = System.nanoTime();
        sort2.printArray(arr2);
        System.out.println("QuickSort time in nano seconds: " + (end2 - start2));

    }

}
