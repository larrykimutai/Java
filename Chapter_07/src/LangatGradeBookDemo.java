import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
   Author: Larry Langat
   Date: October 18, 2018
   Purpose: test LangatGradeBook class and print results to console

   This code sends the individual grades to the LangatGradeBook class
   to calculate average, rather than sending an array of grades like in my
   other LangatGradeBookDemo2 program.
*/
public class LangatGradeBookDemo {
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
            //for(int i = 0; i < 5; i++)
              int i = 0;
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
                LangatGradeBook student = new LangatGradeBook(StudentGrade);

                //get student name
                System.out.println(stu.getStudentName(i));

                //calculate average
                double avg = calculateAverage(student, StudentGrade);

                //calculate letter grade
                calculateLetterGrade(student, avg);
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
    public static double calculateAverage(LangatGradeBook stu, double stugrde[]){
        //calculate average
        double studentgrade1 = stugrde[0];
        double studentgrade2 = stugrde[1];
        double studentgrade3 = stugrde[2];
        double studentgrade4 = stugrde[3];
        double average = stu.getAverage(studentgrade1, studentgrade2, studentgrade3, studentgrade4);
        System.out.printf("%.2f \t",average);
        return average;
    }
    public static void calculateLetterGrade(LangatGradeBook stu, double avg){
        //calculate letter grade
        System.out.println(stu.getLetterGrade(avg));
        System.out.println();
    }

}
