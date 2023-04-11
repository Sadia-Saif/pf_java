package chap2.Qno5;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double celsius, fahren;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius");
        celsius = input.nextFloat();

        fahren = (9.0 / 5.0) * celsius + 32;

        System.out.print("Temperature in Fahrenheit = " + fahren);

        input.close();
    }
}
