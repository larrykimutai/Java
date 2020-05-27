/*
   Author: Larry Langat
   Date: September 11, 2018
   Purpose: To calculate square numbers using a while loop.
*/
import javax.swing.JOptionPane;
public class LangatWhileLoop {
    public static void main(String[] args) {
        //variables
        int     my_num,
                square_num,
                counter = 1;
        String in;

        //ask user input
        in = JOptionPane.showInputDialog
                ("Enter number between 1-10");
        my_num = Integer.parseInt(in);

        //calculate sqr num up to given num
        while (counter <= my_num) /*boolean value*/ {
            square_num = counter * counter;
            System.out.println("The square of " +
                    counter + " is " + square_num);
            counter ++;
        }
    }
}
