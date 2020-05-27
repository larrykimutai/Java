/*
   Author: Larry Langat
   Date: November 6, 2018
   Purpose: describes how the abstract shape class works and...
   ...creates different types of shapes
*/
public class LangatShapesDemo {
    public static void main(String[] args){
        LangatCircle defualtCircle = new LangatCircle();

        LangatCircle custromCircle = new LangatCircle(4);




        //you can not create an abstract object, it can not be instantiated
        /**LangatShape myShape = new LangatShape();*/

        //this is creating a non abstract version of this shape
        //myCircle is a shape, and its a circle
        LangatShape myCircle = new LangatCircle(10);
        LangatShape myRect = new LangatRectangles(4,6);


        System.out.println(defualtCircle);
        System.out.println(custromCircle);
        System.out.println(myCircle);
        System.out.println(myRect);
    }
}
