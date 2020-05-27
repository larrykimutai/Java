import javax.swing.*;

public class LangatNewArrays {
    public static void main(String[] args){
        //arrays variables
        int[] days;
        double[]grades = new double[10];
        String[] names = {"Name1","Name2","Name3",
                "Name4","Name5","Name6"};

        //add elements to arrays
        days = new int[7];
        days[0] = 4; days[1] = 5;days[2] = 24;days[3] = 34;
        days[4] = 23; days[5] = 42; days[6] = 34;

        //display different array elements
        System.out.println("Name array in first slot is " + days[0]);
        System.out.println("Name array in last slot is " + days[6]);
        System.out.println();

        //loop to display name
        for(int i = 0; i < names.length; i++){
            System.out.println("Names in this array is " + names[i]);
        }

        //loop for user input
        for(int i = 0; i < grades.length; i++){
            String input = JOptionPane.showInputDialog
                    ("Enter grade: " + (i+1));
            grades[i] = Double.parseDouble(input);
        }

        //user loop to display grades array
        for(double grade: grades){
            System.out.println("Grades array in this slot: " + grade);
        }
    }
}
