import java.util.Scanner;

public class ScannerTest
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age = 0;

		System.out.print("Enter your age :: ");
		age = keyboard.nextInt();

			if ((age < 5 && age >=0)){
				System.out.println("How are you typing this");
			} else if (age > 100){
				System.out.println("How are you not dead");
			} else if (age < 0){
				System.out.println("Liar.");
			} else if ((age >5 && age <=18)){
				System.out.println("Go do your homework");
			} else if (age>70){
				System.out.println("Go back to the retirement home");
			} else {
				System.out.println("Don't you have a job you should be doing? Are you slacking off?");
			}
    keyboard.close();
	}
}