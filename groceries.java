import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class groceries{
    public static void main (String[] args){
    	Scanner keyboard = new Scanner(System.in);
        System.out.println("Friendly reminder not to add more than 2,147,483,647 of any item to the list. Please.");
        HashMap<String, Integer> groceries = new HashMap<>();
        boolean more = true;
        while (more == true){
            System.out.println("What would you like to add to the list?");
            String item = keyboard.next();
            if (groceries.containsKey(item)) {
                System.out.println("You already added this item!");
            } else {
                System.out.println("How many would you like to add?");
                int number = keyboard.nextInt();
                groceries.put(item, number);
                System.out.println("Would you like to keep adding to your list?");
                System.out.println("Type 0 for no, type 1 for yes.");
                int yesno = keyboard.nextInt();
                if (yesno == 0){
                    more = false;
                }
            }
        }
    System.out.println("Here is your grocery list: ");
    for (Map.Entry<String, Integer> entry : groceries.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    System.out.println("Have fun at the grocery store!");
    keyboard.close();
    }
}