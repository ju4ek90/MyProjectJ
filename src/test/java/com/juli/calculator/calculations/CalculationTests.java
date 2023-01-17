package com.juli.calculator.calculations;

import com.juli.calculator.TestData;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class CalculationTests {

    Calculator calculator = new Calculator(TestData.correctList);

    @Test
    public void addsNumbers() {
        assertEquals(TestData.RESULTS,  calculator.makeCalculation(new SumOperation()));
    }
}
