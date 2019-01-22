package chapter02;

public class InsertionSort {
    
    // Main implementation.
    public static void sort(int[] A) {
        for (int j = 0; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }
    
    public static void sortNonDecreasing(int[] A) {
        for (int j = A.length - 2; j >= 0; j--) {
            int key = A[j];
            int i = j + 1;
            
            while (i < A.length && A[i] < key) {
                A[i - 1] = A[i];
                i++;
            }
            A[i - 1] = key;
        }
    }
    
    public static int linearSearch(int[] A, int v) {
        for (int i = 0; i < A.length; i++)
            if (A[i] == v)
                return i;
        return -1;
    }
}
