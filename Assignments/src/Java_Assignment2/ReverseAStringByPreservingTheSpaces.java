//Write a java program to reverse a given string with preserving the position of spaces?
package Java_Assignment2;

import java.util.Scanner;

public class ReverseAStringByPreservingTheSpaces
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string  : ");
		String str = s.nextLine();
        char[] inputArray = str.toCharArray();  
		char[] result = new char[inputArray.length];   
		        for (int i = 0; i < inputArray.length; i++)
		        {  
		            if (inputArray[i] == ' ')
		            {  
		                result[i] = ' ';  
		            }  
		        }  
		          
		        int j = result.length-1 ;  
		        for (int i = 0; i < inputArray.length; i++) 
		        {  
		                if (inputArray[i] != ' ')
		                {  
		                    if (result[j] == ' ')
		                    {  
		                        j--;  
		                    }     
		                    result[j--] = inputArray[i];    
		                }  
		        }  
		        System.out.println(String.valueOf(result));  
		    }   	
	}


