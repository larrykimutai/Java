import javax.swing.*;
/*
   Author: Larry Langat
   Date: November 13, 2018
   Purpose: as user for a number, and the program will
   double it.
*/
public class LangatDoubleMyNumber {
  public static void main(String[] args){
    int number = 0;


    do {
      try {
        String input = JOptionPane.showInputDialog
                ("Enter number between 1 - 100: ");
        number = Integer.parseInt(input);
      } catch (Exception e) {
        System.out.println("Input Mismatch: " + e.getMessage());
        System.out.println("Please enter a number.");
      }
    } while(number <= 0 || number >= 100);

    //make sure that number is within range


    System.out.println("Your number is: " + number);
    System.out.println("Your number doubled is: " + number*2);

    int[] numbers = new int[5];
    for(int i = 0; i <= 5; i++){
      try{
        numbers[i] = i * i;
        System.out.println
                ("Number: " + i + " squared = " + numbers[i]);
      }
      catch(ArrayIndexOutOfBoundsException ab){
        System.out.println
                ("The array index " + ab.getMessage() + " does not exist.");
      }
    }
  }
}
