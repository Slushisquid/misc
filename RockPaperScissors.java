import java.lang.Math;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
    playChoice = "";
    compChoice = "";
	}

	public RockPaperScissors(String player)
	{
       if (player.equals("R")){
        playChoice = "rock";
      } else if (player.equals("P")){
        playChoice = "paper";
      } else if (player.equals("S")){
        playChoice = "scissors";
      } else {
        System.out.println("That's not a valid choice.");
      }
      int max = 3;
      int compNum = (int)(Math.random() * max + 1);
      if (compNum == 1){
        compChoice = "rock";
      } else if (compNum == 2){
        compChoice = "paper";
      } else if (compNum == 3){
        compChoice = "scissors";
      } else {
        System.out.println("uh oh");
      }
	}

	public void setPlayers(String player)
	{
      if (player.equals("R")){
        playChoice = "rock";
      } else if (player.equals("P")){
        playChoice = "paper";
      } else if (player.equals("S")){
        playChoice = "scissors";
      } else {
        System.out.println("That's not a valid choice.");
      }
      int max = 3;
      int compNum = (int)(Math.random() * max + 1);
      if (compNum == 1){
        compChoice = "rock";
      } else if (compNum == 2){
        compChoice = "paper";
      } else if (compNum == 3){
        compChoice = "scissors";
      } else {
        System.out.println("uh oh");
      }
        
	}

	public String determineWinner()
	{
      System.out.println("You picked " + playChoice + ".");
      System.out.println("Computer picked " + compChoice + ".");
		if ((playChoice.equals("rock"))&&(compChoice.equals("scissors"))){
          return "player wins";
        } else if ((playChoice.equals("paper"))&&(compChoice.equals("rock"))){
          return "player wins";
        } else if ((playChoice.equals("scissors"))&&(compChoice.equals("paper"))){
          return "player wins";
        } else if ((playChoice.equals("rock"))&&(compChoice.equals("paper"))){
          return "computer wins";
        } else if ((playChoice.equals("paper"))&&(compChoice.equals("scissors"))){
          return "computer wins";
        } else if ((playChoice.equals("scissors"))&&(compChoice.equals("rock"))){
          return "computer wins";
        } else if ((playChoice.equals("rock"))&&(compChoice.equals("rock"))){
          return "tie";
        } else if ((playChoice.equals("paper"))&&(compChoice.equals("paper"))){
          return "tie";
        } else if ((playChoice.equals("scissors"))&&(compChoice.equals("scissors"))){
          return "tie";
        } else {
          return "something is wrong";
        }
	}

	public String toString()
	{
		return "";
	}
}