/*
   Author: Larry Langat
   Date: November 6, 2018
   Purpose: create rectangle object
*/
public class LangatRectangles extends LangatShape{

    private int Length;
    private int Width;

    //default constructor
    public LangatRectangles(){
        Length = 2;
        Width = 3;
    }

    //constructor
    public LangatRectangles(int len, int wid){
        Length = len;
        Width = wid;
    }

    public int getLength(){
        return Length;
    }

    public int getWidth(){
        return Width;
    }

    public void setLength(int len){
        Length = len;
    }

    public void setWidth (int wid){
        Width = wid;
    }

    public double CalcArea(){
        return Length * Width;
    }

    public String toString(){
        String str = "";
        str += "My length is " + Length + "\n";
        str += "My width is " + Width + "\n";
        str += "My area is " + CalcArea() + "\n";
        return str;
    }

}
