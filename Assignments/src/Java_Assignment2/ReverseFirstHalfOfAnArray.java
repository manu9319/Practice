//Reverse only first half of the elements of given array?
package Java_Assignment2;

public class ReverseFirstHalfOfAnArray
{
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6};
		int [] b=new int[a.length];
		for (int i = b.length/2-1,j=0; i >=0 ; i--)
		{
			b[j++]=a[i];
		}
		for (int i = b.length/2; i < b.length; i++)
		{
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
		  System.out.println(b[i]);	
		}
	}
}
