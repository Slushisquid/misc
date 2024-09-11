import java.util.Scanner;
import java.lang.Math;

public class volume {
    public static void main ( String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What shape would you like to find the volume of?");
        System.out.println("Type 0 for cube");
        System.out.println("Type 1 for pyramid");
        System.out.println("Type 2 for cone");
        System.out.println("Type 3 for sphere");
        int shape = keyboard.nextInt();
        if (shape == 0){
            System.out.println("What is the side length of your cube? Please enter a double.");
            double side = keyboard.nextDouble();
            double cubevolume = (side * side * side);
            System.out.println("Your cube's volume is " + cubevolume);
        } else if (shape == 1){
            System.out.println("What is the length of the base of your pyramid? Please enter a double.");
            double length = keyboard.nextDouble();
            System.out.println("What is thw width of the base of your pyramid? Please enter a double.");
            double width = keyboard.nextDouble();
            System.out.println("What is the height of your pyramid? Please enter a double.");
            double height = keyboard.nextDouble();
            double pyramidvolume = ((length * width * height)/3);
            System.out.println("Your pyramid's volume is " + pyramidvolume);
        } else if (shape == 2){
            System.out.println("What is the radius of the base of your cone? Please enter a double.");
            double radius = keyboard.nextDouble();
            System.out.println("What is the height of your cone? Please enter a double.");
            double height = keyboard.nextDouble();
            double conevolume = ((Math.PI * Math.pow(radius, 2.0))*(height/3));
            System.out.println("Your cone's volume is " + conevolume);
        } else if (shape == 3){
            System.out.println("What is the radius of your sphere? Please enter a double.");
            double radius = keyboard.nextDouble();
            double spherevolume = (Math.pow(radius, 3.0)*((Math.PI)*(4/3)));
            System.out.println("Your sphere's volume is " + spherevolume);
        } else {
            System.out.println("Enter one of the choices, dumbass!");
        }
        keyboard.close();
    }
}
//STOP WITH THE FRUIT
//PLS EXECUTE!!