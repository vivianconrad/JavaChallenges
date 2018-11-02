
public class Dog
	{
		String breed, name;
		int age;
		
		public Dog (String b, String n, int a)	
			{
				breed = b;
				name = n;
				age = a;
			}
		public static void walk()
			{
				System.out.println("Walking");
			}
		public static void fetch()
			{
				System.out.println("Fetiching!!!");
			}
		public String getBreed()
			{
				return breed;
			}
		public void setBreed(String breed)
			{
				this.breed = breed;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getAge()
			{
				return age;
			}
		public void setAge(int age)
			{
				this.age = age;
			}
		
	}
