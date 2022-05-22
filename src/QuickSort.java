import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void quickSort(List<Integer> arr, int leftIndex, int rightIndex) {
if (leftIndex<rightIndex){
    int divineIndex = partition(arr, leftIndex, rightIndex);
    quickSort(arr, leftIndex, divineIndex - 1);
    quickSort(arr, divineIndex, rightIndex);
}
    }
    void printArray (List<Integer> arr) {
        for (Integer integer : arr) {
            System.out.print( integer + ", ");
        }
    }
    private static int partition (List<Integer> arr, int leftIndex, int rightIndex) {
        int pivot = arr.get(leftIndex + (rightIndex - leftIndex) / 2);
        while (leftIndex <= rightIndex) {
            while (arr.get(leftIndex) < pivot) {
                leftIndex++;
            }
            while (arr.get(rightIndex) > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                Collections.swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
