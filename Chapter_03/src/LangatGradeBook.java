/*
   Author: Larry Langat
   Date: September 4, 2018
   Purpose: Create a grade book, calculate average and output letter grade.
*/
import javax.swing.JOptionPane;
public class LangatGradeBook {
    public static void main(String[] args){
        //variables
        String input;
        int grade1, grade2, grade3;
        double grade;
        char letter;

        //ask for grade
        grade1 = askUserInput();
        grade2 = askUserInput();
        grade3 = askUserInput();
        
        //calculate average
        grade = (grade1 + grade2 + grade3)/3;

        //determine letter grade
        if(grade >= 90)
            letter = 'A';
        else if (grade >= 80) {
            letter = 'B';}
        else if (grade >= 70){
            letter = 'C';}
        else if (grade >= 60){
            letter = 'D';}
        else {
            letter = 'F';}

        //print to console
        System.out.printf("Your average grade was : %.2f \n", grade);
        System.out.println("Your letter grade was  : " + letter);

    }
    private static int askUserInput(){
        String input = JOptionPane.showInputDialog
                ("Grade1: ");
        return Integer.parseInt(input);
    }
}
