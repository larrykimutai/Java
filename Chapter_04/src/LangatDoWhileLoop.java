/*
   Author: Larry Langat
   Date: September 5, 2018
   Purpose: To calculate the triple of a number using a do-while loop.
*/
import javax.swing.JOptionPane;
public class LangatDoWhileLoop {
    public static void main(String[] args) {
        //variables
        int my_num, triple;
        String in, quit;

        do {
            in = JOptionPane.showInputDialog
                    ("Enter number between 1-10");
            my_num = Integer.parseInt(in);
            triple = my_num * 3;
            System.out.println(my_num + " tripled equals " + triple);

            in = JOptionPane.showInputDialog
                    ("Do you want to input another number ? (Y or N)");
            quit = in.toUpperCase();
        } while (quit.equals("Y"));
        //while (my_num >0 && my_num < 11);


    }
}
