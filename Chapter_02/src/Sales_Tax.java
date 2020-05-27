import java.util.Scanner;

public class Sales_Tax {
    public static void main(String[] args) {
    /**ask user to enter amount of purchase **/ Scanner scan = new Scanner (System.in);
        System.out.print("Enter Price: $");
        float amount = scan.nextFloat();

        /*compute state (4%), county (2%) sales tax and total*/
        double tax_st = .04 * amount;
        double tax_ct = .02 * amount;
        double total = tax_st + tax_ct + amount;

        //Display amount of purchase, state sales tax, and country sales tax, and total of sale
        System.out.printf("SubTotal   : $ %,.2f", + amount);
        System.out.printf("\nState Tax  : $ %,.2f", tax_st);
        System.out.printf("\nCounty Tax : $ %,.2f", tax_ct);
        System.out.printf("\nTotal      : $ %,.2f", total);
    }
}
