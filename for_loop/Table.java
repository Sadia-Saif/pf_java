package for_loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the value: ");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            int result = n * i;
            System.out.println(result);
        }
        sc.close();
    }
}
