/*
   Author: Larry Langat
   Date: August 23, 2018
   Purpose: To print my name age and annual income.
*/
import javax.swing.JOptionPane;

public class LangatNameAgeAnualIncom {
        public static void main (String[] args) {

            //creates variables and stores information in given format.
            String name, input_String;
            int age;
            double annualPay;

            //ask for name
            input_String = JOptionPane.showInputDialog
                    ("What is your name ?");
            name = input_String;

            //ask for age
            input_String = JOptionPane.showInputDialog
                    ("How old are you ?");
            age = Integer.parseInt (input_String);

            //ask for annual pay
            input_String = JOptionPane.showInputDialog
                    ("How much do you wish to make ?");
            annualPay = Double.parseDouble(input_String);

            //out put a thank you dialog box
            JOptionPane.showMessageDialog
                    (null, "If the following information is accurate, press okay: \n" +
                           "Name:" + name + "\n" + "Age: " + age + "\n" + "Desired Income: $"+ annualPay );


            //display stored information
            System.out.print("My name is " + name);
            System.out.println(", my age is " + age + " and ");
            System.out.println("I hope to earn $" + annualPay + " per year.");
        }
}
