package fileHaandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteDataInTxtFile {

	public static void main(String[] args) throws Exception 
	{
		//write data in text file 
		FileOutputStream fout=new FileOutputStream("C:\\Users\\MANISH SUKLA\\Desktop\\gitttt\\Practice\\UrbonLadder\\data\\filehandeling.txt");
		ObjectOutputStream obOut=new ObjectOutputStream(fout);
		String str="my name is manu ";
		obOut.writeObject(str);
	
		//Read  data from  text file 
		FileInputStream fin=new FileInputStream("C:\\Users\\MANISH SUKLA\\Desktop\\gitttt\\Practice\\UrbonLadder\\data\\filehandeling.txt");
		ObjectInputStream obin=new ObjectInputStream(fin);
		
		Object str3 = obin.readObject();

	System.out.println(str3);

	}

}
