/*
   Author: Larry Langat
   Date: September 18, 2018
   Purpose: To read input from user and write to output file.
*/
import java.util.Scanner;
import java.io.*;
public class LangatWriteToFile {
    public static void main(String[] args) throws IOException //if there's a problem, it
                                                              //will give this specific error.
    {
        //variables
        String file_name,  //output file name
               input_line; //individual line of input from user
        int    num_items; //number of input to ask from the user

        //instantiate Scanner object
        Scanner in = new Scanner (System.in);

        //get filename from user
        System.out.println("What is the name of the file?");
        file_name = in.nextLine();

        //create and open the output file
        PrintWriter output = new PrintWriter (file_name);

        //ask user for number of grades
        System.out.println("How many grades will you enter?");
        num_items = in.nextInt();
        in.nextLine(); //moves cursor to the next line

        for (int i = 1; i <= num_items; i++) {
            System.out.println("Enter Grade number " + i);
            input_line = in.nextLine(); //read from keyboard
            output.println(input_line); //write to file
        }

        //trouble shooting
        System.out.println("My file name is " + file_name);
        System.out.println("I asked for " + num_items + " names.");

        output.close();
    }
}
