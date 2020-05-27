import javax.swing.*;

/*
   Author: Larry Langat
   Date: November 1, 2018
   Purpose: to tell a user whether entered password is
   invalid, acceptable, or strong according to some
   criteria
*/
public class LangatPasswordVerifier {
    public static void main(String[] args){
        //call validation method
        validatePassword();
    }

    private static void validatePassword(){
        //get user input
        String in = getUserInput();
        //get whether pass. has upper and lower case
        boolean Case = passwordCase(in);
        //get whether pass. has digit
        boolean digit = hasNumber(in);
        //get if pass. has 1 or 2 + special character
        int special = specialCharachters(in);
        //print to screen whether password is long enough to be acceptable/strong
        CharacterLength(in);

        //print to screen whether pass. is strong, acceptable, or invalid
        char[] pass = convertToChar(in);
        if (pass.length >= 6 && Case && digit && special >= 1){
            if (pass.length >= 10 && special >= 2){
                System.out.println("Strong Password!");
            }
            else{
            System.out.println("Acceptable password \n");
            }
        }
        else {
            System.out.println("Invalid Password ");
        }
    }

    private static String getUserInput(){
        return JOptionPane.showInputDialog
                ("Password: ");
    }

    private static char[] convertToChar(String in){
        char charArray[] = new char[in.length()];
        for (int i = 0; i < in.length(); i++){
            charArray[i] = in.charAt(i);
        }
        return charArray;
    }

    private static boolean passwordCase(String password){
        char[] passwordArray = convertToChar(password);
        int position  = 0;
        int position2 = 0;
        for (int i = 0; i < password.length(); i++) {
            //if passwordArray[in] == any of the values that equal each upper case char than increment position2
            if (passwordArray[i] >= 65 && passwordArray[i] <= 90)
                position++;
        }
        for(int in = 0; in < password.length(); in++)
            //if passwordArray[in] == any of the values that equal each lower case char than increment position2
            if(passwordArray[in] >= 97 && passwordArray[in] <= 122) {
            position2++;
            }
            if(position < 1){
        System.out.println("Missing an upper case letter to make it an acceptable password");
    }
            if(position2 < 1){
        System.out.println("Missing a lower case letter to make it an acceptable password");
    }
            if (position >= 1 && position2 >= 1){
                return true;}
        else return false;
    }

    private static int CharacterLength(String in){
        int test = 0;
        if (in.length() >= 6) {
            if (in.length() >= 10) {
                test = 10;
                return test;
            }
            System.out.println("10 characters or longer to be Strong, add " +
                    (10 - in.length()) + " or more characters to make it Strong");
            test = 6;
            return test;
        }
        System.out.println("Your password must be at least 6 characters or longer to be acceptable");
        return test;
    }

    private static boolean hasNumber(String password){
        char[] passwordArry = new char[password.length()];
        boolean test = false;
        for(int i = 0; i < passwordArry.length; i++){
            char pass = password.charAt(i);
            if (Character.isDigit(pass))
                test = true;
        }
        if(!test){
            System.out.println("Missing a digit to make it an acceptable password");
        }
        return test;
    }

    private static int specialCharachters(String password){
        int test = 0;
        //test each element with each symbol and increment test variable if boolean values equals true
        for (int in = 0; in < password.length(); in++){
            char character = password.charAt(in);
            if (character == '!'){
                test++;
            }
            else if(character == '@'){
                test++;

            }
            else if(character == '#'){
                test++;
            }
            else if(character == '$'){
                test++;
            }
            else if(character == '%'){
                test++;
            }
            else if(character == '^'){
                test++;
            }
            else if(character == '&'){
                test++;
            }
            else if(character == '*'){
                test++;
            }
            else if(character == '.'){
                test++;
            }
            else if(character == '?'){
                test++;
            }
        }
        if(test == 0){
            System.out.println("Add a special character to make it an acceptable password");
        }else if (test > 0 && test <= 1){
            System.out.println("Add another special character to make it a strong password");
        }
        return test;
    }
}

