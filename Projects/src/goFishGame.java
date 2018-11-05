import java.util.ArrayList;
import java.util.Scanner;

public class goFishGame
	{
		static String name;
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				userWelcome();
				
				ArrayList<Card>hand= new ArrayList<Card>();
			}
		public static void userWelcome()
			{
				System.out.println("Hello! What's your name?");
				name = userInput.nextLine();
				System.out.println("Hi there " + name + "!");
			}
		public void goFishEasy()
			{
				System.out.println("You are given 5 out of 26 cards. Try to get as many books as you can");
			}
		public void goFishHard()
			{
				System.out.println("You are given 7 out of 52 cards. Try to get as many books as you can");
			}
	}
