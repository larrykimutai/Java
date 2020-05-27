/*
   Author: Larry Langat
   Date: August 23, 2018
   Purpose: To print my name age and annual income.
*/
import javax.swing.JOptionPane;
public class LangatRestaurantBill {
    public static void main (String[] args) {
        //variables
        double tax_amount;
        double tip;
        double meal_charge;
        double total;
        String input;


        //ask for user input
        input = JOptionPane.showInputDialog
                ("Enter meal charge: ");
        meal_charge = Double.parseDouble(input);

        //perform calculations
        tax_amount = .0675 * meal_charge;
        tip = (tax_amount + meal_charge) * .2;
        total = tip + tax_amount + meal_charge;

        //print to console
        System.out.println("Meal charge: " + meal_charge);
        System.out.println("Tax: " + tax_amount);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total );


    }
}
