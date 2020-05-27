/*
   Author: Larry Langat
   Date: September 5, 2018
   Purpose: Program that displays time traveled based on speed and medium.
*/
import javax.swing.JOptionPane;
public class Langat_The_Speed_Of_Sound {
    public static void main(String[] args) {
        //variables
        final double  air = 1100,     //feet per second
                    water = 4900,     //feet per second
                    steel = 16400;    //feet per second
        double  distance,
                time;
        String  in,
                medium;

        //ask user for input
        in = JOptionPane.showInputDialog
                ("Pick one of the following: Water, Air, Steel");
        medium = in.toLowerCase();

        in =JOptionPane.showInputDialog
                ("Enter distance traveled (ft): ");
        distance = Double.parseDouble(in);

        //perform calculation and print to console (switch)
        switch(medium){
            case "air":
                time = distance / air;
                System.out.printf("It will take sound %,.2f", time);
                System.out.println(" seconds to travel through " + medium + ".");
                break;
            case "water":
                time = distance / water;
                System.out.printf("It will take sound %,.2f", time);
                System.out.println(" seconds to travel through " + medium + ".");
                break;
            case "steel":
                time = distance / steel;
                System.out.printf("It will take sound %,.2f", time);
                System.out.println(" seconds to travel through " + medium + ".");
                break;
            default: JOptionPane.showMessageDialog
                    (null,"Check spelling and try again.");
        }
    }

}
