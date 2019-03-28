package Assignment2;

import java.util.Scanner;

import net.bytebuddy.asm.Advice.Exit;

public class ReportCard
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the marks");
		String []str= {"Hindi","English","math","physics","chemistry"};
		int marks[]= new int[str.length];
		int sum=0;
		
		for (int i = 0; i < str.length; i++)
		{
			System.out.print("Enter the  marks of  = "+str[i]);
			System.out.println();
			marks[i]=s.nextInt();
			if (marks[i]<33)
			{
			System.out.println("fail");	
			System.exit(2000);
			}
			sum=sum+marks[i];
		}
		
		if (sum>=(33*5) && sum<300)
		{
		System.out.println("pass");
		}
		else if (sum<33*5)
		{
			System.out.println("fail");
		}
		else if (sum>=300&&sum<375)
		{
			System.out.println("first class");
		}
		
		else if (sum>=375)
		{
			System.out.println("distinction");
		}
	}

	
}
