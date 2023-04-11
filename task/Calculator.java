package task;

import java.util.Scanner;

/*  Calculator
Write a program that let's the user to choose from the following
1:Add
2:Subtract
3:Multiply
4:Divide
Also, let the user to exit the program. Until then, keep the program running. When the user exits the program, show a message of "Good bye :)"
Make user of functions for creating above 4 options
Handle edge case for Subtraction, answer cannot be negative number
Handle edge case for division, answer cannot be infinity

You will be using the following
while loop
functions
conditional statements (if else)*/


class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;

        while (input != 5) {

            menu();
            input = sc.nextInt();

            if (input == 1) {
                addition();
            } else if (input == 2) {
                substraction();
            } else if (input == 3) {
                multiply();
            } else if (input == 4) {
                division();
            } else {
                System.out.print("\nInvalid choice");
            }

        }

        System.out.print("\nGood bye :)\n");
        sc.close();
    }

    public static void addition() {
        System.out.print("\nEnter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Result is: " + sum);
    }

    public static void substraction() {
        System.out.print("\nEnter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        int sub = a - b;
        if (sub < 0) {
            System.out.println("\nEnter any positive value");
        } else {
            System.out.println("Result is: " + sub);
        }

    }

    public static void multiply() {
        System.out.print("\nEnter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("Result is: " + mul);

    }

    public static void division() {

        System.out.print("Enter any value: ");
        int a = sc.nextInt();

        System.out.print("Enter any non zero value: ");
        int b = sc.nextInt();

        while (b == 0) {
            System.out.print("Enter any non zero value: ");
            b = sc.nextInt();
        }

        int answer = a / b;
        System.out.println(answer);

    }

    public static void menu() {
        System.out.println("\nWelcome ");
        System.out.println("Choose 1 for Addition");
        System.out.println("Choose 2 for Substraction");
        System.out.println("Choose 3 for Multiply");
        System.out.println("Choose 4 for Division");
        System.out.println("Choose 5 for exit");
        System.out.print("\nChoose the operation you want to perform:");
    }
}
