package arrays;





import java.util.Arrays;
import java.util.Scanner;

/*

1: Take an array of String, ask the user to give 3 hobbies as input and store them in the array
2: Show what the user has entered after taking all the input

Once you are done with these 2 points

3: Make a function printList that takes String[] list  as parameter and prints the elements in it for you.

 */

class ArraysPractice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] hobbies = new String[3];

        for (int i = 0; i < hobbies.length; i++) {
            System.out.print("\nEnter your " + count(i) + " hobby: ");
            hobbies[i] = sc.next();
        }

        printList(hobbies);

    }

    public static String count(int index) {
        if (index == 0) {
            return "first";

        } else if (index == 1) {
 
            return "Second";

        } else {
            return "Third";
        }

    }

    public static String[] printList(String[] list) {
        System.out.println(Arrays.toString(list));
        return list;
    }

}