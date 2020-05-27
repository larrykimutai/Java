import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LangatOpenFile {
  public static void main(String[] args) throws IOException{
    //varibles
    File file;
    Scanner inputFile;
    String fileName;
    boolean fileFound = false;

    //get filename from user
    fileName = JOptionPane.showInputDialog
            ("Enter name of file: ");

    //attempt to open the file
    file = new File(fileName);
    inputFile = new Scanner (file);
    try{
      file = new File(fileName);
      inputFile = new Scanner (file);
      System.out.println
            ("The file \'\'" + fileName + "\'\' was found." );
      //fileFound = true;

      while(inputFile.hasNext()){
        System.out.println("While Loop");
        //get names
        String name = getName(inputFile);

        //get scores
        double average = getScores(inputFile);

        //letter grade
        char grade = setLetterGrade(average);
        fileFound = false;

        //print to console
        System.out.printf
                ("\nClass Average: %,.2f", average
                + "\nLetter Grade: " + grade + "\n\n");
      }
    } catch (FileNotFoundException fe){
      System.out.println
              ("Sorry, " + fileName + " was not found");
    }

  }

  public static String getName(Scanner input){
    return input.nextLine();
  }
  public static double getScores(Scanner input){
    double average = 0.0;
    int total = 0;
    int[] scores = new int[4];

    //read 4 scores from file
    for(int i = 0; i < 4; i++){
      scores[i] = input.nextInt();
    }

    for(int in = 0; in < 4; in++){
      total += scores[in];
      average = (double)total/4;
    }
    return average;
  }
  public static char setLetterGrade(double avg){
    double grades[] = {90.0,80.0,70.0,60.0,0.0};
    char[] letters = {'A','B','C','D','F'};

    for(int i = 0; i < grades.length; i++){
      if (avg >= grades[i])
        return letters[i];
    }
    return 'S';
  }
}
