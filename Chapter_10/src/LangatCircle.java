/*
   Author: Larry Langat
   Date: November 6, 2018
   Purpose: create circle objects that inherit from the LangatShape class
*/
public class LangatCircle extends LangatShape{
    private int Radius;

    //constructor
    public LangatCircle(){
        Radius = 1;
    }

    public LangatCircle(int radius){
        Radius = radius;
    }

    public int getRadius(){
        return Radius;
    }

    public double calcArea(){
        return Radius * Radius * (Math.PI);
    }
}
