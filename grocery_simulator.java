import java.util.Scanner;

public class grocery_simulator{
    public static void main (String[] args){
        double appleprice_LB = 3.00;
        double bananaprice_LB = 0.59;
        double cerealprice_box = 3.99;
        double milkprice_gallon = 4.01;
        double candybarprice_single = 1.79;
        double sushiprice_roll = 5.40;

        int applecount = 0;
        int bananacount = 0;
        int cerealcount = 0;
        int milkcount = 0;
        int candycount = 0;
        int sushicount = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Quinn: Welcome to Quinn's (very small) grocery store!");
        System.out.println("Quinn: Would you like to buy something today?");
        System.out.println("Type 0 for no. Type 1 for yes.");
        int notaboolean = keyboard.nextInt();
        if (notaboolean == 0){
            System.out.println("Quinn: Well, what are you doing here, then?");
        } else {
            System.out.println("Quinn: Great! Oh, wow, it's nice to have a customer...");
            System.out.println("Quinn: (They usually want more than the 6 items we sell... how absurd!)");
            System.out.println("Quinn: So, would you like to buy an apple? Or perhaps a pound of them?");

            System.out.println("Quinn: Awesome! How many pounds would you like?");
            System.out.println("Type the integer amount of pounds you would like.");
            int applesbought = keyboard.nextInt();
            if (applesbought == 0){
                System.out.println("Quinn: Wait, I thought you said you wanted some apples.");
            } else {
                 applecount = applesbought;
            }
        System.out.println("Quinn: OK, what about bananas? How many pounds of those would you like?");
        System.out.println("Enter the number of pounds of bananas you would like.");
        bananacount = keyboard.nextInt();
        System.out.println("Quinn: Alright... I know you need something that's not just produce.");
        System.out.println("Quinn: So, would you like to buy a box of cereal? Or two? Or three?");
        System.out.println("Quinn: ...Or our whole stock? Please?");
        System.out.println("Quinn: (I need to pay the mortgage!)");
        System.out.println("Enter the number of boxes of cereal you want to buy.");
        cerealcount = keyboard.nextInt();
        if (cerealcount == 0){
            System.out.println("Quinn: Okay... No cereal for you then.");
            System.out.println("Quinn: Um...");
            System.out.println("Quinn: Well, how about some milk?");
        } else {
            System.out.println("Quinn: Oh, great! Thank you, thank you!");
            System.out.println("Quinn: Now, how about some milk for your cereal?");
            System.out.println("Quinn: You can't eat it dry, you know!");
            System.out.println("Quinn: Well, you can... Anyways.");
        }
        System.out.println("Would you like to buy a gallon of milk? It gives you big strong bones!");
        System.out.println("Enter the number of gallons of milk you want.");
        milkcount = keyboard.nextInt();
        if ((cerealcount > 0) && (milkcount == 0)){
            System.out.println("Quinn: Oh, you like your cereal without milk?");
            System.out.println("Quinn: That's... nice. Good for you.");
        } else if ((cerealcount > 0) && (milkcount > 0)){
            System.out.println("Quinn: Say, do you put the milk in before the cereal? Or after?");
            System.out.println("Quinn: Haha, I won't make you answer that.");
        }
        System.out.println("Quinn: Well, moving on, perhaps you want some candy?");
        System.out.println("Quinn: For your kids? Or for you if you like to treat yourself!");
        System.out.println("Quinn: Would you like to buy a bar? Or five? Haha, or ten?");
        System.out.println("Quinn: (If you don't buy any, I'll probably eat them all.)");
        System.out.println("Enter the number of candy bars you want.");
        candycount = keyboard.nextInt();
        if (candycount == 0){
            System.out.println("Quinn: Ah, I see, you're eating healthy.");
        }
        System.out.println("Quinn: And we have sushi here, too! It was requested by a friend, haha.");
        System.out.println("Quinn: Do you... uh... want any?");
        System.out.println("Enter the number of sushi rolls you would like.");
        sushicount = keyboard.nextInt();

        System.out.println("Quinn: Well, that's all the items in my store.");
        System.out.println("Quinn: (You really don't need anything else, do you?)");
        System.out.println("Quinn: Okay, it's time for checkout.");

        double appletotal = (appleprice_LB * applecount);
        double bananatotal = (bananaprice_LB * bananacount);
        double cerealtotal = (cerealprice_box * cerealcount);
        double milktotal = (milkprice_gallon * milkcount);
        double candytotal = (candybarprice_single * candycount);
        double sushitotal = (sushiprice_roll * sushicount);
        double totalprice = (appletotal + bananatotal + cerealtotal + milktotal + candytotal + sushitotal);
        
        System.out.println("Quinn scans all of your items.");
        System.out.println("Quinn presses a few buttons on the register.");
        System.out.println("Quinn: Ok! Your total comes to $" + totalprice + "!");

        if (totalprice == 0){
            System.out.println("Quinn: Wait, you didn't buy anything!");
            System.out.println("Quinn: Why did you even come to my store?");
            System.out.println("You shrug and walk out.");
        } else {

        System.out.println("What payment method will you be using today?");
        System.out.println("Enter 0 for cash. Enter 1 for card. Enter 2 for postage stamps. Enter 3 to not pay.");
        int payment_method = keyboard.nextInt();
        if (payment_method == 0){
            System.out.println("Quinn: Cash? Okay...");
            System.out.println("You hand Quinn a crumpled up wad of cash you pulled out of your pocket.");
            System.out.println("Quinn: Uhm... Thanks...");
            System.out.println("Quinn attempts to flatten the bills in vain.");
            System.out.println("Quinn: (don't you have a wallet?)");
            System.out.println("Quinn grabs your change");
            System.out.println("Quinn hands you your change.");
            System.out.println("Quinn: Thank you! Come again soon! ...(Please!)");
        } else if (payment_method == 1){
            System.out.println("You swipe your card");
            System.out.println("Quinn: Thank you! Come again soon! ...(Please!)");
        } else if (payment_method == 2){
            System.out.println("Quinn: Postage stamps?");
            System.out.println("Quinn: I guess they are legal tender.");
            System.out.println("You hand Quinn a pile of stamps.");
            System.out.println("Quinn: Thank yo- um.");
            System.out.println("Quinn: Are you crying?");
            System.out.println("You explain to Quinn that you are an avid stamp collector but have to sell these to pay for food.");
            System.out.println("Quinn: Aw, man, I'm so sorry!");
            System.out.println("Quinn: But... I kinda need you to pay for groceries.");
            System.out.println("You silently curse Quinn for ruining your stamp collecting hobby, but you pay up.");
            System.out.println("Quinn: Thank you, come again! ...(Please don't. I hate when people pay in stamps.)");
            System.out.println("Quinn: (What am I gonna do with these? I never even send mail.)");
        } else if (payment_method == 3){
            System.out.println("Quinn: You're not paying? Haha, funny joke.");
            System.out.println("You grab the bag of food and begin to run away.");
            System.out.println("Quinn: Wai- hold on a second! Where are you going?");
            System.out.println("Quinn: SECURITY, ARREST THIS PERSON!");
            System.out.println("Quinn: Wait... I'M SECURITY!");
            System.out.println("Quinn: Dammit, I can't afford to run this stupid business anyways!");
            System.out.println("Quinn gives you the middle finger and begins to attempt to sell the store.");
            System.out.println("You heartless bastard. He needed that money.");
            System.out.println("You then get run over by an 18 wheeler truck.");
            System.out.println("You deserved it. Bitch.");
        }
        }
        }
      keyboard.close();
    }
}