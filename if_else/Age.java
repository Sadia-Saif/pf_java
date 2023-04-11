package if_else;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        if (age > 18) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are not adult");
        }
        sc.close();
    }
}
