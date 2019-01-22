package chapter02.test;

import org.junit.Assert;
import org.junit.Test;

import chapter02.InsertionSort;

public class InsertionSortTest {

    @Test
    public void testSort() {
        int[][] array = {{5, 2, 4, 6, 1, 3}, {31, 41, 59, 26, 41, 58}};
        int[][] expected = {{1, 2, 3, 4, 5, 6}, {26, 31, 41, 41, 58, 59}};
        
        for (int i = 0; i < array.length; i++) {
            InsertionSort.sort(array[i]);
            Assert.assertArrayEquals(expected[i], array[i]);
        }
    }
    
    @Test
    public void testSortNonDecreasing() {
        int[][] array = {{5, 2, 4, 6, 1, 3}, {31, 41, 59, 26, 41, 58}};
        int[][] expected = {{1, 2, 3, 4, 5, 6}, {26, 31, 41, 41, 58, 59}};
        
        for (int i = 0; i < array.length; i++) {
            InsertionSort.sortNonDecreasing(array[i]);
            Assert.assertArrayEquals(expected[i], array[i]);
        }
    }
    
    @Test
    public void testLinearSearch() {
        int[] array = {5, 2, 4, 6, 1, 3};
        
        int result1 = InsertionSort.linearSearch(array, 6);
        int result2 = InsertionSort.linearSearch(array, 8);
        Assert.assertEquals(3, result1);
        Assert.assertEquals(-1, result2);
    }
}