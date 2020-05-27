public class LangatShapes {
    //fields
    //static counter to keep track of instances
    private static int shapeCounter;
    public double area = 0.0;

    //constructor
    public LangatShapes(){
        shapeCounter++;
    }

    //area of a circle
    public LangatShapes(double radius){
        shapeCounter++;
        area = Math.PI * Math.pow(radius, 2);
    }

    //area of a rectangle
    public LangatShapes(double length, double width){
        shapeCounter++;
        area = length * width;
    }

    //area of a box
    public LangatShapes(double length, double width, double height){
        shapeCounter++;
        area = length * width * height;
    }

    //get shape counter
    public int getShapeCounter(){
        return shapeCounter;
    }
    //get area of shape
    public double getArea(){
        return area;
    }
}
