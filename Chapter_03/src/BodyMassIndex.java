import javax.swing.JOptionPane;
public class BodyMassIndex {
    public static void main(String[] args){
        //variables
        double  height,
                weight,
                BMI;

        //ask user input
        height = userHeight();
        weight = userWeight();
        BMI = calculateBMI(height, weight);
        bodymassindex(BMI);
    }
    private static double userHeight(){
        String input = JOptionPane.showInputDialog
                ("Enter height in inches: ");
        return Integer.parseInt(input);
    }
    private static double userWeight(){
        String input = JOptionPane.showInputDialog
                ("Enter weight in pounds: ");
        return Integer.parseInt(input);
    }
    private static double calculateBMI(double hght, double wght){
        return wght * (730 / (hght * hght));
    }
    private static void bodymassindex(double bmi){
        if (bmi >= 18.5 && bmi <= 25.0) {
            JOptionPane.showMessageDialog
                    (null,String.format("BMI: %,.2f\n" +
                            "Optimal Body Mass Index.", bmi));
        }
        else if (bmi > 25.0){
            JOptionPane.showMessageDialog
                    (null, String.format("BMI: %,.2f\n" +
                            "You are Overweight.", bmi));
        }else if (bmi < 18.5) {
            JOptionPane.showMessageDialog
                    (null,String.format("BMI: %,.2f\n" +
                            "You are Underweight.", bmi));
        }
        }
    }

