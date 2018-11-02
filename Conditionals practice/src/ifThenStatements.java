import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class ifThenStatements
	{
		static int guess;
		static Scanner userInput = new Scanner(System.in);
		public static void main (String[] args)
		{
				
			//Guessing game magic number
		System.out.println("Let's play a guessing game! Pick a number from 1-50");
		int randomNumber = (int)(Math.random()*10)+1;
		boolean isWrong = true; 
		while (true)
		int guess = userInput.nextInt();
		if (guess < randomNumber)
				{
					System.out.println("Too low!");
				}
			else if (guess > randomNumber)
				{
					System.out.println("Too high!");
				}
			else
				{
					isWrong = false;
					System.out.println("Congrats");
				}
		public static void greetPlayer()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				
				if (name.equals ("Jim"))
					{
						System.out.println("Oh, it's you.");
						System.out.println("Wow Jim, your hair looks weird today!");
					}
				else if (name.equals("Pam"))
					{
						System.out.println("How are you today?");
						String day = userInput.nextLine();
						if (day.equals("Good"))
							{
								System.out.println("That's good to hear!");
							}
						else
							{
								System.out.println("I'm sorry about that");
							}
					}
				else
					{
						System.out.println("Hello, " + name + "!");
						System.out.println("How is the weather?");
						String weather = userInput.nextLine();
						System.out.println("Good");
					}
						System.out.println("What is your age?");
			
						int age = userInput.nextInt();
						if (age>(18))
							{
								System.out.println("You're too young!");
							}
						else
							{
								System.out.println("You're too old!");
							}	
			}
		}
		
	}
