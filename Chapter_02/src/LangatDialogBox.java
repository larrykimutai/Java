/*
    Author: Larry Langat
    Date: August 30, 2018
    Purpose: To us dialog box in user input.
 */
import javax.swing.JOptionPane;

public class LangatDialogBox {
    public static void main(String[] args) {
        //variables
        String name, input_String;
        double wage, gross_pay;
        int hrs;

        //get user's input
        input_String = JOptionPane.showInputDialog
                ("What is your name ?");
        name = input_String;

        //ask for number of hrs
        input_String = JOptionPane.showInputDialog
                ("How many hours did you work this week ?");
        hrs = Integer.parseInt(input_String);

        //ask for hourly wage
        input_String = JOptionPane.showInputDialog
                ("How much do you make per hour ?");
        wage = Double.parseDouble(input_String);

        JOptionPane.showMessageDialog(null, "I have all the info i Need, Thanks " + name + "!");

        //calculate gross pay
        gross_pay = wage * hrs;

        //display to console
        System.out.println("My name is " + name);
        System.out.println("My gross pay is $" + gross_pay);
    }
}
