package chapter02;

public class InsertionSort {
    
    // Main implementation.
    public static void sort(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }
    
    // exercise 2.1-2
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
    
    // exercise 2.1-3
    public static int linearSearch(int[] A, int v) {
        for (int i = 0; i < A.length; i++)
            if (A[i] == v)
                return i;
        return -1;
    }
}
