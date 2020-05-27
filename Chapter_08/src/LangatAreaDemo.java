/**
   Author: Larry Langat
   Date: October 24, 2018
   Purpose: calculate and display the area of
   three different shapes
*/
public class LangatAreaDemo {
    public static void main(String[] args){
        //area of circle
        LangatArea circle = new LangatArea(5);
        displayArea("Circle", circle);

        //area of rectangle
        LangatArea rect = new LangatArea(4,5);
        displayArea("Rectangle", rect);

        //area of cylinder
        LangatArea cylinder = new LangatArea(3,4,4);
        displayArea("Cylinder", cylinder);
    }
    public static void displayArea(String shape, LangatArea area){
        System.out.printf
                ("The area of the " + shape + " is %,.2f", area.getShape());
        System.out.println();
    }
}
