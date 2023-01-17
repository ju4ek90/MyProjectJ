package com.juli.calculator.calculations;

import com.juli.calculator.TestData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculationTests {

    Calculator calculator = new Calculator(TestData.correctList);

    @Test
    public void addsNumbers() {
        assertEquals(TestData.RESULTS,  calculator.makeCalculation(new SumOperation()));
    }
}
