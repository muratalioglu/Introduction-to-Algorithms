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
        int maxLeft = 0;
        for (int i = mid; i >= low; i--) {
            sum += A[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = 0;
        for (int i = mid + 1; i < high; i++) {
            sum += A[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }        
        
        System.out.print("The maximum subarray is: ");
        for (int i = 0, j = maxLeft; i < (maxRight - maxLeft + 1); i++, j++) {
            System.out.print(A[j] + " ");
        }
        System.out.println();
        return leftSum + rightSum;
    }    
}
