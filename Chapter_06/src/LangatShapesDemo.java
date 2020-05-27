/*
   Author: Larry Langat
   Date: September 27, 2018
   Purpose: Demonstrate how to use and manipulate shape objects
*/

public class LangatShapesDemo {
    public static void main(String[] args){
        //variables
        int     box_length = 5,
                box_width = 8;
        LangatRectangle box = new LangatRectangle(box_length, box_width);

        //create another_box with default constructor
        LangatRectangle another_box = new LangatRectangle();
        System.out.println("The length of box is " + another_box.getLength());
        System.out.println("The width of box is " + another_box.getWidth());
        System.out.println("Box area: " + another_box.calcArea());
        System.out.println("Box area: " + another_box.calcPerimeter());

        //sets length and width of another_box
        another_box.setLength(12);
        another_box.setWidth(35);
        System.out.println("The length of box is " + another_box.getLength());
        System.out.println("The width of box is " + another_box.getWidth());
        System.out.println("Box area: " + another_box.calcArea());
        System.out.println("Box area: " + another_box.calcPerimeter());


        //display area and perimeter
        System.out.println("Box area: " + box.calcArea());
        System.out.println("Box area: " + box.calcPerimeter());

        box.setLength(10);
        //display area and perimeter
        System.out.println("Box area: " + box.calcArea());
        System.out.println("Box area: " + box.calcPerimeter());

        System.out.println("The length of box is " + box.getLength());
        System.out.println("The width of box is " + box.getWidth());
    }
}
