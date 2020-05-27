import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
   Author: Larry Langat
   Date: October 18, 2018
   Purpose: test LangatGradeBook class and print results to console

   This codes sends an array of grades to the LangatGradeBook class to calculate
   the average, rather than sending each individual grade like in my LangatGradeBookDemo
   program.
*/
public class LangatGradeBookDemo2 {
    public static void main(String[] args) throws IOException {
        //variables
        String  input;
        Scanner fileInput;

        //ask for user input
        input = getFileName();

        //open user file
        fileInput = openFile(input);

        //calculate average and letter grade from file input
        calculateEverything(fileInput);

        fileInput.close();

    }

    public static String getFileName() {
        //ask user name of file
        String input = JOptionPane.showInputDialog
                ("Enter File Name: ");
        return input;
    }
    public static void calculateEverything(Scanner Fileinput){
        //variables
        double  StudentGrade[];
        StudentGrade = new double[4];

        //create loop that will read everything from beginning to end
        while (Fileinput.hasNext()) {
            for(int i = 0; i < 5; i++) {
                //create StudentName[] array
                String StudentName[] = new String[5];
                String name;

                //read Name from file
                name = readFromFile(Fileinput);
                StudentName[i] = name;

                //create stu object for student names
                LangatGradeBook2 stu = new LangatGradeBook2(StudentName);

                //read grades from file and store grades from file to elements
                storeGradesToArray(Fileinput, StudentGrade);

                //create student object
                LangatGradeBook2 student = new LangatGradeBook2(StudentGrade);

                //get student name
                System.out.println(stu.getStudentName(i));

                //calculate average
                double avg = calculateAverage(student, StudentGrade);

                //calculate letter grade
                calculateLetterGrade(student, avg);

            }
        }
    }
    public static Scanner openFile(String input)throws IOException{
        File inputFile = new File (input);
        Scanner Fileinput = new Scanner (inputFile);
        return Fileinput;
    }
    public static void storeGradesToArray(Scanner fileIn, double stuGrade[]){
        //read grades from file and store grades from file to elements
        for (int index = 0; index < 4; index++) {
            String input = fileIn.nextLine();
            double inStudentGrade = Double.parseDouble(input);
            stuGrade[index] = inStudentGrade;
        }
    }
    public static String readFromFile(Scanner Fileinput){
        //read Name from file
        String inStudentName = Fileinput.nextLine();
        return inStudentName;
        //System.out.print(inStudentName + "\t");


    }
    public static double calculateAverage(LangatGradeBook2 stu, double stugrde[]){
        //calculate average
        double average = stu.getAverage(stugrde);
        System.out.printf("%.2f \t",average);
        return average;
    }
    public static void calculateLetterGrade(LangatGradeBook2 stu, double avg){
        //calculate letter grade
        System.out.println(stu.getLetterGrade(avg));
        System.out.println();
    }

}

