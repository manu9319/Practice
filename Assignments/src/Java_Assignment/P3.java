package Java_Assignment;

public class P3
{
	public static void main(String[] args) 
	{
		int lines=4;
	int chr=lines+5;
	
		for (int i = 0; i < lines; i++)
		{
			for (int j = 0; j <chr; j++)
			{
				if (i==0||i==lines-1||j==0||j==chr-1) 
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		
			
		}

	}

}
