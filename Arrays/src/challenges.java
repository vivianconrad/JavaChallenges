
public class challenges
	{
		public static void main (String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				challengeFour();
			}
		public static void challengeOne ()
			{
				System.out.println("This is challenge one");
				String [] officeNames = {"Jim", "Pam", "Dwight", "Temp"};
				System.out.println(officeNames [3]);
			}
		public static void challengeTwo()
			{
				System.out.println("This is challenge two");
				int [] listOfStuff = new int [5];
				listOfStuff[0] = 50;
				listOfStuff[1] = 60;
				listOfStuff[2] = 70;
				listOfStuff[3] = 80;
				listOfStuff[4] = 90;
				System.out.println(listOfStuff[4]);
			}
		public static void challengeThree()
			{
				System.out.println("This is challenge three");
				int [] listOfStuff = new int [5];
						listOfStuff[0] = 50;
						listOfStuff[1] = 60;
						listOfStuff[2] = 70;
						listOfStuff[3] = 80;
						listOfStuff[4] = 90;
				for (int i = 0; i<5; i++)
					{
						System.out.println(listOfStuff[i]);
					}
			}
		public static void challengeFour()
			{
				System.out.println("This is challenge four");
				int [] smallList = new int [6];
				smallList[0] = 3;
				smallList[1] = 4;
				smallList[2] = 5;
				smallList[3] = 6;
				smallList[4] = 8;
				smallList[5] = 15;
				double total = 0;
				for (int i = 0; i<6; i++)
					{
						total = total + smallList[i];
					}
				total = total/smallList.length;
				System.out.println(total);
			}

	}
