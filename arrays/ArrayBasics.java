package arrays;





import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

    static String[] hobbies = new String[3];

    public static void main(String[] args) {
        inputList();
        printList();

    }

    public static void inputList() {

        Scanner sc = new Scanner(System.in);
        String hobby1, hobby2, hobby3;

        System.out.println("\nEnter your first hobby: ");
        hobby1 = sc.next();

        System.out.println("\nEnter your second hobby: ");
        hobby2 = sc.next();

        System.out.println("\nEnter your third hobby: ");
        hobby3 = sc.next();

        hobbies[0] = hobby1;
        hobbies[1] = hobby2;
        hobbies[2] = hobby3;

        sc.close();

    }

    public static void printList() {
        System.out.println("\nYour Hobbies are: " + Arrays.toString(hobbies));
    }

}
