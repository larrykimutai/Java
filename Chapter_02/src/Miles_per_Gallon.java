/*
    Author: Larry Langat
    Date: September 27, 2018
    Purpose: Calculate mile per gallon
 */
import javax.swing.JOptionPane;
public class Miles_per_Gallon {
    public static void main(String[] args){
        //variables
        double  miles,
                gas;
        String  input;

        //ask user input
        input = JOptionPane.showInputDialog
                ("Miles Driven: ");
        miles = Double.parseDouble(input);

        input = JOptionPane.showInputDialog
                ("Gallons of gas used: ");
        gas = Double.parseDouble(input);

        //call and print milesPerGallon method
        System.out.println("You cars miles per gallon was " + milesPerGallon(miles,gas));
    }
    private static double milesPerGallon(double miles, double gas){
        return miles/gas;
    }
}
