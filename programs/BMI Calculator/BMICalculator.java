
import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    // Bmi bmi = new Bmi();
    Bmi.calc();

    // try (Scanner input = new Scanner(System.in)) {

    // System.out.print("Enter your weight in pounds: ");
    // double weightInPounds = input.nextDouble();
    // System.out.print("Enter your height in inches: ");
    // double heightInInches = input.nextDouble();

    // double weightInKilograms = weightInPounds * 0.45359237;
    // double heightInMeters = heightInInches * 0.0254;
    // double bmi = weightInKilograms / (heightInMeters * heightInMeters);

    // System.out.println("Your BMI is " + bmi);
  }
}
// }

class Bmi {

  static Scanner input = new Scanner(System.in);

  // inputWeight (){}
  public static double calcWeight() {
    System.out.print("Enter your weight in Kilograms: ");
    double weightInKilograms = input.nextDouble();
    return weightInKilograms;
  }

  // inputHeight (){}
  public static double calcHeight() {
    System.out.print("Enter your height in meters: ");
    double heightInMeters = input.nextDouble();
    return heightInMeters;
  }

  // calc (){}
  public static void calc() {
    double w = calcWeight();
    double h = calcHeight();

    double bmi = w / (h * h);
    System.out.println("Your  BMI is: " + bmi);
  }
}