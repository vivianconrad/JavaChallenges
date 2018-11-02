import java.util.ArrayList;

public class ArrayListChallenges
	{
		static ArrayList<Double> doubleNumbers = new ArrayList<Double>();
		public static void main (String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
			}

		private static void challengeOne()
			{
				doubleNumbers.add(2.1);
				doubleNumbers.add(1.5);
				doubleNumbers.add(8.6);
				doubleNumbers.add(2.6);
				doubleNumbers.add(5.5);
				doubleNumbers.add(7.8);
				for (int i = 0; i<doubleNumbers.size(); i++)
					{
						System.out.println(doubleNumbers.get(i));
					}
			}

		private static void challengeTwo()
			{
				double total = 0;
				for (int i=0; i<doubleNumbers.size(); i++)
					{
						total = total + (double) doubleNumbers.get(i);
					}
				System.out.println("The sum is " + total);
			}

		private static void challengeThree()
			{
				doubleNumbers.remove(0);
				doubleNumbers.add(4.8);
				doubleNumbers.add(9.5);
				double total = 0;
				for (int i=0; i<doubleNumbers.size(); i++)
					{
						total = total + (double) doubleNumbers.get(i);
					}
				total = total/doubleNumbers.size();
				System.out.println("The average is " + total);
			}
	}
