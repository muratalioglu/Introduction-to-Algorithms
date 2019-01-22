package chapter02.test;

import org.junit.Assert;
import org.junit.Test;

import chapter02.MergeSort;

public class MergeSortTest {
    
    @Test
    public void testSort() {
        int[] array = {18991, 51279, 85157, 47078, 21777, 82539, 4787, 90898, 57, 50791};
        int[] expected = {57, 4787, 18991, 21777, 47078, 50791, 51279, 82539, 85157, 90898};
        
        MergeSort.sort(array);
        Assert.assertArrayEquals(expected, array);
    }
}
