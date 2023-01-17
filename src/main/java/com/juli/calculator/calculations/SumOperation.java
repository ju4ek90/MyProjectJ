package com.juli.calculator.calculations;

import java.util.List;

public class SumOperation implements Operation {


    @Override
    public double calculateResult(List<Integer> list) {
        return addNumbers(list);
    }

    public static Integer addNumbers(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum = sum + num;
        }
        return sum;
    }
}
