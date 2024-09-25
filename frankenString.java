import java.util.Scanner;

public class frankenString {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = keyboard.next();
        System.out.println("Now enter another string.");
        String b = keyboard.next();
        char first_b = b.charAt(0);
        int a_len = a.length();
        String rest_a = a.substring(1, a_len);
        String switched = ("" + first_b + "" + rest_a );
        System.out.println("Ok, I frankensteined your string.");
        System.out.print("Here is your result: ");
        System.out.println(switched);
        keyboard.close();
    }
}
