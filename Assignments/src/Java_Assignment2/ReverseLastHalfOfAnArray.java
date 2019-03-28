//Reverse only last half of the elements of given array?
package Java_Assignment2;

public class ReverseLastHalfOfAnArray
{
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6};
		int [] b=new int[a.length];
		for (int i =0; i <b.length/2 ; i++)
		{
			b[i]=a[i];
		}
		for (int i = b.length-1,j=b.length/2; i >=b.length/2; i--)
		{
			b[j++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
		  System.out.println(b[i]);	
		}
	}

}
