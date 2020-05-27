import java.util.Scanner;

/*
   Author: Larry Langat
   Date: October 16, 2018
   Purpose: display highest and lowest temp for week
*/
public class LangatWeatherReport {
    public static void main(String[] args){
        //variables
        String[] weekdays = {"Monday","Tuesday","Wednesday",
                            "Thursday","Friday","Saturday", "Sunday"};
        Scanner input = new Scanner (System.in);
        int[] temps;
        int numDays;

        //get number of days from user
        System.out.println("How many days do you want to enter? (1-7)");
        numDays = input.nextInt();

        //data validation
        while(numDays < 1 || numDays > 7){
            System.out.println("Please enter number between 1-7");
            numDays = input.nextInt();
        }

        //initialize temp array
        temps = new int[numDays];

        //get specified number of temps from user
        for (double te: temps){
            System.out.println("What was the temperature on " + te);
        }
        //for(int i =0; i < temps.length; i++){
        //    System.out.println("What was the temperature on " + weekdays[i]);
        //}

        //find the highest value
        /*
        go through each element of temps and if current element being
        tested is greater than last value stored into rain(first initialized to be that [0]
        element of temps array), then store current value into rain.
         */
        double rain = temps[0];

        for(int i = 0; i < temps.length; i++){
            if (temps[i] > rain){
                rain = temps[i];
            }
        }
    }
}
