//Reverse only odd indexed of the elements of given array?
package Java_Assignment2;

public class ReverseOddIndexOfAnArray 
{
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6};
		int [] Even_index=new int[a.length/2];
		int [] Odd_index=new int[a.length-Even_index.length];
		int [] res=new int[a.length];
		for (int i = 0,j=0,k=0; i < a.length; i++)
		{
			if (i%2!=0) 
			{
				Even_index[k++]=a[i];
			}
			else
			{
				Odd_index[j++]=a[i];
			}
		
		}
		for (int i = 0,j=0,k=Even_index.length-1; i < res.length; i++)
		{
			if (i%2==0) 
			{
			   res[i]=Odd_index[j++];	
			}
			else
			{
				   res[i]=Even_index[k--];	
			}
		}
		
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
		
	}	
	

}
