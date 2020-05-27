/*
   Author: Larry Langat
   Date: November 6, 2018
   Purpose: create box object that inherits from
   LangatRectangle.
*/
public class LangatBox extends LangatRectangles{

    private int Height;

    public LangatBox(){
        //calls the default constructor in the superclass
        super();
        Height = 4;
    }

    public LangatBox(int h){
        super();
        Height = h;
    }

    public LangatBox(int len, int wid, int h){
        //call the constructor in LangatRectangle that accepts two arguments
        super(len, wid);
        Height = h;
    }

    public int getHeight(){
        return Height;
    }

    public int CalcVolume(){
        return getLength() * getWidth() * Height;
    }

    public String toString(){
        return "My volume is " + CalcVolume();
    }
}
