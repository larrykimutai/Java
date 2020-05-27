public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     The constructor sets the number of questions on the
     exam and the number of the questions missed.
     @param questions The number of questions.
     @param missed The number of questions missed.
     */

    public FinalExam(int questions, int missed){
        double numericScore;

        //Set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;

        //calculate the points for each question and
        //the numeric score for this exam.
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        //Call the inherited setScore method to
        //set the numeric score.
        setScore(numericScore);
    }

    /**
     The getPointsEach method returns the number of
     points each question is worth.
     @return The value in the pointsEach field.
     */

    public double getPointsEach(){
        return pointsEach;
    }

    /**
     The getNumMissed method returns the number of
     questions missed.
     @return The value in the numMissed field.
     */

    public int getNumMissed(){
        return numMissed;
    }
}

