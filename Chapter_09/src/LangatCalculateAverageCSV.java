import javax.swing.*;
import java.util.Scanner;

/**
 * Calculate an average and assign letter grade
 * to a comma separated value file.
 */
public class LangatCalculateAverageCSV {
    public static void main(String[] args) {
        //variables
        String input, grades;
        int total = 0;
        double average;
        Scanner keyboard = new Scanner(System.in);

        //read set of grades from user
        System.out.println("What is the student's name? " );
        keyboard.nextLine();

        System.out.println("Enter grades separated by commas, no spaces");
        //accepting this from user: 88,45,78,89,90

        grades = keyboard.nextLine();

        //tokenize the grades into an array
        String[] tokens = grades.split(",");

        //calculate grades average
        for(String str : tokens){
            total += Integer.parseInt(str);
        }
        average = (double)total / tokens.length;
        char letterGrade = determinLetterGrade(average);
        displayResults(average, letterGrade);
    }

    private static char determinLetterGrade(double avg){
        char [] letters = {'A', 'B', 'C', 'D', 'F'};
        double [] grades = {90.0, 80.0, 70.0, 60.0, 0.0};

        for(int i = 0; i < grades.length; i++){
            if (avg >= grades[i]){
                return letters[i];
            }
        }
        return 'E'; //trouble shooting
    }

    private static void displayResults(double avg, char letter){
        System.out.printf("Student average: %.2f %n", avg);
        System.out.println();
        System.out.println("Letter grade: " + letter);
    }
}
