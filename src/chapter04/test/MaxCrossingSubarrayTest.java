package chapter04.test;

import org.junit.Assert;
import org.junit.Test;

import chapter04.MaxCrossingSubarray;

public class MaxCrossingSubarrayTest {

    @Test
    public void testFindMaxCrossingSubarraySum() {
        int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int expectedResult = 43;
        
        Assert.assertEquals(expectedResult, MaxCrossingSubarray.findMaxCrossingSubarraySum(array));
    }
}
