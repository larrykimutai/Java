/*
   Author: Larry Langat
   Date: September 6, 2018
   Purpose: Take number entered by user and and return roman numeral.
*/
import javax.swing.JOptionPane;
public class LangatRomanNumerals {
    public static void main(String[] args){
        //variables
        int num;
        String in;

        //ask user input
        in = JOptionPane.showInputDialog
                ("Enter number between 1-10");
        num = Integer.parseInt(in);

        //convert Arabic number to roman numeral  (switch statement)
        switch(num){
            case 1:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is I");
                break;
            case 2:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is II");                break;
            case 3:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is III");                break;
            case 4:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is IV");                break;
            case 5:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is V");                break;
            case 6:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is VI");                break;
            case 7:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is VII");                break;
            case 8:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is VIII");                break;
            case 9:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is IX");
                break;
            case 10:
                JOptionPane.showMessageDialog
                        (null, num + " in roman numerals is X");
                break;
                default:
                    JOptionPane.showMessageDialog
                            (null, "Please enter number between 1 and 10");
        }
    }
}
