import java.util.Scanner;

//bag of cookies = 40 cookies
//10 servings in bag that each serve = 300 calories
public class Cookies_Calories {
    public static void main (String[] args) {

        //ask user to enter # of cookies eaten
        Scanner scan = new Scanner (System.in);
        System.out.print("Cookies Eaten: ");
        double cookies = scan.nextDouble();

        //calculate number of calories in 1 cookie
        //double one_cookie = .25; // 1 cookie = .25 servings
        //double cookie_cal = 7.5; // 1 cookie = 7.5 calories
        double total_cal = 7.5 * cookies;

        //report number of total calories consumed
        System.out.println(cookies + " cookies has " + total_cal + " calories.");
    }
}
