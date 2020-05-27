/*
   Author: Larry Langat
   Date: September 5, 2018
   Purpose: Read from data file and calculate average grade
*/
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class LangatReadFromFile {
    public static void main(String [] args) throws IOException {
        //variables
        String input_file;
        int grade, cntr = 0, total = 0;
        double average;
        Scanner in = new Scanner (System.in);

        //ask user for file from which to read data
        System.out.println("What is your input file?");
        input_file = in.nextLine();

        //open the input file
        File myFile = new File (input_file);
        Scanner input = new Scanner (myFile);

        //read numbers from file
        while (input.hasNext()) {
            grade = input.nextInt();    //reads the next int
            input.nextLine();           //skips to next line

            System.out.println("My grade is " + grade);
            total += grade;  //total = total + grade;
            cntr++;
            System.out.println("This grade is " + grade);
            System.out.println(" Counter at this point is " + cntr);
        }

        //calculate and print the average
        average = (double)total/cntr;
        System.out.printf("Your average is %.2f ", average);

        //close both Scanner objects
        in.close();
        input.close();
    }
}
