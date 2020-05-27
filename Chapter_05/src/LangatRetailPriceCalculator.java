/*
Author: Larry Langat
Date: September 24, 2018
Purpose: Write a program that calculates
and displays an item's retail price.
*/

import javax.swing.JOptionPane;

public class LangatRetailPriceCalculator {
    public static void main(String[] args) {
        //variables
        double  wholeSale,
                retail,
                markup_amount;
        int     markUp;
        String  input;

        //ask for user input
        input = JOptionPane.showInputDialog
                ("What is the items wholesale price?");
        wholeSale = Double.parseDouble(input);

        input = JOptionPane.showInputDialog
                ("What is the items markup percentage?");
        markUp = Integer.parseInt(input);

        //call methods
        retail = calculateRetial(wholeSale, markUp);
        markup_amount = markupamount(markUp, wholeSale);

        //print to console
        System.out.printf("Whole sale price: $%,.2f" +
                "\nMarkup Amount:\t  $%,.2f \nRetail:\t\t\t  $%,.2f ",
                wholeSale, markup_amount, retail);

    }
    //create method to calculates retail price.
    private static double calculateRetial(double whole_cost, int markUp_percentage){
        return whole_cost + (((double)markUp_percentage/100)*whole_cost);
    }
    //create method to calculate markup amount.
    private static double markupamount(double markup, double cost){
        return (markup/100) * cost;
    }
}
