/*
   Author: Larry Langat
   Date: September 4, 2018
   Purpose: Determine if user qualifies for a loan
*/
import javax.swing.JOptionPane;
public class LangatLoanApplication {
    public static void main(String[] args){
        //variables
        String input, output;
        int num_years;
        double month_salary, annual_salary;
        boolean qualified ;

        //ask years worked
        input = JOptionPane.showInputDialog
                ("How many years have you been working at current employer");
        num_years = Integer.parseInt(input);

        //ask monthly salary
        input = JOptionPane.showInputDialog
                ("How much do you make per month");
        month_salary = Double.parseDouble
                (input);

        //calculate yearly salary
        annual_salary = month_salary * 12;


        //display if qualified or not

        //checks both values at the same time
        if(num_years >= 3 && annual_salary > 48000)
            qualified = true;
        else qualified = false;

        //display years and salary to message box
        output = "Years on job: " + num_years + "\n";
        output = output + "Annual salary: ";
        output = String.format(output + "$%,.2f", annual_salary);
        JOptionPane.showMessageDialog
                (null, output);

        if (qualified){
        System.out.println("You Qualified!");
        }
        else {System.out.println("You did not qualify!");}

    }
}
