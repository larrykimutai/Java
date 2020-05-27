import javax.swing.*;

/*
   Author: Larry Langat
   Date: November 1, 2018
   Purpose: accept user string input and display in revers,
   as well as display if the entered text is a palindrome.
*/
public class LangatBackwardString {
    public static void main(String[] args){
        //get the users input
        String input = getUserInput();
        String inputIgnoreCase = input.toLowerCase();

        //convert string to char
        char charArray[] = convertToChar(inputIgnoreCase);

        //write the string backwards and display to console
        flipArrayandDisplay(charArray, input);

    }

    private static String getUserInput(){
        return JOptionPane.showInputDialog
                ("Enter a word or a phrase: ");
    }

    private static char[] convertToChar(String in){
        char charArray[] = new char[in.length()];
        for (int i = 0; i < in.length(); i++){
            charArray[i] = in.charAt(i);
        }
        return charArray;
    }

    private static void flipArrayandDisplay(char[] array, String input){
        int position = array.length;
        char[] arrayholder = new char[array.length];
        for(int i = 0; i < array.length; i++){
            arrayholder[i] = array[position-1];
            position--;
        }
        System.out.println(input);
        System.out.println(arrayholder);
        System.out.println();
        boolean flag = true;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == arrayholder[i]) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("Your input is a palindrome");
        }
        else {
            System.out.println("Your input is not a palindrome");
        }
    }
}
