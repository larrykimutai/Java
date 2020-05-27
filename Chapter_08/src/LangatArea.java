/**
   Author: Larry Langat
   Date: October 24, 2018
   Purpose: create overloaded static methods for calculating
   the are of three geometric shapes
*/
public class LangatArea {
    //create static area field
    private static double area = 0.0;

    //area of circle
    public LangatArea(double radius) {
        area = Math.PI * Math.pow(radius, 2);
    }

    //area of rectangle
    public LangatArea(double Width, double Length){
        area = Width * Length;
    }

    //area of cylinder
    public LangatArea(double radius, double height, double placeHolder){
        double holder = placeHolder * 0;
        area = Math.PI * Math.pow(radius, 2) * height + holder;

    }

    //get area of shape
    public double getShape(){
        return area;
    }
}
