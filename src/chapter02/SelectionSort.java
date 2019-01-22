package chapter02;

public class SelectionSort {
    public static void sort(int[] A) {
        for (int i = 0; i < A.length; i++) {            
            int min = A[i];
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < min) {
                    int temp = min;
                    min = A[j];
                    A[j] = temp;
                }
            }
            A[i] = min;
        }
    }
}
