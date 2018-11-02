
public class moreForLoopChallenge1
	{
		public static void main(String[] args)
			{
				int sum = 0;
				for (int i = 5; i<=100; i = i+5)
					{
						sum+=i; //sum = sum + i
					}
				System.out.println("The summation of all the multiples of 5 between 5 and 100 is " + sum);
			}
	}
