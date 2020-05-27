import javax.swing.*;

public class LangatReturnSubstring {
    public static void main(String[] args){
        //variables
        String input;
        int position;

        //get text from user and convert to char[]
        input = JOptionPane.showInputDialog
                ("Enter text: ");
        char [] charArray = input.toCharArray();
        position = -1;
        int counter = 0;

        //find the first space in the char array
        while(position < 0 && counter < input.length()){
            char ch = charArray[counter];
            //char wrapper class called Character
            if (Character.isWhitespace(ch)){
                position = counter;
            }
            counter ++;

        }

        //return part of text before blank space
        if(position >= 0){
            System.out.print("Before the space: ");
            System.out.println(input.substring(0, position));
        }
        //return part of text after blank space
        if (position >= 0){
            System.out.print("After the space: ");
            System.out.println(input.substring(position + 1));
        }
        else{
            System.out.println(input);
            System.out.println("Your text does not contain white space.");
        }
    }
}
