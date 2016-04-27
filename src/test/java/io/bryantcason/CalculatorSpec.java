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
    public void multTest(){
        
    }
}
