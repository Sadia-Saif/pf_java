package programs.atm;





import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.checkPin();
    }
}

class Atm {

    int pin = 4567;
    static float balance = 0;

    public Atm() {

    };

    public void checkPin() {
        System.out.println("Enter your pin");
        try {
            Scanner sc = new Scanner(System.in);
            int eneteredPin = sc.nextInt();
            if (eneteredPin == 4567) {

                menu();

            } else {
                System.out.print("Invalid pin");

            }

            sc.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }

    public static void menu() {



        Scanner sc = new Scanner(System.in);
        int opt = 0;

        // A Loop must have: variable,condition,change OR increment/decrement.

        while (opt != 4) {
            try {
                System.out.println("\nWelcome to the ATM Machine");
                System.out.println("Choose 1 for Check Your Balance");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Withdraw");
                System.out.println("Choose 4 for EXIT");
                System.out.print("Choose the operation you want to perform:");
                opt = sc.nextInt();
                if (opt == 1) {
                    checkBalance();
                } else if (opt == 2) {
                    deposite(sc);
                } else if (opt == 3) {
                    widraw(sc);
                } else if (opt == 4) {
                    exit();
                } else {
                    System.out.print("Invalid Entry");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        sc.close();

    }

    public static void checkBalance() {
        System.out.print("Your Balance:" + balance);
        // menu();
    }

    public static void deposite(Scanner sc) {
        System.out.print("Enter the amout for Deposite: ");
        float deposit = sc.nextFloat();
        balance = balance + deposit;
        System.out.print("Money Deposited Successful");

    }

    public static void widraw(Scanner sc) {
        System.out.print("Enter the amount to widraw: ");
        float withdraw = sc.nextFloat();
        if (balance > withdraw) {
            balance -= withdraw;
            System.out.println("Please collect your money");

        } else if (balance < withdraw) {
            System.out.print("Insufficient Balance");

        }
        // menu();

    }

    public static void exit() {
        System.exit(0);

    }
}
