/*
    Author: Larry Langat
    Date: August 23, 2018
    Purpose: To display full name, as well as initials.
 */
public class Name_and_Initials {
    public static void main (String[] args) {
        //store names in variables
        String  firstName = "Larry ",
                middleName = "Kimutai ",
                lastName = "Langat";

        //store initials as characters
        char    firstInitial = 'L',
                s = '.',
                secondInitial = 'K',
                lastInitial = 'L';

        //display stored information
        System.out.println(firstName + middleName + lastName);
        System.out.println("" + firstInitial + s + secondInitial + s + lastInitial);

    }

}
