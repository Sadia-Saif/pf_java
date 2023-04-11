package if_else;

import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A is equal to B");

        } else if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("A is lesser than B");

        }
        sc.close();

    }
}
