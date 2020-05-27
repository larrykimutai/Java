/*
   Author: Larry Langat
   Date: November 6, 2018
   Purpose: Create an abstract shape class
*/
public abstract class LangatShape {

    public double calcArea(){
        return 0.0;
    }

    public String toString(){
        String string = "";
        string = String.format("My area is %,.2f %n", calcArea());
        return string;
    }
}
