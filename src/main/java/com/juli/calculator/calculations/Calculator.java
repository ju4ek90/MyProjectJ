package com.juli.calculator.calculations;
import java.util.List;

public class Calculator {

    private final List <Integer> modifiedList;

    public Calculator(List<Integer> modifiedList) {
        this.modifiedList = modifiedList;
    }

    public double makeCalculation(Operation operation) {
        return operation.calculateResult(modifiedList);
    }
}
