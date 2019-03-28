package Assignment2;

import java.util.Scanner;

public class MarriageCriteria 
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the details ");
		System.out.println("Enter the gender( f or m )");
		String gender=s.next();
		System.out.println("Enter the age ");
		int age= s.nextInt();
		
		 if(gender.equals("m"))
		 {
			 if (age>=21)
			 {
				System.out.println("eligible for marriage");
			}
			 
			 else
			 {
				 System.out.println("not eligible for marriage");
			 }
		 }
		 else if(gender.equals("f"))
		 {
			 if (age>=18)
			 {
				System.out.println("eligible for marriage");
			}
			 
			 else
			 {
				 System.out.println("not eligible for marriage");
			 }
		 }
		
		
		
	}

	
}
