package com.example.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    private static final String RED = "red";

    public static void main(String[] args) {
        String str1 = getInput("Enter a Number: ");
        String string2 = getInput("Enter a Number: ");
        String operation = getInput("Choose an operation (+ - * /):");

        double result;

        //atia testing the usage and how to make it happend
        List<String> values=new LinkedList<>();


        try {
            switch (operation) {
                case "+":
                    result = addValues(str1, string2);
                    break;
                case "-":
                    result = subtractValues(str1, string2);
                    break;
                case "*":
                    result = multiplyValues(str1, string2);
                    break;
                case "/":
                    result = divideValues(str1, string2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }

        usColors();
    }

    private static void usColors() {
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
