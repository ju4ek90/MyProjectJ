package com.juli.calculator.imput;

import com.juli.calculator.TestData;
import com.juli.calculator.calculations.Calculator;
import com.juli.calculator.calculations.SumOperation;
import com.juli.calculator.input.InputParser;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class InputTest {

    @Test
    public void addsStringWithReplacingData() {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(TestData.INPUT_WITH_NULL_DATA))));
        assertEquals(TestData.RESULTS, calculator.makeCalculation(new SumOperation()));
    }

    @Test
    public void addsStringWithEmptyData() {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(TestData.INPUT_WITH_EMPTY_DATA))));
        assertEquals(TestData.RESULTS, calculator.makeCalculation(new SumOperation()));
    }

    @Test
    public void addsStringWithCommaSeparator() {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(TestData.INPUT_WITH_COMMA_SEPARATOR))));
        assertEquals(TestData.RESULTS, calculator.makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersMoreThenAllowed() {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(TestData.INPUT_WITH_BIG_NUMBER))));
        assertEquals(TestData.RESULTS, calculator.makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersNearAllowed() {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(TestData.INPUT_WITH_BIG_NUMBER_ALLOWED))));
        assertEquals(TestData.BIG_RESULTS, calculator.makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersWithMoreSpaces() {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(TestData.INPUT_WITH_SPACES))));
        assertEquals(TestData.RESULTS, calculator.makeCalculation(new SumOperation()));
    }

    @Test
    public void addsNumbersWithCommaSpaces() {
        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(TestData.INPUT_WITH_COMMA_SPACES))));
        assertEquals(TestData.RESULTS, calculator.makeCalculation(new SumOperation()));
    }

    @Test
    public void addsStringWithIncorrectData() {
        InputParser.readInput(TestData.INPUT_INCORRECT);
    }
}
