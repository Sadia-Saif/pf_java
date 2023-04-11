package chap2.Qno1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.print("Enter your raius value: ");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println();
            double radius = input.nextDouble();
            double area = radius * radius * 3.14159;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
    }
}
