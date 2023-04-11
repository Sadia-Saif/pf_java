package chap6;

import java.util.Scanner;

class Qno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter the value of a: ");
        int a = sc.nextInt();

        System.out.print("ENter the value of b:  ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print(sum);
        sc.close();
    }
}