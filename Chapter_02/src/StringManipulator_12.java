import javax.swing.*;

public class StringManipulator_12 {
  public static void main(String[] args){
    String input = JOptionPane.showInputDialog
            ("Enter Favorite City: ");
    int stringSize = input.length();
    System.out.println("Your favorite city is " +
            stringSize + " characters long.");
    System.out.println(input.toUpperCase());
    System.out.println(input.toLowerCase());
    System.out.println(input.charAt(0));
  }
}
