import javax.swing.*;
/*
   Author: Larry Langat
   Date: November 15, 2018
   Purpose: Get number of grades and return average
   of those tests and letter grade. As well as
   demonstrate the use of catching exceptions.
*/
public class LangatTestScoresDemo {
  public static void main(String[] args){
    //get number of grade
    int numGrades = InputNumScore();
    //create grade array with "numGrades" number of elements
    double []grades = storeGrades(numGrades);
    //create object
    LangatTestScores TestScores = new LangatTestScores(grades);
    //display to console
    DisplayToConsole(TestScores);
  }

  private static void DisplayToConsole(LangatTestScores score){
    System.out.printf
            ("Average Grade: %,.2f" + "\nLetter Grade: "
                    + score.getGrade(),score.getAverage());
  }

  private static double[] storeGrades(int numGrades){
    //create grade[] array
    double grade[] = new double[numGrades];
    //ask for grade and store to grade[] array
    for(int i = 0; i < numGrades; i++){
      grade[i] = AskForGrade();
    }
    return grade;
    }

  private static int InputNumScore(){
    int grade = 0;
    boolean test;
    boolean test2;
    //repeat loop until all exceptions are overwritten
    do{
      try{
        //ask for user input
        String input = JOptionPane.showInputDialog
            ("Number of Grades: ");
        grade = Integer.parseInt(input);
        test = true;
        //catch all exceptions that are non-integer
    } catch(NumberFormatException e ) {
        JOptionPane.showMessageDialog
                (null,"Please enter an integer number.");
        test = false;
      }
      test2 = validate2(grade);
      //repeat until exception is fixed
    }while(!test || !test2);
    return grade;
  }

  private static boolean validate2(int grade){
    boolean test = true;
    //validate if number of grades to be entered is between 1 and 15.
    try{
      if(grade <= 0 || grade > 15)throw new Exception();
    }catch (Exception a){
      //catch all exceptions greater than 15 and less than 1
      JOptionPane.showMessageDialog
              (null,"Please enter a number between 1 - 15!!");
      test = false;
    }
    return test;
  }

  private static boolean validate(double grade){
    boolean test;
    //validate grade to be within 0 and 1000
    try{
      if(grade < 0.0 || grade > 100.0)throw new Exception();
      test = true;
      //catch all grades outside of 0-100
    }catch (Exception a){
      JOptionPane.showMessageDialog
              (null,"Please enter a number between 0 - 100!");
      test = false;
    }
    return test;
  }

  private static double AskForGrade(){
    double score = 0.0;
    boolean test;
    boolean test2;
    do{
      //validate grade against exceptions
      try {
        //get user input
        String input = JOptionPane.showInputDialog
                ("Enter Grade between 0 - 100: ");
        score = Double.parseDouble(input);
        test = true;
        //catch all non - digit exceptions
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog
                (null,"Please enter a number.");
        test = false;
      }
      //validate score to make sure its between 0 and 100
      test2 = validate(score);
    } while(!test2 || !test);
    return score;
  }
}
