/*
   Author: Larry Langat
   Date: October 18, 2018
   Purpose: create Student class that creates objects of students
*/
public class LangatGradeBook {
    //create fields
    private String[] StudentName;
    private double[] StudentScore;

    //create constructors for student score
    public LangatGradeBook(double StudentScoreInfo[]){
        StudentScore = new double[StudentScoreInfo.length];
    }

    //create default constructor
    public LangatGradeBook(){
        int defaultname = 5, defaultscore = 4;

        StudentScore = new double[defaultscore];
        StudentName = new String[defaultname];
    }


    //create constructor for student name
    public LangatGradeBook(String name[]){
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
    public double getAverage(double s1, double s2, double s3, double s4){
        return (s1 + s2 + s3 + s4) / 4;
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

