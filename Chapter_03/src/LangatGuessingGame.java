/*
   Author: Larry Langat
   Date: September 4, 2018
   Purpose: To understand if-else-if decision structure.
*/
import javax.swing.JOptionPane;
public class LangatGuessingGame {
    public static void main (String[] args) {
        //variables
        int your_guess;


        //ask user input
        your_guess = getUserInput();
        ifStatement(20, your_guess);

    }
    private static int getUserInput(){
        String input = JOptionPane.showInputDialog
                ("Guess number between 1 and 100");
        return Integer.parseInt(input);
    }
    private static void ifStatement(int number, int guess){
        if(number == guess){
            JOptionPane.showMessageDialog
                    (null,"You guessed correctly");
        }
        else if (number > guess){
            JOptionPane.showMessageDialog
                    (null, "My number is larger than your number");
        }
        else {JOptionPane.showMessageDialog
                (null, "My number is smaller than you number.");}

        System.out.println("Your guess was " + guess);
        System.out.println("My number was " + number);
    }
}
