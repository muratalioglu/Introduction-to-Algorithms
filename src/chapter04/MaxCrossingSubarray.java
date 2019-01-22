package chapter04;

public class MaxCrossingSubarray {
    
    public static int findMaxCrossingSubarraySum(int[] A) {
        int low = 0;
        int high = A.length - 1;
        int mid = (low + high) / 2;
        return findMaxCrossingSubarraySum(A, low, mid, high);
    }
    
    private static int findMaxCrossingSubarraySum(int[] A, int low, int mid, int high) {
        
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;        
        for (int i = mid; i >= low; i--) {
            sum += A[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i < high; i++) {
            sum += A[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }        
        return leftSum + rightSum;
    }    
}
