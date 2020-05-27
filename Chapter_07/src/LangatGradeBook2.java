/*
   Author: Larry Langat
   Date: October 18, 2018
   Purpose: create Student class that creates objects of students
*/
public class LangatGradeBook2 {
    //create fields
    private String[] StudentName;
    private double[] StudentScore;

    //create constructors for student score
    public LangatGradeBook2(double StudentScoreInfo[]){
        StudentScore = new double[StudentScoreInfo.length];
    }

    //create default constructor
    public LangatGradeBook2(){
        int defaultname = 5, defaultscore = 4;

        StudentScore = new double[defaultscore];
        StudentName = new String[defaultname];
    }

    //create constructor for student name
    public LangatGradeBook2(String name[]){
        StudentName = name;
    }

    //create set name method
    public void setStudentName(String studentname[]){
        StudentName = studentname;
    }
    //create get name method
    public String getStudentName(int i){
        return StudentName[i];
    }


    //create get average grade method
    public double getAverage(double score[]){
        //store student score into elemets

        for (int i = 0; i < StudentScore.length; i++){
            StudentScore[i] = score[i];
        }
        //calculate average
        int total = 0;
        for(int i = 0; i < StudentScore.length; i++){
            total += StudentScore[i];
        }
        return total/(double)StudentScore.length;
    }

    public char getLetterGrade(double avg){
        if (avg >= 90 && avg <= 100){
            return 'A';
        }
        if (avg >= 80 && avg <= 89){
            return 'B';
        }
        if (avg >= 70 && avg <= 79){
            return 'C';
        }
        if (avg >= 60 && avg <= 69){
            return 'D';
        }
        else return 'F';
    }
}

