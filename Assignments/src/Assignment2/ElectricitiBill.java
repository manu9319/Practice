package Assignment2;

import java.util.Scanner;

public class ElectricitiBill
{
	static Scanner s= new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter the no of units");
		int units=s.nextInt();
		System.out.println("Enter the  arrears");
		double arrears=s.nextInt();
		double fine=arrears*0.1;
		double bills=0;
		double discounts=0;
		  if (units<=50)
		  {
			  bills=units*1.20;
		  }
		  
		  else if (units>50&& units<=100)
		  {
			  bills=50*1.20+(units-50)*2.40;
		  }
		  
		  else if (units>100&& units<=150)
		  {
			  bills=50*1.20+50*2.40+(units-100)*3.60;
		  }
		  
		  else if (units>150&& units<=200)
		  {
			  bills=50*1.20+50*2.40+50*3.60+(units-150)*4.80;
		  }
		  
		  
		  else if (units>200)
		  {
			 
			  bills=50*1.20+50*2.40+(units-100)*3.60;
			  discounts=bills*.05;
			  if(discounts>200)
			  {
				  discounts=200;
			  }
			 
		  }
		  double total= bills+fine+arrears-discounts;
		  System.out.println("Bills  is = "+bills);
		  System.out.println("discounts = "+discounts);
		  System.out.println("fine = "+fine);
		  System.out.println("total payable amount is = "+total);
	}

}
