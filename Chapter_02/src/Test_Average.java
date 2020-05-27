/*
        Author: Larry Langat
        Date: September 27, 2018
        Purpose: get average of three test scores from the user
*/
import javax.swing.JOptionPane;
public class Test_Average {
    public static void main(String[] args){
        //variables
        String  input;
        int     test1,
                test2,
                test3;

        //ask users input
        input = JOptionPane.showInputDialog
                ("Test Score 1: ");
        test1 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog
                ("Test Score 2: ");
        test2 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog
                ("Test Score 3: ");
        test3 = Integer.parseInt(input);

        System.out.println
                ("Test 1: " + test1 + " Test 2: "
                        + test2 + " Test3: " + test3 + " Average: " +
                        average(test1, test2, test3));
    }
    private static double average(int test1, int test2, int test3){
        return (test1 + test2 + test3)/3;
    }
}
