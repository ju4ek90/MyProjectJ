package com.juli.calculator.input;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputParser {

    private static final String SEPARATOR_1 = ",";
    private static final String SEPARATOR_2 = " ";
    private static final String EMPTY = "";
    private static final String EMPTY_2 = " ";
    private static final int NOT_ALLOWED = 100;
    private static final String ZERO = "0";
    private static final String NOT_ALLOWED_2 = "-";
    private static final String ERROR_MESSAGE = "Not an allowed value";
    private static final String NULL = "null";
    private static final String EMPTY_3 = "\"\"";

    public static String readInput(String inputLine) {
        //Processing of invalid or incorrect data

        if (inputLine.contains(NOT_ALLOWED_2)) {
            System.out.println(ERROR_MESSAGE);
            System.exit(1);
        } else {
            if (inputLine.contains(EMPTY_3)) {
                inputLine = inputLine.replace(EMPTY_3, ZERO);
            }
            if (inputLine.contains(NULL)) {
                inputLine = inputLine.replace(NULL, ZERO);
            }
        }
        return inputLine;
    }


    public static List<String> inputToArray(String inputLine) {
        List<String> inputList = new ArrayList<>();
        if (inputLine.contains(SEPARATOR_1)) {
            inputList = Stream.of(inputLine.split(SEPARATOR_1))
                    .collect(Collectors.toList());
        } else if (inputLine.contains(SEPARATOR_2)) {
            inputList = Stream.of(inputLine.split(SEPARATOR_2))
                    .collect(Collectors.toList());
        }
        return inputList;
    }

    public static List<Integer> modifiedList(List<String> inputToArray) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : inputToArray) {
            if (s.equals(EMPTY) || s.equals(EMPTY_2)) {
                s = ZERO;
                numbers.add(Integer.parseInt(s));
            } else if (Integer.parseInt(s) <= NOT_ALLOWED)
                numbers.add(Integer.parseInt(s));
        }

        return numbers;
    }
}
