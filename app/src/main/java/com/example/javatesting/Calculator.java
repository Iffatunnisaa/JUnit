package com.example.javatesting;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public String getOperationResultAsUpperCase(String operation, int a, int b) {
        int result;
        switch (operation.toLowerCase()) {
            case "add":
                result = add(a, b);
                break;
            case "subtract":
                result = subtract(a, b);
                break;
            case "multiply":
                result = multiply(a, b);
                break;
            case "divide":
                result = divide(a, b);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
        return StringHelper.convertToUpperCase("Result: " + result);
    }
}
