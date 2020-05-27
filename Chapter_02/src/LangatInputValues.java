/*
    Author: Larry Langat
    Date: August 23, 2018
    Purpose: To accept input from the user
 */
import java.util.Scanner;
public class LangatInputValues {
    public static void main (String[] args) {
        //initialize scanner object
        Scanner keyboard = new Scanner (System.in);

        //variables
        String name;
        double wage, gross_pay;
        int hrs;

        //get user's names
        System.out.print("What is your name ? ");
        name = keyboard.nextLine();

        //get user's hrs worked and wage
        System.out.print("How many hours did you work ? ");
        hrs = keyboard.nextInt();
        System.out.print("How much do you make per hour ? ");
        wage = keyboard.nextDouble();

        //calculate and print gross pay
        gross_pay = hrs * wage;
        System.out.print("Your name is "+ name + " and ");
        System.out.println("your gross pay is " + gross_pay);

    }
}
