package chap2.Qno2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter three numbers: ");

            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            double number3 = input.nextDouble();

            double average = (number1 + number2 + number3) / 3;
            System.out.println("\nThe average of " + number1 + " " + number2 + " " + number3 + " is " + average);
        }
        
    }
}
