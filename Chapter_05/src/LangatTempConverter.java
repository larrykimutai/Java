/*
   Author: Larry Langat
   Date: September 20, 2018
   Purpose: write code that converts from fahrenheit and celsius and vice versa
*/
import java.util.Scanner;
public class LangatTempConverter {
    public static void main(String [] args){
        //variables
        double C, F;
        double c,f;
        Scanner input = new Scanner(System.in);

        //ask user for fahrenheit temperature
        System.out.println("Give me a temperature in Fahrenheit");
        F = input.nextDouble();
        input.nextLine();

        //ask user for celsius temperature
        System.out.println("Give me a temperature in Celsius");
        C = input.nextDouble();
        input.nextLine();

        //call method to convert F to C
        f = convertFtoC(F);

        //call method to convert C to F
        c = convertCtoF(C);

        //display the converted temp. in C
        System.out.printf
                ("%.1f degrees F equals %.1f degrees C\n",F,f);

        //display the converted temp. in F
        System.out.printf
                ("%.1f degrees C equals %.1f degrees F",C,c);
    }
    private static double convertFtoC (double f) {
       return (f-32)*(5.0/9.0);
    }
    private static double convertCtoF (double c) {
        return (c*(9/5)) + 32;
    }
}
