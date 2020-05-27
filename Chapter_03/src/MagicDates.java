import javax.swing.JOptionPane;
import java.awt.*;

public class MagicDates {
    public static void main(String[] args){
        //variables
        int     month,
                day,
                year;

        //ask user input
        day = inputDay();
        month = inputMonth();
        year = inputYear();

        displaymessage(month, day, year);
        }
        private static void displaymessage(int month, int day, int year) {
            if (month * day == year) {
                JOptionPane.showMessageDialog
                        (null, "The Date is Magical!!");
            } else {
                JOptionPane.showMessageDialog
                        (null, "The Date is Not Magical");
            }
        }
        private static int inputDay () {
            String input = JOptionPane.showInputDialog
                    ("Enter your birth month Format: mm/dd/yy");
            return Integer.parseInt(input);
        }
        private static int inputMonth() {
            String input = JOptionPane.showInputDialog
                    ("Enter your birth day Format: mm/dd/yy");
            return Integer.parseInt(input);
        }
        private static int inputYear(){
            String input = JOptionPane.showInputDialog
                    ("Enter your birth year Format: mm/dd/yy");
            return Integer.parseInt(input);
        }
}
