import java.util.Scanner;
public class Player {
static Scanner userInput = new Scanner(System.in);
	public static void intro()
	{
	System.out.println("Hey there! What is your name?");
	String name = userInput.nextLine();
	System.out.println("Hello " + name + " Want to play blackjack");
	System.out.println("type (1) for the dealer to deal to you");
	}
		

	

}
