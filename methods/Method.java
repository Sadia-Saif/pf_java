package methods;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        // public static "return type" "method name"(){}
        // class is must for using of methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        int answer = addition(a, b);
        int sq = square(answer);
        int result = sq * 2;
        System.out.println(result);

        sc.close();

    }

    public static void printSomething() {
        System.out.println("Hello Here");
    }

    public static int addition(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static int square(int a) {
        int result = a * a;
        return result;
    }

}
