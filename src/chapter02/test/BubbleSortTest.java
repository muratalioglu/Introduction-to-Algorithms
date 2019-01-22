package chapter02.test;

import org.junit.Assert;
import org.junit.Test;

import chapter02.BubbleSort;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] array = {452, 632, 576, 166, 766, 135, 336, 627, 418, 200};
        int[] expected = {135, 166, 200, 336, 418, 452, 576, 627, 632, 766};
        
        BubbleSort.sort(array);
        Assert.assertArrayEquals(expected, array);
    }
}
