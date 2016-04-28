package io.bryantcason;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by bryantcason on 4/27/16.
 */
public class CalculatorSpec {

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();

        int expectedSum = 4;
        int actualSum = calculator.sum(2,2);
        assertEquals("The expected value should be 2", expectedSum, actualSum);
    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();

        int expectedProd = 9;
        int actualProd = calculator.product(3,3);
        assertEquals("The expected value should be 3", expectedProd, actualProd);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();

        int expectedDiff = 0;
        int actualDiff = calculator.difference(10, 10);
        assertEquals("The expected value should be 10", expectedDiff, actualDiff);
    }
    @Test
    public void divisionTest(){
        Calculator calculator = new Calculator();

        int expectedQuo = 1;
        int actualQuo = calculator.quotient(100, 100);
        assertEquals("The expected value should be 100", expectedQuo, actualQuo);
    }

}
