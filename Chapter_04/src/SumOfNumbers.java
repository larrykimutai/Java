/*
   Author: Larry Langat
   Date: September 27, 2018
   Purpose: To read input from user and write to output file.
*/

import javax.swing.*;
public class SumOfNumbers {
    public static void main(String [] args){
        int num;
        int sum;

        num = userInput();
        sum = sumofnumbers(num);
        display(num,sum);
    }
    private static int userInput(){
        String input = JOptionPane.showInputDialog
                ("Enter a a positive nonzero integer value:");
        return Integer.parseInt(input);
    }
    private static int sumofnumbers(int number) {
        int num = 1;
        for (int cntr = 0; cntr < number; cntr++) {
            num += cntr;
        }
        return num;
    }
    private static void display(int num, int sum){
        JOptionPane.showMessageDialog
                (null, "Sum of !" + num + " is " + sum);
    }
}
