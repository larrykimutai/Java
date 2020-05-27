/*
   Author: Larry Langat
   Date: September 5, 2018
   Purpose: Program that displays a users average score and numeric grade.
*/
import javax.swing.JOptionPane;
public class LangatTestScoresAndGrades {
    public static void main(String[] args){
        //variables
        double test1, test2, test3;
        double average;

        //ask user to enter grades
        test1 = askUserInput1();
        test2 = askUserInput2();
        test3 = askUserInput3();

        //calculate average grade
        average = calculateAverage(test1, test2, test3);

        //assign letter grade and print numerical and letter grade to console
        getGrades(average);

    }
    private static double askUserInput1(){
        String input;
        input = JOptionPane.showInputDialog("Grade 1: ");
        return Integer.parseInt(input);
    }
    private static int askUserInput2(){
        String input;
        input = JOptionPane.showInputDialog("Grade 2: ");
        return Integer.parseInt(input);
    }
    private static int askUserInput3(){
        String input;
        input = JOptionPane.showInputDialog("Grade 3: ");
        return Integer.parseInt(input);
    }
    private static double calculateAverage(double a, double b, double c){
        return (a + b + c)/3;
    }
    private static void getGrades(double average){
        char grade;
        if (average >= 90 && average <= 100) {
            grade = 'A';
            System.out.printf
                    ("Average grade: %.2f", average);
            System.out.println("\nLetter Grade: " + grade);
        }
        else if (average >= 80 && average <= 89) {
            grade = 'B';
            System.out.printf
                    ("Average grade: %.2f", average);
            System.out.println("\nLetter Grade: " + grade);
        }
        else if (average >= 70 && average <= 79) {
            grade = 'C';
            System.out.printf
                    ("Average grade: %.2f", average);
            System.out.println("\nLetter Grade: " + grade);
        }
        else if (average >= 60 && average <= 69) {
            grade = 'D';
            System.out.printf
                    ("Average grade: %.2f", average);
            System.out.println("\nLetter Grade: " + grade);
        }
        else if (average >= 0 && average <= 69) {
            grade = 'F';
            System.out.printf
                    ("Average grade: %.2f", average);
            System.out.println("\nLetter Grade: " + grade);
        }
    }
}

