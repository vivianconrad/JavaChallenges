
public class ForEachLoops
	{
		static String [] listOfStuff = new String [6];
		static int [] listOfNumbers = new int [6];
		public static void main (String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				challengeFour();
			}

		private static void challengeOne()
			{
				listOfStuff[0] = "Sam";
				listOfStuff[1] = "Bill";
				listOfStuff[2] = "Jill";
				listOfStuff[3] = "Dill";
				listOfStuff[4] = "Mill";
				listOfStuff[5] = "Will";
				for (String jim : listOfStuff)
					{
						System.out.println(jim);
					}
			}

		private static void challengeTwo()
			{
				for (String jim : listOfStuff)
					{
						System.out.print(jim + " ");
					}
				System.out.println(" ");
			}

		private static void challengeThree()
			{
				listOfNumbers[0] = 50;
				listOfNumbers[1] = 60;
				listOfNumbers[2] = 70;
				listOfNumbers[3] = 80;
				listOfNumbers[4] = 90;
				listOfNumbers[5] = 82;
				for (int pam : listOfNumbers)
					{
						System.out.println(pam*2);
					}
			}

		private static void challengeFour()
			{
				int total = 0;
				for (int dwight : listOfNumbers)
					{
						total = total + dwight;
					}
				System.out.println("The total is " + total);
			}
	}
