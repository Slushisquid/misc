import java.lang.Math;
import java.util.Scanner;

public class milesPerHour {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many hours did you drive for?");
        int hrs = keyboard.nextInt();

        System.out.println("How many additional minutes did you drive for?");
        int mins = keyboard.nextInt();

        System.out.println("How far did you drive? Enter in miles, please.");
        System.out.println("...We're in America. Act like it.");
        int dist = keyboard.nextInt();

        int mins2 = hrs*60;
        mins = mins + mins2;
        double rate = (double)dist/mins;
        rate = rate*60;
        double rateRounded = Math.round(rate);

        System.out.println("Great, thanks. I have done the calculations to find your average speed.");
        System.out.println("Your average speed was " + rateRounded + " miles per hour.");
        System.out.println("I will not convert it to kilometers per hour. Do it yourself.");

        keyboard.close();
    }
}
