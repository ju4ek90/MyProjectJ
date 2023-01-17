import com.juli.calculator.calculations.Calculator;
import com.juli.calculator.calculations.SumOperation;
import com.juli.calculator.input.InputParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorApplication {

    public static void main(String[] args) throws Exception {

        System.out.print("Please, input your numbers: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputLine = reader.readLine();

        Calculator calculator = new Calculator(InputParser.modifiedList(InputParser.inputToArray(InputParser.readInput(inputLine))));
            System.out.println("The sum of all the elements = " + calculator.makeCalculation(new SumOperation()));
    }
}

