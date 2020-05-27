/*
   Author: Larry Langat
   Date: September 20, 2018
   Purpose: write a method that doubles the given number
*/
import javax.swing.JOptionPane;

public class LangatDoubleNumbers {
    public static void main(String[] args){
        //variables
        int my_int, my_bigint;
        int larry_num, larry_bignum;
        String in;

        //ask user for integer
        in = JOptionPane.showInputDialog
                ("Give me an integer please");
        my_int = Integer.parseInt(in);

        //print original integer and its double
        my_bigint = double_my_number(my_int);
        System.out.println(my_int + " doubled equals " + my_bigint);

        //ask user for integer
        in = JOptionPane.showInputDialog
                ("Give me an integer please");
        larry_num = Integer.parseInt(in);

        //print original integer and its double
        larry_bignum = double_my_number(my_int);
        System.out.println(larry_num + " doubled equals " + larry_bignum);
    }

    private static int double_my_number(int num) {
        return num *2;
    }
}
