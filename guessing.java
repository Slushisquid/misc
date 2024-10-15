import java.util.Scanner;


public class guessing
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do{
		   System.out.print("Guessing Game - how many numbers? ");
			GuessingGame game = new GuessingGame(keyboard.nextInt());
			game.playGame();

		   System.out.print("Do you want to play again? Type y or Y for yes. ");
		   response = keyboard.next().charAt(0);
		} while(response=='Y'||response=='y');
		keyboard.close();
	}
}