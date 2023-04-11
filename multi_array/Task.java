package multi_array;

import java.util.Scanner;

/*
Take 3 arrays
names
age
gender
Take 2 inputs in these arrays where user can enter their name, age and gender. Once they are done, print the array in Table form
Name | Age | Gender
Hamza | 24 | Male
Ali | 22 | Male 
*/

public class Task {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // ...................array size declaration......................

        String[] names = new String[2];
        int[] age = new int[2];
        String[] gender = new String[2];

        // ...................store input method in a variable......................

        for (int n = 0; n < 2; n++) {
            names[n] = inputNames();
            age[n] = inputAge();
            gender[n] = inputGender();
            System.out.println("...................................");
        }

        // ...................call the printMethod for output......................

        showData(names, gender, age);
    }

    // ...................methods to take input from user ......................

    public static String inputNames() {
        System.out.print("Enter your name: ");
        String name = sc.next();
        return name;
    }

    public static int inputAge() {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        return age;
    }

    public static String inputGender() {
        System.out.print("Enter your gender: ");
        String gender = sc.next();
        return gender;

    }



    // ...................Method for printing the array......................

    public static void showData(String[] name, String[] gender, int[] age) {
        System.out.println("\nName  | Age | Gender ");
        for (int count = 0; count < 2; count++) {
            System.out.println(name[count] + "  | " + age[count] + "  | " + gender[count]);
        }
    }

}
