//Do right shift by one for elements of given array?
package Java_Assignment2;

import java.util.Scanner;

public class RightSiftingOfElementInArray
{
	 public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of elements:") ;
	    int n = sc.nextInt();
	 
	    int[] a = new int[n];
	    int[] b = new int[n];
	     System.out.println("Enter the elements") ;
	     for(int i=0;i<n;i++)
	     { 
	         a[i] = sc.nextInt();
	     }
	 
	     System.out.println("Array before shifting");
	     for(int i=0;i<n;i++)
	     {
	         System.out.print(a[i]+" ");
	     }
	     b[0]=a[n-1];
	     System.out.println();
	    
	     
	     for(int i=1;i<n;i++)
	     {
	       b[i]=a[i-1];
	     }
	    
	    
	 
	     System.out.println("Array after shifting one postion in right");
	     for(int i=0;i<n;i++)
	     {
	       System.out.print(b[i]+" ");
	     }
	 } 

}
