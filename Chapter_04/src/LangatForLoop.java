/*
   Author: Larry Langat
   Date: September 5, 2018
   Purpose: Use a for loop to calculate class average.
*/
import javax.swing.JOptionPane;
public class LangatForLoop {
    public static void main(String[] args) {
        //variables
        int num_grade, grade, total;
        double average;
        String in;

        //ask user input
        in = JOptionPane.showInputDialog
                ("How many grades do you have (1-10)");
        num_grade = Integer.parseInt(in);

        while (num_grade < 1 || num_grade >10) {
            JOptionPane.showMessageDialog
                    (null, "Please enter number between 1 - 10");
            in = JOptionPane.showInputDialog
                    ("Please enter number between 1 and 10");
            num_grade = Integer.parseInt(in);
        }

        //initialize total variable
        total = 0;

        //get grades from user and calculate total
        for (int cntr = 1;      cntr <= num_grade;     cntr++) {
            //starts counter    tells when to stop    incrementer

            in = JOptionPane.showInputDialog
                    ("Enter Grade number " + cntr);
            grade = Integer.parseInt(in);

            total += grade; //equivalent to: total = total + grade;
        }

        //calculate average
        average = (double)total / num_grade;
                   //cast: tells java to turn an int into a double

        //display to console
        System.out.printf("Average equals %.2f", average);
    }
}
