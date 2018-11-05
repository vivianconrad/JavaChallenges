import java.util.Random;
import java.util.Scanner;

public class ogGame
	{
		static Scanner userInput = new Scanner(System.in);
		static String name;
		static int gameChoice;
		public static void main (String[] args)
		{
			userWelcome();
			//playGame();
			goFish();
		}
		public static void userWelcome()
			{
				System.out.println("Hello! What's your name?");
				name = userInput.next();
				System.out.println("Hi " + name + "! This is go fish");
			}
		public static void playGame()
			{
				System.out.println("Press 1 to play go fish. Press 2 to play BS");
				gameChoice = userInput.nextInt();
				if (gameChoice == 1)
					{
						System.out.println("You chose Go Fish!");
						goFish();
					}
				else if (gameChoice==2)
					{
						System.out.println("You chose BS");
						bolognaSandwich();
					}
				else
					{
						System.out.println("That's not a valid answer! Press 1 for Go Fish or 2 for BS");
					}
			}
		public static void goFish()
			{
				System.out.println("Go fish!");
				System.out.println("You are given 5 out of 20 cards. Try to get all 4 of each card");
				Random generate = new Random();
			    String[] randomCards = new String [5];
			    	randomCards[0] = "Dog";
			    	randomCards[1] = "Cat";
			    	randomCards[2] = "Hedgehog";
			    	randomCards[3] = "Bird";
			    	randomCards[4] = "Lizard";
			    System.out.println("Your cards are:");
			    int dogCounter = 0;
			    int catCounter = 0;
			    int hogCounter = 0;
			    int birdCounter = 0;
			    int lizardCounter = 0;
			    String[] userCards = new String [5];
			    for (int i = 0; i<5; i++)
			    	{
			    		userCards[i] = randomCards[(int)(Math.random()*5)];
			    		System.out.print(userCards[i] + " ");
			    		if (randomCards.equals ("Dog"))
			    			{
			    				dogCounter++;
			    			}
			    		if (randomCards.equals ("Cat"))
			    			{
			    				catCounter++;
			    			}
			    		if (randomCards.equals ("Hedgehog"))
			    			{
			    				hogCounter++;
			    			}
			    		if (randomCards.equals ("Bird"))
			    			{
			    				birdCounter++;
			    			}
			    		if (randomCards.equals (""))
			    			{
			    				lizardCounter++;
			    			}
			    	}
				System.out.println("You have " + dogCounter + " dog cards. You need " + (dogCounter-1) + " more");

			    
			}
		public static void firstDeck()
			{
				
			}
		public static void goFishComputer()
			{
				
			}
		public static void bolognaSandwich()
			{
				System.out.println("BS = bologna sandwich!");
			}
	}
