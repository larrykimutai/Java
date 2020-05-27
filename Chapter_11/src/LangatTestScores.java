/*
   Author: Larry Langat
   Date: November 15, 2018
   Purpose: create a class that accepts array of scores,
   and returns average of test scores.
*/
public class LangatTestScores {
  //fields
  private double[] Scores;

  //constructor
  public LangatTestScores(double[] scores){
    Scores = new double[scores.length];
    for(int i = 0; i < scores.length; i++){
      Scores[i] = scores[i];
    }
  }

  //default constructor
  public LangatTestScores(){
    Scores = new double[0];
  }

  //set score
  public void setScores(double scores[]){
    Scores = new double[scores.length];
    for(int i = 0; i < scores.length; i++){
      Scores[i] = scores[i];
    }
  }

  //get average and letter grade
  public double getAverage(){
    double total = 0.0;
    for(int i = 0; i < Scores.length; i++){
      total += Scores[i];
    }
    return total / Scores.length;
    }

  public char getGrade(){
    char letterGrade;
    if(getAverage() >= 90)
      letterGrade = 'A';
    else if(getAverage() >= 80)
      letterGrade = 'B';
    else if(getAverage() >= 70)
      letterGrade = 'C';
    else if(getAverage() >= 60)
      letterGrade = 'D';
    else
      letterGrade = 'F';

    return letterGrade;
  }
}

