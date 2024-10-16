
import java.util.Scanner;

public class morsecode
{
	@SuppressWarnings("resource")
  public static void main( String args[] )
	{

    Scanner keyboard = new Scanner(System.in);
      int shutupcomputer = 0;
      while ( shutupcomputer == 0 ){

        System.out.println("Enter a word!");

    String morse = keyboard.nextLine();
    String morse2 = morse.toUpperCase();

    String [] code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                     "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", 
                     ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
    String [] english = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S","T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String word = "";
    int goodletter = 0;
      for (char let : morse2.toCharArray() ){
       for (int i = 0; i < 36; i++){
        String let2 = let + "";
         if (english[i].equals(let2)){
           String ret = code[i];
           word = word + " " + ret;
           goodletter ++;
         }
       }
     }
     if (goodletter == morse.length()){
      System.out.println( morse + " in morse code is " + word);
	} else {
    System.out.println("You entered a character that's not a letter or a number. Don't do that again.");
  }
}

  }
}