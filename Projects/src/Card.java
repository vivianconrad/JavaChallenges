
public class Card
	{
		String type;
		int number;
		
		public Card (String s, int n)
		{
			type = s;
			number = n;
		}

		public String getType()
			{
				return type;
			}

		public void setType(String type)
			{
				this.type = type;
			}

		public int getNumber()
			{
				return number;
			}

		public void setNumber(int number)
			{
				this.number = number;
			}
		
	}
