/*
   Author: Larry Langat
   Date: September 5, 2018
   Purpose: Program that displays time traveled based on speed and medium.
*/
import javax.swing.JOptionPane;

public class LangatTheSpeedOfSound {
    public static void main(String[] args) {
        //variables
        final double  air = 1100,     //feet per second
                      water = 4900,   //feet per second
                      steel = 16400;  //feet per second
        double  distance,
                time;
        String in, medium;

        //ask user for input
        in = JOptionPane.showInputDialog
                ("Pick one of the following: Water, Air, Steel");
        medium = in.toLowerCase();

        in =JOptionPane.showInputDialog
                ("Enter distance traveled (ft): ");
        distance = Double.parseDouble(in);

        //perform calculation and print to console (if-else-if)
        if (medium.equals("air") || medium.equals("Air")) {            //using || to ignore case
            time = distance / air;
            System.out.printf("It will take sound %,.2f seconds " +
                    "to travel through " + medium + ".", time);
        }
        else if (medium.equalsIgnoreCase("water")) {       //using .equalsIgnoreCase  to ignore case
            time = distance / water;
            System.out.printf("It will take sound %,.2f seconds " +
                    "to travel through " + medium + ".", time);
        }
        else if (medium.equalsIgnoreCase("steel")) {       //using .equalsIgnoreCase  to ignore case
            time = distance / steel;
            System.out.printf("It will take sound %,.2f seconds " +
                    "to travel through " + medium + ".", time);
        }
        else {JOptionPane.showMessageDialog
                (null,"Check spelling and try again.");
        }
    }
}
