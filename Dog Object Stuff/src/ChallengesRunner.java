import java.util.ArrayList;

public class ChallengesRunner
	{
		public static void main(String[] args)
		{
			ArrayList<Challenges>highscores = new ArrayList<Challenges>();
			highscores.add(new Challenges(.22));
			highscores.add(new Challenges (8.4));
			highscores.add(new Challenges (4.8));
			highscores.add(new Challenges (5.4));
			highscores.add(new Challenges (6.1));
			for (int i=0; i<5; i++)
				{
					System.out.println(highscores.get(i).getScore());
				}
			double total = 0;
			for (int i=0; i<highscores.size(); i++)
				{
					total = total + highscores.get(i).getScore();
				}
			System.out.println("The total of all those numbers is " + total);
			highscores.remove(0);
			highscores.add(new Challenges (5.7));
			highscores.add(new Challenges (4.9));
			for (int i=0; i<highscores.size(); i++)
				{
					System.out.println(highscores.get(i).getScore());
				}
			double average = 0;
			for (int i=0; i<5; i++)
				{
					average = average + highscores.get(i).getScore();
				}
			average = average/highscores.size();
			System.out.println("The average of those numbers is " + average);
		}
	}
