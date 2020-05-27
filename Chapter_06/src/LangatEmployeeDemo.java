/*
   Author: Larry Langat
   Date: September 27, 2018
   Purpose: Create employees for my new company
*/
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LangatEmployeeDemo {
    public static void main(String[] args) throws IOException {
        //variables
        String  input,
                Name,
                input_file;
        Boolean Fulltimestatus;
        Double HourlyWage;
        Scanner in = new Scanner (System.in);
        int     IDNumber,
                employee,
                cntr = 0;

        //call header method
        displayHeader();

        //aks whether to read from file or enter manually.
        JDialog.setDefaultLookAndFeelDecorated(true);

        //my information
        displayMyInfo();

        //TSwift information
        displayTSwiftInfo();

        //Yes-NO dialog box

        int response = JOptionPane.showConfirmDialog(null, "Reading from File ?\n " +
                        "Yes to read from file, No to enter manually", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {
            //ask how many employees will be set up
            input = JOptionPane.showInputDialog
                    ("How many New Employees? ");
            employee = Integer.parseInt(input);

            do {
                //ask for employee information
                input = JOptionPane.showInputDialog
                        ("Name: ");
                Name = input;

                input = JOptionPane.showInputDialog
                        ("ID Number: ");
                IDNumber = Integer.parseInt(input);

                input = JOptionPane.showInputDialog
                        ("Full-time status: (true or false)");
                Fulltimestatus = Boolean.parseBoolean(input.toLowerCase());

                input = JOptionPane.showInputDialog
                        ("Hourly Wage: ");
                HourlyWage = Double.parseDouble(input);

                //call LangatEmployee object
                LangatEmployee newemployee = new LangatEmployee
                        (Name, IDNumber, Fulltimestatus, HourlyWage);

                //call display method
                displayEmployee(newemployee);
                cntr ++;
            }
            while (cntr < employee);

            //reads text from file
        } else if (response == JOptionPane.YES_OPTION) {

            //get filename
            input = JOptionPane.showInputDialog
                    ("Enter File Name: ");
            input_file = input;

            //open file
            File my_file = new File(input_file);
            Scanner file_input = new Scanner (my_file);

            //read from file and send create objects
                String line = file_input.nextLine();
                String line2 = file_input.nextLine();
                int numb = Integer.parseInt(line2);
                String line3 = file_input.nextLine();
                boolean status = Boolean.parseBoolean(line3);
                String line4 = file_input.nextLine();
                double hrwage = Double.parseDouble(line4);

                //send to LangatEmployee class
            LangatEmployee newemployee = new LangatEmployee
                    (line, numb, status, hrwage);

            //sent to display employee method
            displayEmployee(newemployee);


            //close objects
            file_input.close();
            in.close();
        }
    }
    private static void displayEmployee(LangatEmployee emp){
        System.out.printf("%-20s  %-20d \t\t%-20s \t$%-20s\n",emp.get_name(),
                emp.getId_number(),emp.getFullTime(),emp.getWage() );
    }
    public static void displayHeader(){
        //create header
        System.out.println("Name\t\t\t\t  ID Number \t\t\t\tFull-Time \t\t\t\tHourly-Wage");
        System.out.println("-----------------------------------------------------------------------------------");
    }
    public static void displayMyInfo(){
        LangatEmployee me = new LangatEmployee();
        me.setId_number(0);
        me.setFull_time(true);
        me.setName("Larry Langat");
        me.setHourly_wage(7.25);
        displayEmployee(me);
    }
    public static void displayTSwiftInfo(){
        LangatEmployee tswift = new LangatEmployee();
        tswift.setId_number(0);
        tswift.setFull_time(true);
        tswift.setName("Taylor Swift");
        tswift.setHourly_wage(100.00);
        displayEmployee(tswift);
    }
}

//ask user for information for 3 employees
/*
extra credit: You will be given a test file with: Name on first line,
empID on second line, word yes or no on third line, and hr wage on
forth line. ()
 */
