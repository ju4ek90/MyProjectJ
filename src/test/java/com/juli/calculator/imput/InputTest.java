package com.juli.calculator.imput;

import com.juli.calculator.TestData;
import com.juli.calculator.calculations.Calculator;
import com.juli.calculator.calculations.SumOperation;
import com.juli.calculator.input.InputParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputTest {

    public Calculator createCalculator(String input) {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(input))));
        return calculator;
    }

    @Test
    public void addsStringWithReplacingData() {
        assertEquals(TestData.RESULTS, createCalculator(TestData.INPUT_WITH_NULL_DATA).makeCalculation(new SumOperation()));
    }

    @Test
    public void addsStringWithEmptyData() {
        assertEquals(TestData.RESULTS, createCalculator(TestData.INPUT_WITH_EMPTY_DATA).makeCalculation(new SumOperation()));
    }

    @Test
    public void addsStringWithCommaSeparator() {
        assertEquals(TestData.RESULTS, createCalculator(TestData.INPUT_WITH_COMMA_SEPARATOR).makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersMoreThenAllowed() {
        assertEquals(TestData.RESULTS, createCalculator(TestData.INPUT_WITH_BIG_NUMBER).makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersNearAllowed() {
        assertEquals(TestData.BIG_RESULTS, createCalculator(TestData.INPUT_WITH_BIG_NUMBER_ALLOWED).makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersWithMoreSpaces() {
        assertEquals(TestData.RESULTS, createCalculator(TestData.INPUT_WITH_SPACES).makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersWithCommaSpaces() {
        assertEquals(TestData.RESULTS, createCalculator(TestData.INPUT_WITH_COMMA_SPACES).makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersWithMinus() {
        assertThrows(NumberFormatException.class, () -> createCalculator(TestData.INPUT_INCORRECT).makeCalculation(new SumOperation()));
    }
}
