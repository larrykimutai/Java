import javax.swing.*;

public class CircuitBoardProfit_11 {
  public static void main(String[] args){
    String input = JOptionPane.showInputDialog
            ("Enter retail price: ");
    double retailPrice = Double.parseDouble(input);

    double profit = retailPrice * 0.4;
    System.out.printf("Profit: $%,.2f", profit);
  }
}
