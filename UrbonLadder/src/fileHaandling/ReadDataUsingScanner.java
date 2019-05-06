package fileHaandling;

import java.io.File;
import java.util.Scanner;

public class ReadDataUsingScanner 
{
 public static void main(String[] args) throws Exception 
 {
	 File file=new File("C:\\Users\\MANISH SUKLA\\Desktop\\gitttt\\Practice\\UrbonLadder\\data\\filehandeling.txt");
	  Scanner sc=new Scanner(file);
	  while (sc.hasNextLine())
	  {
		System.out.println( sc.nextLine());
		
	}
	  sc.close();
}
}
