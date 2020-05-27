/*
   Author: Larry Langat
   Date: November 6, 2018
   Purpose: create rectangles and boxes
*/
public class LangatInheritDemo {
    public static void main(String[] args){
        //Rectangles
        LangatRectangles defaultRect = new LangatRectangles();
        LangatRectangles customRect  = new LangatRectangles(5,9);

        //display each rectangle
        displayRectangle(defaultRect);
        displayRectangles(customRect);

        //Boxes
        LangatBox defaultBox = new LangatBox();
        LangatBox semiCustomBox = new LangatBox(10);
        LangatBox fullyCustomBox = new LangatBox(7,8,20);

        //display each box
        displayBoxes(defaultBox);
        displayBoxes(semiCustomBox);
        displayBoxes(fullyCustomBox);
    }

    public static void displayRectangle(LangatRectangles rect){
        System.out.println(rect);
    }

    public static void displayRectangles(LangatRectangles rect){
     System.out.println("Length = " + rect.getLength());
     System.out.println("Width = " + rect.getWidth());
     System.out.println("Area = " + rect.CalcArea());
     System.out.println();
    }

    public static void displayBoxes(LangatBox box){
        System.out.println("Length = " + box.getLength());
        System.out.println("Width = " + box.getWidth());
        System.out.println("Height =" + box.getHeight());
        //looks for "toString();" specifically.
        System.out.println(box);
        System.out.println();
    }
}
