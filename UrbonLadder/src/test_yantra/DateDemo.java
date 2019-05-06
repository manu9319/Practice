package test_yantra;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args)
	{
		LocalDate ld = LocalDate.now();
		String mon = DateDemo.getDate(ld);

		
	}

	public static String getDate(LocalDate ld)
	{
	   String month = ld.getMonth().toString();
	   String mon = month.substring(0, 1).concat(month.substring(1,3).toLowerCase());
		return mon;
	}
	

}
