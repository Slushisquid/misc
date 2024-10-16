import java.util.Scanner;

public class RPS
{
	public static void main(String args[])
	{
      @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);
    
		
      //add in a do while loop after you get the basics up and running
      int currentRound = 0;
      int rounds = 10;
  
      while (rounds != currentRound ){
        currentRound += 1;
        String player = "";
        System.out.print("type in your prompt [R,P,S] :: ");
        //read in the player value
        player = keyboard.next();
        RockPaperScissors game = new RockPaperScissors(player);		
        System.out.println(game.determineWinner());
        System.out.println(game);
      }
	}
}