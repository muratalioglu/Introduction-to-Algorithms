package chapter04.test;

import org.junit.Assert;
import org.junit.Test;

import chapter04.SquareMatrixMultiply;

public class SquareMatrixMultiplyTest {

    @Test
    public void test() {
        int[][] matrixA = { {1, 2, 3},
                            {4, 5, 6} };
        
        int[][] matrixB = { {7, 8},
                            {9, 10},
                            {11, 12} };
        
        int[][] expectedResult = { {58, 64},
                                   {139, 154} };
        
        Assert.assertArrayEquals(expectedResult, 
                SquareMatrixMultiply.squareMatrixMultiply(matrixA, matrixB));
    }

}
