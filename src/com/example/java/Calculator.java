package com.example.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    private static final String RED = "red";

    public static void main(String[] args) {
        String string1 = getInput("Enter a Number: ");
        String string2 = getInput("Enter a Number: ");

        String op = getInput("Choose an operation (+ - * /):");

        double result;

        //atia testing the usage and how to make it happend
        List<String> values=new LinkedList<>();


        try {
            switch (op) {
                case "+":
                    result = addValues(string2, string2);
                    break;
                case "-":
                    result = subtractValues(string2, string2);
                    break;
                case "*":
                    result = multiplyValues(string2, string2);
                    break;
                case "/":
                    result = divideValues(string2, string2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }

        useColor();
    }

    private static void useColor() {
        List<String> colors= new ArrayList<>();

        colors.add(RED);
        colors.add("blue");
        colors.add("green");
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
