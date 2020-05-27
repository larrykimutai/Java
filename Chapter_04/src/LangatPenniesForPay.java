/*
   Author: Larry Langat
   Date: September 17, 2018
   Purpose: calculate amount of money earned each day when salary is double per day.
*/
import javax.swing.JOptionPane;

public class LangatPenniesForPay {
    public static void main(String[] args){
        //variables
        double  total = .01,
                money = .01,
                day_1 = 1,
                day;
        String  in;

        //get user input
        in = JOptionPane.showInputDialog
                ("Enter a day between day 1 and day 30");
        day = Double.parseDouble(in);

        //create error dialog box if number is not within range
        while (day < 1.0 || day > 30.0) {
            JOptionPane.showMessageDialog
                    (null, "ERROR!!! Number is not between 1 and 30");
            in = JOptionPane.showInputDialog
                    ("Please enter a day between 1 and 30");
            day = Double.parseDouble(in);


        }

        //print out header for table
        System.out.println("Day   | Daily Salary   | Total Salary");
        System.out.println("_________________________________");

        //create loop for daily salary and total salary.
        while (day > 0){
            System.out.printf("%-3.0f   | $%,-13.2f | $%,-13.2f \n",day_1, money, total);
            money = money *2;
            total = total + money;
            day_1++;
            day--;
        }
        //display total earned on day picked in dialog box
        JOptionPane.showMessageDialog
                (null,
                        String.format("The total amount at day " +
                                (int)(day_1 - 1) + " is $%,-13.2f ", ((total/2)-.0001) ));

    }
}
