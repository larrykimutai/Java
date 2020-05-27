public class LangatMakeShapes {
    public static void main(String[] args){
        //rectangle
        LangatShapes reactangle = new LangatShapes(3,4);
        displayArea("Rectangle", reactangle);

        //circle
        LangatShapes circle = new LangatShapes(4);
        displayArea("Circle", circle);

        //box
        LangatShapes box = new LangatShapes(3,4,1);
        displayArea("Box", box);

    }
    public static void displayArea(String name, LangatShapes area){
        System.out.println("The area of the " + name + " is " + area.getArea());
    }
}
