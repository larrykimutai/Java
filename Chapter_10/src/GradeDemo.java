import javax.swing.*;

public class GradeDemo {
    public static void main(String[] args){
        String input;       //To hold input
        double testScore;   //A test score

        //create a GradeActivity object called grade
        GradedActivity grade = new GradedActivity();

        //Get a test score
        input = JOptionPane.showInputDialog
                ("Enter a numeric test score: ");
        testScore = Integer.parseInt(input);

        //Store the score in the grade object
        grade.setScore(testScore);

        //display the letter grade for the score.
        JOptionPane.showMessageDialog
                (null,"The grade is " +
                        grade.getGrade());
        System.exit(0);
        }
}
