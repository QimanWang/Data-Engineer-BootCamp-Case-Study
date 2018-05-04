package driver;

import exception.MismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

//Qiman Wang
public class MainDriver {

    public static void main(String[] args) throws MismatchException {
        String menuOptions = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                " 1: Display Customer's Details By ID " + "\n" +
                " 2: Update Customer's Details By Fields " + "\n" +
                " 3: Generate Customer's Bill By Credit Card Number" + "\n" +
                " 4: Display Transactions Between Two Dates " + "\n" +
                " 5: Display Transactions By ZipCode " + "\n" +
                " 6: Display Number Of Transactions And Total Transactions Amount By Type " + "\n" +
                " 7: Display Number Of Transactions And Total Transactions Amount By State " + "\n" +
                " 8: EXIT Application" + "\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~STARTING APPLICATION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        try {
            while (!exit) {
                System.out.println(menuOptions);
                System.out.println("Please Enter Number for Option");
                int input = scan.nextInt();
                if (input < 1 || input > 8) throw new InputMismatchException("NOT A VALID INPUT, PLEASE TRY AGAIN");
                switch (input) {
                    case 1:
                        CustomerDriver.getCustDetails();
                        break;
                    case 2:
                        CustomerDriver.modifyCustomerDetail();
                        break;
                    case 3:
                        CustomerDriver.generateBill();
                        break;
                    case 4:
                        CustomerDriver.displayTransactionsBetweenTwoDates();
                        break;
                    case 5:
                        TransactionDriver.getTransbyZipcode();
                        break;
                    case 6:
                        TransactionDriver.getNumberOfTransactionsAndTotalDollarAmountByType();
                        break;
                    case 7:
                        TransactionDriver.getNumberOfTransactionsAndTotalDollarAmountByState();
                        break;
                    case 8:
                        System.out.println("EXITING APPLICATION");
                        exit = true;
                        break;

                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        System.out.println("APPLICATION CLOSED");
    }
}
