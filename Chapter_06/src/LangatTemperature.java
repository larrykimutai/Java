public class LangatTemperature {
    //fields
    private double fTemp;

    //create default constructor
    public LangatTemperature(){
        fTemp = 32.0; //default value for public constructor
    }

    //second constructor receives a value
    public LangatTemperature(double f){
        fTemp = f;
    }

    //set methods
    public void setfTemp(double f){
        fTemp = f;
    }
    //get methods
    public double getfTemp(){
        return fTemp;
    }

    //calculating methods
    public double calcCTemp (){
        return (5.0/9.0) * (fTemp - 32.0);
        //double celc = ((5.0/9.0)*(fTemp - 32.0) + 273.0);
        //return  calcCTemp (fer, celc);
    }
    public double calcKTemp (){
        return ((5.0/9.0)*(fTemp - 32.0) + 273.0);
    }
}
