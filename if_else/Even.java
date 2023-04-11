package if_else;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.println("Enter you value: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Your value is Even");
        } else {
            System.out.println("Your value is odd");

        }
        sc.close();
    }
}
