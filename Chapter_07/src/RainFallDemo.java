/*
   Author: Larry Langat
   Date: October 16, 2018
   Purpose: Test the RainFall.java class
*/
import javax.swing.JOptionPane;
public class RainFallDemo {
    public static void main(String[] args){
        //create array
        final int[] rainfallinfo = new int[12];

        //get user input
        getUserInput(rainfallinfo);

        //create data object
        RainFall data = new RainFall(rainfallinfo);

        //display user information
        ShowUserInput(data);
    }
    //get user input
    private static void getUserInput(int[] rainfall){
        //create for-loop to go through array and fill each element
        for(int i = 0; i < rainfall.length; i++){
            RainFall month = new RainFall(i);
            String input = JOptionPane.showInputDialog
                    ("Enter amount of rainfall for " + month.getMonth(i) +  " in inches.");
            int userinput = Integer.parseInt(input);
            if (userinput < 0){
                JOptionPane.showMessageDialog
                        (null, "Please enter a positive number");
            }
            else {
                //store user values into array elements.
                rainfall[i] = userinput;
            }
        }
    }
    private static void ShowUserInput(RainFall data ){
        //create objects for month to get month according to number (1-12)

        int month = data.getMostRainFallmonth();
        int month2 = data.getLeastRainFallmonth();
        RainFall mostMonth = new RainFall(data.getMostRainFallmonth());
        RainFall leastMonth = new RainFall(data.getLeastRainFallmonth());

        //print total and average rainfall to console
       System.out.println(String.format("Total Rainfall: " +
               data.getyearlyRainFall()));
       System.out.println(String.format("Average Monthly Rainfall: %,.2f inches",
               data.getmonthlyRainFall()));
       //print most and least amount of rain and corresponding month to console
        System.out.println(leastMonth.getMonth(month2) + " had the least rainfall at " +
                data.getLeastRainFall() + " inches");
        System.out.println(mostMonth.getMonth(month) + " had the most rainfall at " +
               data.getMostRainFall() + " inches") ;

        }
}
