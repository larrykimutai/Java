/*
     Author: Larry Langat
       Date: August 28, 2018
    Purpose: To understand and apply operators to values and variables.
 */
public class LangatOperators {
    public static void main (String[] args) {
        //variables
        int shirt_price;
        int pants_price;
        double subtotal;
        double tax_rate = 0.07;
        double tax_amount;
        double total;

        //display cost
        shirt_price = 20;
        pants_price = 45;
        subtotal = shirt_price + pants_price;
        tax_amount = subtotal * tax_rate;
        total = subtotal + tax_amount;

        //print receipt
        System.out.println("Shirt: " + shirt_price);
        System.out.println("Pants: " + pants_price);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax Amount: " + tax_amount);
        System.out.println("Total: " + total);


    }
}
