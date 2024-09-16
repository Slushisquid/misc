import java.lang.Math;
import java.util.*;

public class gambling {
    public static void main (String[]args){
        int credits = 100;
        int betnum = 1;
        boolean betclick = true;
        String deck[] = {"2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♦", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥", "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠" }; 
        deck = shuffleArray(deck);
        System.out.println(Arrays.toString(deck)); // thanks Stack Overflow

    }
    static String[] shuffleArray(String[] array){ //Thanks Stack Overflow (again)
    Random rnd = new Random();
    for (int i = array.length - 1; i > 0; i--){
      int index = rnd.nextInt(i + 1);
      String a = array[index];
      array[index] = array[i];
      array[i] = a;
    }
    return array;
  }
}