import java.util.Scanner;

public class intro
	{
		static String name;
		static Scanner userInput = new Scanner(System.in);
		static String answer;
		public static void main(String[] args)
			{
				greetPlayer();
				insideVoice();
				verticalLetters();
				countVowels();
			}
		
		public static void greetPlayer()
			{
				System.out.println("Hello! What's your name?");
				name = userInput.nextLine();
				System.out.println("Hi there " + name + "!");
			}
		public static void insideVoice()
			{
				System.out.println(name + ", give me an uppercase phrase");
				answer = userInput.nextLine();
				String firstLetter = answer.substring(0, 1);
				String rest = answer.substring(1);
				System.out.println(firstLetter + rest.toLowerCase());
			}
		public static void verticalLetters()
			{
				for (int i = 0; i < answer.length(); i++)
					{
						System.out.println(answer.substring(i, i+1));
					}
			}
		public static void countVowels ()
			{
				System.out.println("Give me a sentence  and I'll tell you how many vowels there are");
				
				String sentence = userInput.nextLine();
				sentence = sentence.toLowerCase();
				int counter = 0;
				for (int i = 0; i < sentence.length(); i++)
					{
						switch (sentence.substring(i, i+1))
							{
								case "a":
								case "e":
								case "i":
								case "o":
								case "u":
									{
										counter++;
										break;
									}
							}
					}
				if (counter==1)
					{
						System.out.println("There is " + counter + " vowel in that sentence");
					}
				else if (counter==0)
					{
						System.out.println("There are no vowels in that sentence :/");
					}
				else
					{
						System.out.println("There are " + counter + " vowels in that sentence.");
					}
				
			}
		}
	
