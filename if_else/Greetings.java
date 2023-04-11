package if_else;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        System.out.print("Enter the value of button: ");
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        if (Button == 1) {
            System.out.println("Salam");
        } else if (Button == 2) {
            System.out.println("Hello");
        } else if (Button == 3) {
            System.out.println("Greetings");
        } else {
            System.out.println("Invalid value");
        }
        sc.close();
    }
}
