import java.util.ArrayList;
import java.util.Scanner;

public class DogRunner
	{
		public static void main(String[] args)
			{
				ArrayList<Dog>kennel = new ArrayList<Dog>();
				System.out.println(kennel.size());
				kennel.add(new Dog ("Golden Retriever", "Sam", 11));
				kennel.add(new Dog ("Chocolate Lab", "Amy", 5));
				kennel.add(new Dog ("Dauchaund", "Pixels", 14));
				kennel.add(new Dog ("Beagle", "Sable", 3));
				kennel.add(new Dog ("Bulldog", "Timmy", 9));
				System.out.println(kennel.size());
				for (int i= 0; i < kennel.size(); i++)
					{
						System.out.println("You have a " + kennel.get(i).getBreed() + " named " + kennel.get(i).getName() + " who is " + kennel.get(i).getAge() + " years old");
					}
				kennel.remove(0);
				for (int i= 0; i < kennel.size(); i++)
					{
						kennel.get(i).setAge(kennel.get(i).getAge()+1);
						System.out.println("You have a " + kennel.get(i).getBreed() + " named " + kennel.get(i).getName() + " who is " + kennel.get(i).getAge() + " years old");
					}
				
			}
		
	}
