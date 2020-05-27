import javax.swing.*;

/*
   Author: Larry Langat
   Date: November 5, 2018
   Purpose: demonstrate inheritance from other
   classes created and how they all work and
   extend from each other.
*/
public class LangatEmployeeDemo {
    public static void main(String[] args){
        LangatEmployee Employee1 = new LangatProductionWorker
                (getUserName(),getNumber(),getHireDate(),getUserShift());
        displayToConsole(Employee1);
        LangatEmployee Employee2 = new LangatProductionWorker
                (getUserName(),getNumber(),getHireDate(),getUserShift());
        displayToConsole(Employee2);
        LangatShiftSupervisor Supervisor = new LangatShiftSupervisor
                (getUserName(),getNumber(),getHireDate(),(getRate()*(37.5)*(52)));
        displayToConsole(Supervisor);
    }
    //display employees
    public static void displayToConsole(LangatEmployee emp){
        System.out.println(emp);
    }

    //get name
    public static String getUserName(){
        return JOptionPane.showInputDialog
                ("Name: ");
    }

    //get hire date
    public static String getHireDate(){
        return JOptionPane.showInputDialog
                ("Hire Date: ");
    }

    //get employee number
    public static String getNumber(){
        String input = JOptionPane.showInputDialog
                ("Enter 3 digit Employee Number: ");
        int num = Integer.parseInt(input);
        char letter = getLetter();
        String employeeNum = num + "-" +  letter + "";
        return employeeNum;
    }
    public static char getLetter(){
        String in = JOptionPane.showInputDialog
                ("Enter Identification Letter: ");
        char[] letter = in.toCharArray();
        return letter[0];
    }

    //get shift
    public static int getUserShift(){
        String in = JOptionPane.showInputDialog
                ("1 for Day Shift\n2 for Night Shift\nEnter Shift: ");
        return Integer.parseInt(in);
    }

    //get rate
    public static double getRate(){
        String in = JOptionPane.showInputDialog
                ("Enter Hourly Pay Rate: ");
        return Double.parseDouble(in);
    }
}
