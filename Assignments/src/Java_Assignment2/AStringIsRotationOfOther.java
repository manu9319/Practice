//Write a java program to check whether one string is a rotation of another?
package Java_Assignment2;

import java.util.Scanner;

public class AStringIsRotationOfOther 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the string1  : ");
		String str1 = s.next();
		System.out.println("Enter the string2  : ");
		String str2 = s.next();
		if (str1.length()!=str2.length())
		{
			System.out.println("String1 is not rotation of string2");
		}
		String str3=str1+str1;
		if (str3.contains(str2)) 
		{
			System.out.println("String1 is rotation of string2");
		}
		else
		{
			System.out.println("String1 is not rotation of string2");
		}

	}

}
