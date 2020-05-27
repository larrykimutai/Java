/*
   Author: Larry Langat
   Date: October 16, 2018
   Purpose: stores total rainfall of 12 months into an array of int and calculate
            total rainfall, average rainfall, and most and least rainfall.
*/
public class RainFall {
    //create field
    private int rainfall[];
    private String Month;

    //create constructor
    public RainFall(int rainFallInfo[] ) {
        //set rainfall field equals to the length of argument being accepted
        rainfall = new int[rainFallInfo.length];

        //for (double month: rainFallInfo){
        //store values from RainFallDemo into rainfall field elements
        for (int i = 0; i < rainFallInfo.length; i++) {
            rainfall[i] = rainFallInfo[i];
        }
    }

    public RainFall(int m) {
        Month = getMonth(m);
    }
        //set rainfall field equals to the length of argument being accepted


    //create instance method (doesn't have "static") for yearly rainfall
    public double getyearlyRainFall(){
        double total = 0;

        for(int i = 0; i < rainfall.length; i++){
            total = total + rainfall[i];
        }
        return total;
    }
    //create instance method for monthly avg. rainfall
    public double getmonthlyRainFall(){
        return getyearlyRainFall()     / rainfall.length;
        //sum of all elements in array / all elements in array
    }

    //create instance method to return month with most rain
    public int getMostRainFallmonth(){
        //go through array and find most rainfall
        double rain = rainfall[0];
        int monthmost = 0;

        for(int i = 0; i < rainfall.length; i++){
            if(rainfall[i] > rain){
                rain = rainfall[i];
                //if element being tested is greater than element in rainFall,
                // store value int rain. Then return rain value.
                monthmost = i;
                //add 1 because array starts at 0 not 1
            }
        }
        return monthmost;
    }
    //create instance method to return month with least rain
    public int getLeastRainFallmonth(){
        //go through array and find most rainfall
        double rain = rainfall[0];
        int monthleast = 0;

        for(int i = 0; i < rainfall.length; i++){
            if(rainfall[i] < rain){
                rain = rainfall[i];
                //if element being tested is greater than element in rainFall,
                // store value int rain. Then return rain value.
                monthleast = i;
                //add 1 because array starts at 0 not 1
            }
        }
        return monthleast;
    }
    //create instance method to return least amount of rainfall
    public double getLeastRainFall(){
        //go through array and find most rainfall
        double rain = rainfall[0];
        int monthleast = 1;

        for(int i = 0; i < rainfall.length; i++){
            if(rainfall[i] < rain){
                rain = rainfall[i];
                //if element being tested is greater than element in rainFall,
                // store value int rain. Then return rain value.
            }
        }
        return rain;
    }
    //create instance method to return most amount of rain
    public double getMostRainFall(){
        //go through array and find most rainfall
        double rain = rainfall[0];
        int monthmost = 1;

        for(int i = 0; i < rainfall.length; i++){
            if(rainfall[i] > rain){
                rain = rainfall[i];
                //if element being tested is greater than element in rainFall,
                // store value int rain. Then return rain value.
            }
        }
        return rain;
    }

    //create getter method that returns month
    public String getMonth(int m){
        String[] month = {"January","February","March","April","May",
                "June","July","August","September","October",
                "November","December"};
        return month[m];

    }
}
