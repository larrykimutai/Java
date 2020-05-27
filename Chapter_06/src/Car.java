public class Car {
    //field
    private int    yearModel,
                   speed;
    private String make;

    //constructor
    public Car (int yrmdle, String mke) {
        yearModel = yrmdle;
        make = mke;
    }
    //accessor methods (getters)
    public int getyearModel(){
        return yearModel;
    }
    public int getSpeed (){
        return speed;
    }
    public String getMake(){
        return make;
    }

    //accelerate method
    public double accelration(int acc){
        speed = acc;
        return speed + 5;
    }

    //breaks method
    public double breakes(int brks){
        speed = brks;
        return speed - 5;
    }

    //mutator methods (setters)
}
