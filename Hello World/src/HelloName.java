import java.util.Scanner;

public class HelloName
	{
	public static void main (String[] args)
		{
			System.out.println("Hello World!!");
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "!");
		}
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many pets do you have?");
			String pet = userInput.nextLine();
			System.out.println("Wow, " + pet + "! That's a lot!");
		}
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What grade level are you?");
			String grade = userInput.nextLine();
			System.out.println("Oh " + grade + ", that's cool I guess");
		}
		
	}
