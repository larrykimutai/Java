/*
   Author: Larry Langat
   Date: September 20, 2018
   Purpose: to use a method to calculate letter grade
*/

import java.util.Scanner;

public class LangatLetterGrade {
    public static void main(String[] args){
        //variables
        double grade1, grade2, grade3;
        double average;
        char letter;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade 1");
        grade1 = input.nextDouble();
        input.nextLine();

        System.out.println("Enter grade 2");
        grade2 = input.nextDouble();
        input.nextLine();

        System.out.println("Enter grade 3");
        grade3 = input.nextDouble();
        input.nextLine();

        average = cal_average(grade1, grade2, grade3);
        //System.out.printf("Average is %.2f \n", average);

        letter = letter_grade(average);
        //System.out.println("Your letter grade is " + letter);

        display_results(average, letter);

    }
    private static double cal_average (double x, double y, double z) {
        return (x + y + z)/3.0;

    }
    private static char letter_grade (double avg) {
        if (avg >= 90)
            return 'A';
        else if (avg >= 80)
            return 'B';
        else if (avg >= 70)
            return 'C';
        else if (avg >= 60)
            return 'D';
        else
            return 'F';
        }
        private static void display_results(double avg, char letter) {
            System.out.printf("Average is %.2f \n", avg);
            System.out.println("Your letter grade is " + letter);
        }
    }
