package Java_Assignment;

public class P2
{
	public static void main(String[] args) 
	{
		int lines=9;
		int chr=1;
		int sp=lines/2;
	
		for (int i = 0; i < lines; i++)
		{
			for (int j = 0; j < sp; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <chr; j++)
			{
					System.out.print("*");
				
				
			}
			System.out.println();
			if (i<lines/2)
			{
			chr=chr+2;	
			sp--;
			}
			else
			{
				chr=chr-2;	
				sp++;
				}
			
		}

	}

}
