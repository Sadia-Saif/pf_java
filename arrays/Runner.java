package arrays;



import java.util.Scanner;

public class Runner {

    static Scanner sc = new Scanner(System.in);
    static int size;
    static int number[] = new int[size];

    public static void main(String[] args) {

        userInput();
        userInput();

    }

    public static void userInput() {

        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();

        // input
        for (int i = 0; i <= size; i++) {
            number[i] = sc.nextInt();
            System.out.println(number[i]);
        }

    }

    public static void printOutput() {

        // output

        for (int i = 0; i <= size; i++) {
            System.out.print("Array is " + number[i]);
        }
    }

}
