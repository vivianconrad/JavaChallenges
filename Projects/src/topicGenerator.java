import java.util.Scanner;

public class topicGenerator
	{
		static Scanner userInput = new Scanner(System.in);
		static String name;
		static int number;
		public static void main (String[] args)
			{
				userWelcome();
				ideaChooser();
			}
		public static void userWelcome()
			{
				System.out.println("What's your name?");
				name = userInput.nextLine();
				System.out.println("Welcome " + name + "! This is a speech topic idea chooser");
			}
		public static void ideaChooser()
			{
				System.out.println("How many ideas do you have?");
				number = userInput.nextInt();
				String[] ideaList = new String [number];
				for (int i = 0; i<number; i++)
					{
						System.out.println("What is idea #" + (i+1) + " ?");
						Scanner userInput1 = new Scanner (System.in);
						ideaList[i] = userInput1.nextLine();
					}
				int randomNumber = (int)(Math.random()*number);
				System.out.println("Okay " + name + " you should write a speech on " + ideaList [randomNumber] + "!");
			}
	}
 