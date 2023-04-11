package switch_case;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.print("Enter the value of button: ");
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        switch (Button) {
            case 1:
                System.out.println("Salam");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Greetings");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
        sc.close();
    }
}
