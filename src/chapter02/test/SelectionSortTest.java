package chapter02.test;

import org.junit.Assert;
import org.junit.Test;

import chapter02.SelectionSort;

public class SelectionSortTest {
    @Test
    public void testSort() {
        int[][] array = {{5, 2, 4, 6, 1, 3}, {31, 41, 59, 26, 41, 58}};
        int[][] expected = {{1, 2, 3, 4, 5, 6}, {26, 31, 41, 41, 58, 59}};
        
        for (int i = 0; i < array.length; i++) {
            SelectionSort.sort(array[i]);
            Assert.assertArrayEquals(expected[i], array[i]);
        }
    }
}
