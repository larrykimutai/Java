/*
   Author: Larry Langat
   Date: November 5, 2018
   Purpose: create a class that keeps information
   of employees pay rate and shift, and also demonstrate
   inheritance.
*/
public class LangatProductionWorker extends LangatEmployee {
    //fields
    private int     Shift;
    private double  HourlyPayRate;

    //constructor
    public LangatProductionWorker(int shift, double hourlyPayRate){
        Shift = shift;
        HourlyPayRate = hourlyPayRate;
    }
    //default constructor
  public LangatProductionWorker(String name, String num, String date, int shift){
      super(name,num,date);
      Shift = shift;
      HourlyPayRate = 7.25;
  }

    //setter methods
    public void Shift(int shift){
      if(shift == 1){
        Shift = 1;
      }
      else Shift = 2;
    }
    public void HourlyPayRate(double hourlyPayRate){
        HourlyPayRate = hourlyPayRate;
    }


    //getter methods
    public int getShfit(){
        return Shift;
    }
    public double getHourlyPayRate(){
        return HourlyPayRate;
    }

    //toString method
    public String toString(){

      String str;
      if (Shift == 1){
        str =   "Employee Name: " + getEmployeeName() +
                "\nEmployee Number: " + getEmployeeNumber() +
                "\nEmployee Hire Date: " + getEmployeeHaireDate() +
                "\nEmployee Shift: Day";
      }
      else str =   "Employee Name: " + getEmployeeName() +
              "\nEmployee Number: " + getEmployeeNumber() +
              "\nEmployee Hire Date: " + getEmployeeHaireDate() +
              "\nEmployee Shift: Night Shift";

      return str;
    }
}
