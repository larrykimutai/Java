/*
   Author: Larry Langat
   Date: September 20, 2018
   Purpose: Write a program that converts a users
   input to menu of selection showing sufficient
   use of methods.
*/

import javax.swing.JOptionPane;

public class LangatConversionProgram {
    public static void main(String[] args){
        //variables
        String  input;
        double  distance;
        int option;

        //ask user input
        input = JOptionPane.showInputDialog
                ("Enter distance in meters:");
        distance = Double.parseDouble(input);

        do {
        //give user options
        input = JOptionPane.showInputDialog
                (       " \n 1 : Kilometers " +
                        " \n 2 : Inches " +
                        " \n 3 : Feet " +
                        " \n 4 : Quit Program " +
                        " \n Enter the number corresponded to chosen option: ");
        option = Integer.parseInt(input);
            if (option >= 5|| option <= 0) {
                JOptionPane.showMessageDialog
                        (null,"ERROR!! \n Please enter a number between 1 and 4");
            }

        //send the user's number to appropriate methods
            if (option == 1){
                showKilometers(distance);
            }
            else if (option == 2) {
                showInches(distance);
            }
            else if (option == 3) {
                showFeet(distance);
            }
            else if (option == 4) {
                JOptionPane.showMessageDialog
                        (null, "Thank You!!");
            }
        }
        while (option != 4);
    }
    //create method that converts meters to kilometers
    private static void showKilometers(double kilometers){
        double meters = kilometers * 0.001;
        System.out.printf("%,.2f Kilometers in %,.2f Meters.\n", meters, kilometers);
    }
    //create method that converts meters to inches
    private static void showInches(double inches){
        double meters = inches * 39.37;
        System.out.printf("%,.2f Kilometers in %,.2f Meters.\n", meters, inches);
    }
    //create method that converts meters to feet
    private static void showFeet(double feet){
        double meters = feet * 3.281;
        System.out.printf("%,.2f Kilometers in %,.2f Meters.\n", meters, feet);
    }
}
