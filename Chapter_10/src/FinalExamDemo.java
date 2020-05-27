import javax.swing.*;

public class FinalExamDemo {
    public static void main(String[] args){
        String input;
        int questions;
        int missed;

        //get number of questions on exam
        input = JOptionPane.showInputDialog
                ("How many questions are on the final exam? ");
        questions = Integer.parseInt(input);

        //get the number of quest the student missed
        input = JOptionPane.showInputDialog
                ("How many questions did the student miss? ");
        missed = Integer.parseInt(input);

        //create a FinalExam object named exam
        FinalExam exam = new FinalExam(questions, missed);

        //display the test results
        JOptionPane.showMessageDialog
                (null,"Each question counts " +
                        exam.getPointsEach()+ "points. \nThe exam score is " +
                        exam.getScore()+ "\nThe exam grade is " +
                        "" + exam.getGrade());
        System.exit(0);
    }
}
