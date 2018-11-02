import java.util.Scanner;

public class challengeOne
	{
		public static void main(String[] args)
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Tell me a number and I'll tell you if it's even or odd");
			int number = userInput.nextInt();
			if (number % 2 == 0)
				{
					System.out.println(number + " is even");
				}
			else
				{
					System.out.println(number + " is odd");
				}
			System.out.println("Give me a year and I will tell you if it's a leap year or not");
			int year = userInput.nextInt();
			if ( year%400 == 0 && year%4==0)
				{ 
					System.out.println(year + " is a leap year");
				}
			else if (year%100 == 0 && year%400 != 0 )
				{
					System.out.println(year + " is not a leap year");
				}
			else if (year%4==0)
				{
					System.out.println(year + " is a leap year");
				}
			else {
					System.out.println(year + " is not a leap year");
				}
		}
	}
