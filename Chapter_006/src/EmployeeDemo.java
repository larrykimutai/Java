import javax.swing.JOptionPane;
public class EmployeeDemo {
    public static void main(String[] args){
        //variables
        String  Name,
                Department,
                Position,
                input;
        int     IdNumber;

        //ask user input
        input = JOptionPane.showInputDialog
                ("Name:");
        Name = input;
        input = JOptionPane.showInputDialog
                ("Department: ");
        Department = input;
        input = JOptionPane.showInputDialog
                ("Position: ");
        Position = input;
        input = JOptionPane.showInputDialog
                ("ID Number: ");
        IdNumber = Integer.parseInt(input);

        Employee Meri = new Employee
                ("Meri","meir","meir",7);

        //displayEmployee("Larry");
    }
    public static void displayEmployee(Employee employee){
        System.out.println(employee.getName());
        System.out.println("ID Number: " + employee.getID_Number());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Position: " + employee.getPosition());

    }
}
