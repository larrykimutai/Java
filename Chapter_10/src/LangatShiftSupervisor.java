/*
   Author: Larry Langat
   Date: November 5, 2018
   Purpose: create a class that keeps information
   of annual salary and annual production bonus, as
   well as demonstrate inheritance.
*/
public class LangatShiftSupervisor extends LangatEmployee {
  //fields
  private double AnnualSalary;
  private double AnnualProductionBonus;

  //constructor
  public LangatShiftSupervisor(String name, String number, String date, double annualSalary){
    super(name, number, date);
    AnnualSalary = annualSalary;
  }
  //default constructor
  public LangatShiftSupervisor(){
    super();
    AnnualSalary = 15080.00;
  }

  //getters
  public double getAnnualSalary(){
    return AnnualSalary;
  }

  //setters
  public void setAnnualSalary(double annualSalary){
    AnnualSalary = annualSalary;
  }

  //toString method
  public String toString(){
    String str;
    str =   "Supervisor Name: " + getEmployeeName() +
            "\nSupervisor Number: " + getEmployeeNumber() +
            "\nSupervisor Hire Date: " + getEmployeeHaireDate() +
            String.format("\nAnnual Salary: $%,.2f " +
            "\nAnnual Production Bonus: $%,.2f", AnnualSalary, AnnualProductionBonus);

    return str;
  }

  //calculate whether received bonus
  public void setAnnualProductionBonus(int shift1, int shift2){
    if(shift1 == shift2){
      AnnualProductionBonus = (AnnualSalary * 0.10);
    }
  }

  public double getAnnualProductionBonus(){
    return AnnualProductionBonus;
  }
}
