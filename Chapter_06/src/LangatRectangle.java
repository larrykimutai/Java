/*
   Author: Larry Langat
   Date: September 27, 2018
   Purpose: To define a class that creates rectangle objects.
*/
//LangatRectangle is my object
public class LangatRectangle {
    private int length,
                width;

    //create a default constructor. Decide values of your variables inside your object.
    //we need one because we have a box but don't know the length and/or width.
    public LangatRectangle(){
        length = 0;
        width = 0;
    }

    //Create a constructor: method has same name as class
    public LangatRectangle(int len, int wid){
        length = len;
        width = wid;
    }

    //create setter methods
    public void setLength(int len){
        length = len;
    }
    //create setter method
    public void setWidth(int wid) {
        width = wid;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int calcArea(){
        return length * width;
    }

    public int calcPerimeter(){
        return 2 * (length + width);
    }
}
