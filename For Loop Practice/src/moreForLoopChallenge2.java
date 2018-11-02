import java.util.Scanner;

public class moreForLoopChallenge2
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Give me a low number");
				int lowNumber = userInput.nextInt();
				System.out.println("Give me a high number");
				Scanner userInput2 = new Scanner(System.in);
				int sum = 0;
				int highNumber = userInput2.nextInt();
				for (int i = lowNumber; i<=highNumber; i = i + 1)
					{
						sum+=i;
					}
				System.out.println("The sum of all the numbers in your range is " + sum);
			}
	}
