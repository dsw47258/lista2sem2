import java.util.List;

public class BubbleSort {
    void bubbleSort(List<Integer> arr) {
        int length = arr.size();
        for (int i = 0; i < length - 1; i++) {
            for (int a = 0; a < length - i - 1; a++)
                if (arr.get(a) > arr.get(a + 1)) {
                    int m = arr.get(a);
                    arr.set(a, arr.get(a + 1));
                    arr.set(a + 1, m);

                }
        }
    }
    void printArray (List<Integer> arr) {
        for (int i=0; i< arr.size(); i++){
            System.out.print(arr.get(i) + ", ");
        }
    }
}
