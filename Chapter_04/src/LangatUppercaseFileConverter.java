/*
   Author: Larry Langat
   Date: September 21, 2018
   Purpose: Change data in one file and write to another file
*/
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

public class LangatUppercaseFileConverter {
    public static void main(String [] args) throws IOException {
        //variables
        String  input,
                input_file,
                output_file,
                input_line,
                uppercase,
                name,
                date;

        //ask user for name and date
        input = JOptionPane.showInputDialog
                ("What is your name ?");
        name = input;
        input = JOptionPane.showInputDialog
                ("What is today's date ?");
        date = input;

        //ask for file to read data from
        input = JOptionPane.showInputDialog
                ("Enter the name of the file with the data to edit");
        input_file = input;

        //open file
        File my_file = new File (input_file);
        Scanner file_input = new Scanner(my_file);

        //ask for file to write edited data on
        input = JOptionPane.showInputDialog
                ("Enter the name to save edited data on");
        output_file = input;

        //add name top
        FileWriter name_1 = new FileWriter(output_file,true);
        PrintWriter outfile = new PrintWriter(name_1);
        outfile.println(name + "\n");

        //close scanner object
        outfile.close();

        //read from file and change to upper case
        while (file_input.hasNext()){
            input_line = file_input.nextLine();
            uppercase = input_line.toUpperCase();

            //write to file with name given by user
            FileWriter writer = new FileWriter(output_file,true);

            //create output file with the uppercase words
            PrintWriter outputFile = new PrintWriter(writer);
            outputFile.println(uppercase);

            //close scanner object
            outputFile.close();
        }

        //add date to bottom
        FileWriter date_1 = new FileWriter(output_file,true);
        PrintWriter outFile = new PrintWriter(date_1);
        outFile.println("\n" + date);

        //close scanner object
        outFile.close();
        outfile.close();
        file_input.close();

        //acknowledge that it worked
        JOptionPane.showMessageDialog
                (null,"Your file has been saved under the name " + output_file);
    }
}
