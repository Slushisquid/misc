import java.util.Scanner;


public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
      upperBound = stop;
	}

	public void playGame()
	{
        int playerguess = 0;
		@SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);
        int ans = (int)(Math.random() * upperBound + 1);
    
      int guesses = 0;
  
      while (playerguess != ans){
        guesses++;
        System.out.println("Enter a number between 1 and " + upperBound + " ");
         playerguess = keyboard.nextInt();
        if ((playerguess > upperBound) || (playerguess < 1)){
          System.out.println("Number out of range!");
        } else {
         if (playerguess == ans){
           
         } else {
            int response = (int)(Math.random() * 5);
             String[] rejections = {"Nope! Wrong. Try again.", "Too bad, try again.", "Better luck on the next guess!",
                                    "Sorry, no. Try again.", "Absolutely not!"};
           System.out.println(rejections[response]);
           if (playerguess > ans){
           System.out.println("Try guessing lower.");
         } else if (playerguess < ans){
         System.out.println("Try guessing higher.");
        }
      }
    }
    }
       int response = (int)(Math.random() * 5);
             String[] affirmations = {"You did it! Good job.", "Congrats, you got it right!", "Wow, amazing!",
                                      "You're a master guesser.", "You guessed correctly!"};
           System.out.println(affirmations[response]);

      System.out.println("It took " + guesses + " guesses to guess " + ans + ".");
    
  
	}
  
	public String toString()
	{
		String output="";
		return output;
	}
}