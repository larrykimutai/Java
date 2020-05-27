import javax.swing.*;

public class RestaurantBill {
  public static void main(String[] args){
    String input = JOptionPane.showInputDialog
            ("Enter meal charge: ");
    double subtotal = Double.parseDouble(input);
    double tax = subtotal * 0.0675;
    double tip = (tax + subtotal) * 0.2;
    double total = tip + tax + subtotal;

    System.out.printf("Subtotal: $%,.2f", subtotal);
    System.out.printf("\nTax     : $%,.2f", tax);
    System.out.printf("\nTip     : $%,.2f", tip);
    System.out.printf("\nTotal   : $%,.2f", total);
  }
}
