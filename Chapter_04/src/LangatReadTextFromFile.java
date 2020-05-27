/*
   Author: Larry Langat
   Date: September 5, 2018
   Purpose: read text from file and change case
*/
import java.util.Scanner;
import java.io.*;

public class LangatReadTextFromFile {
    public static void main(String [] args) throws IOException {
        //variables
        String input_file, input_line, allcaps;
        Scanner in = new Scanner (System.in);
        String name = "Larry";

        int[] numArray = new int[name.length()];
        System.out.print("Hello");

        //ask user for file from which to read data
        System.out.println("What is your input file?");
        input_file = in.nextLine();

        //open the input file
        File myFile = new File (input_file);
        Scanner input = new Scanner (myFile);

        //read names from line
        while (input.hasNext()){
            input_line = input.nextLine();
            allcaps = input_line.toUpperCase();
            System.out.println(input_line + " " + allcaps);
        }


        //close both Scanner objects
        in.close();
        input.close();
    }
}

