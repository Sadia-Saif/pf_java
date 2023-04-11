package chap2.Qno3;
import java.util.Scanner;

public class Time {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		// number of years and days
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		// results
		System.out.println(minutes + " minutes are " + years
				+ " years and " + days + " days");

		input.close();
	}
}