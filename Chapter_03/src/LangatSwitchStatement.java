import java.util.Scanner;
public class LangatSwitchStatement {
    public static void main(String[] args){
        //variables
        Scanner in = new Scanner (System.in);
        int num;

        //user input
        System.out.println("Give number between 1 and 3");
        num = in.nextInt();

        /*
        if (num == 1)
            System.out.println("The Arrival");
        else if (num == 2)
            System.out.println("You Got Served");
        else if (num == 3)
            System.out.println("Pacific Rim");
        else
            System.out.println("No Movie Found");
         */

        switch (num) {
            case 1:
                System.out.println("The Arrival");
                break;
            case 2:
                System.out.println("You Got Served");
                break;
            case 3:
                System.out.println("Pacific Rim");
                break;
            default:
                System.out.println("No Movie Found");
                break;

        }
    }
}
