import java.util.Scanner;

public class LangatTextSearch {
    public static void main(String[] args){
        //Array of names
        String[] people = {"James, Lebron", "Bryant, Kobe",
                            "Twain, Shania","Swift, Taylor",
                            "Gates, Bill", "Minaj, Nicki",
                            "Boosie, Lil", "Schmurda Robert",
                            "Bryan, Daniel"};

        //other variables
        Scanner keyboard = new Scanner(System.in);
        String input;
        int number = 0;

        //enter text to loop up
        System.out.println
                ("Enter the first letter or letters of a person's name: ");
        input = keyboard.next();

        //display all names that begin with the entered statement
        for(String person: people){
            String Person = person.toUpperCase();
            String myInput = input.toUpperCase();
            if (Person.startsWith(myInput)){
                System.out.println(person);
                number++;
            }
        }
        System.out.println("You found " + number + " names(s) in the directory");
    }
}
