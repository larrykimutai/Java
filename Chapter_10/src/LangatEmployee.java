/*
   Author: Larry Langat
   Date: November 5, 2018
   Purpose: create a class that keeps information
   of employees
*/
public abstract class LangatEmployee {
    //fields
    private String EmployeeName;
    private String EmployeeNumber;
    private String EmployeeHireDate;


    //default constructor
    public LangatEmployee(){
      EmployeeName = "John Doe";
      EmployeeNumber = "000-A";
      EmployeeHireDate = "11/05/2018";
    }
    //constructor
    public LangatEmployee(String name, String number, String hire){
        EmployeeName = name;
        EmployeeNumber = number;
        EmployeeHireDate = hire;
    }


    //setter methods
    public void setEmployeeName(String name){
        EmployeeName = name;
    }
    public void setEmployeeNumber(String number){
        EmployeeNumber = number;
    }
    public void setEmployeeHaireDate(String hire){
        EmployeeHireDate = hire;
    }


    //getter methods
    public String getEmployeeName(){
        return EmployeeName;
    }
    public String getEmployeeNumber(){
        return EmployeeNumber;
    }
    public String getEmployeeHaireDate(){return EmployeeHireDate;}

    //toString method
    public String toString() {
      String str;
      str =   "Employee Name: " + EmployeeName +
              "\nEmployee Number: " + EmployeeNumber +
              "\nEmployee Hire Date: " + EmployeeHireDate;
    return str;
  }
}
