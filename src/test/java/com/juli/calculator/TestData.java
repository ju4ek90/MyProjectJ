package com.juli.calculator;

import java.util.List;

public class TestData {
    public static final double RESULTS = 10.0;
    public static final double BIG_RESULTS = 110.0;
    public static final String INPUT_WITH_NULL_DATA = "3 null 3 4";
    public static final String INPUT_WITH_COMMA_SEPARATOR = "3,3,4";
    public static final String INPUT_WITH_BIG_NUMBER = "3,3,4,101";
    public static final String INPUT_WITH_BIG_NUMBER_ALLOWED = "3,3,4,100";
    public static final String INPUT_WITH_COMMA_SPACES = "3,3, ,4";
    public static final String INPUT_WITH_SPACES = "3 3  4  ";
    public static final String INPUT_WITH_EMPTY_DATA = "3 \"\" 3 4";
    public static final String ERROR_MESSAGE = "Not an allowed value";
    public static final String INPUT_INCORRECT = "-3 3 4";
    public static final List<Integer> correctList = List.of(1,2,3,4);
}
