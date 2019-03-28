//Write a java program to find duplicate characters in a string?
package Java_Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateCharInString {

	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string  : ");
		String str1 = s.next();
		char[] c= str1.toCharArray();
		ArrayList<Character>al1=new ArrayList<>();
		HashSet<Character>hs=new HashSet<>();
		for (int i = 0; i < c.length; i++)
		{
			if (hs.contains(c[i]))
			{
			 	al1.add(c[i]);
			}
			hs.add(c[i]);
		}
		System.out.println("unique characters in string = "+hs);
		System.out.println("Duplicates characters in String = "+al1);

	}

}
