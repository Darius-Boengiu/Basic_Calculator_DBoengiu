package com.capgemini.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calculator {
    public static void main(String[] args) {
        //Validating input
        List<String> allowedOperands = new ArrayList<>(List.of("+", "-", "*", "/"));
        int firstNumber;
        int secondNumber;
        double result = 0;





        if (args.length != 3) {
            System.out.println("You should introduce two numbers and an operand");
            System.exit(0);
        }

        for (String arg : args) {
            if (Objects.isNull(arg)) {
                System.exit(0);
            }
        }

        if (isNotNumeric(args[0]) || isNotNumeric(args[2])) {
            System.out.println("You should have introduced numbers");
            System.exit(0);

        }

        firstNumber = Integer.parseInt(args[0]);
        secondNumber = Integer.parseInt(args[2]);

        if (!allowedOperands.contains(args[1])) {
            System.out.println("You should enter one of these operands {+, -, *, /}");
            System.exit(0);
        }


        //Business Logic
        switch (args[1]) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = (double) firstNumber / secondNumber;
                break;
        }

        System.out.println(result);

    }


    public static boolean isNotNumeric(String stringToNumber) {
        try {
            Integer.parseInt(stringToNumber);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}

