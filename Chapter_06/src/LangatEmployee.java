/*
   Author: Larry Langat
   Date: September 27, 2018
   Purpose: to define an employee object
*/
public class LangatEmployee {
    private String name;
    private int id_number;
    private Boolean Full_time;
    private Double Hourly_wage;

    //create constructor that accepts all the information
    public LangatEmployee(String n, int id, Boolean ft, Double hw) {
        name = n;
        id_number = id;
        Full_time = ft;
        Hourly_wage = hw;
    }

    //create default constructor;
    public LangatEmployee(){
        name = "";
        id_number = 0;
        Full_time = true;
        Hourly_wage = 7.25;
    }

    //create getters
    public String get_name () {
        return name;
    }
    public int getId_number(){
        return id_number;
    }
    public boolean getFullTime(){
        return Full_time;
    }
    public double getWage(){
        return Hourly_wage;
    }

    //create setters
    public void setName(String nam){
        name = nam;
    }
    public void setId_number(int id){
        id_number = id;
    }
    public void setFull_time(boolean ft){
        Full_time = ft;
    }
    public void setHourly_wage(Double hw){
        Hourly_wage = hw;
    }

}
