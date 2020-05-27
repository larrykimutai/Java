/*
   Author: Larry Langat
   Date: October 2, 2018
   Purpose: this demo program gets a Fahrenheit value form user
            and converts it to Celsius and Kelvin.
*/
import javax.swing.JOptionPane;
public class LangatTemperatureDemo {
    public static void main(String [] args) {
        //variables
        double myTemp;

        //create MyTemperature object with default settings
        LangatTemperature MyTemperature =
                new LangatTemperature();

        //call methods to display Fah, Cel, Kel
        displayalltempts(MyTemperature);

        //do-while loop
        //ask user for a F temp. convert
        //display Fah, Cel, Kel
        //Ask user if they want to convert another
        do {
            myTemp = requestTemp();
            MyTemperature.setfTemp(myTemp);
            displayalltempts(MyTemperature);

        }   while (anotherrun());
    }
    private static void displayalltempts(LangatTemperature t/*displaying the object*/){
        System.out.printf("Fahrenheit: %,.2f\n", t.getfTemp());
        System.out.printf("Celcius: %,.2f\n", t.calcCTemp());
        System.out.printf("Kelvin: %,.2f\n\n", t.calcKTemp());
    }
    private static double requestTemp () {
        String input = JOptionPane.showInputDialog
                ("Give me a temperature in F: ");
       return Double.parseDouble(input);
    }

    private static boolean anotherrun(){
        String in = JOptionPane.showInputDialog
                ("Do you want to convert another number?\n" +
                        " 1 - Yes                2 - No");
        int again = Integer.parseInt(in);

        while (again <1 || again >2){
            in = JOptionPane.showInputDialog
                    ("Please enter either 1 for Yes or 2 for No!!");
            again = Integer.parseInt(in);
        }

       if (again == 1){
           return true;
       }
       else {JOptionPane.showMessageDialog
               (null,"Thank You!!");
       return false;
        }
    }
}
