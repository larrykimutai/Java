import javax.swing.*;
import java.io.IOException;

public class LangatCharTester {

    public static void main(String[] args){
        //variables
        String input;
        char ch;

        //get a String to evaluate
        input = JOptionPane.showInputDialog
                ("Please enter text to evaluate: ");

        //output length of string
        int length = input.length();
        System.out.println(input);
        System.out.println("Your text is " + length + " characters long");

        displayCharType(input);
    }

    public static void displayCharType (String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                if(Character.isUpperCase(ch)){
                System.out.println(ch + " is an upper case letter.");
                }
                else {
                    System.out.println(ch + " is a lower case letter.");
                }
            }

            else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a numeric digit.");
            }

            else if (Character.isWhitespace(ch)) {
                System.out.println(ch + " is a Whitespace.");
            }
            else{
                System.out.println(ch + " is a symbol.");
            }
        }
    }
}
