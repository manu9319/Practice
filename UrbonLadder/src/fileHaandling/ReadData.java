package fileHaandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadData {

	public static void main(String[] args) throws Exception 
	{
			FileInputStream fin=new FileInputStream("C:\\Users\\MANISH SUKLA\\Desktop\\gitttt\\Practice"
					+ "\\UrbonLadder\\data\\filehandeling.txt");
			ObjectInputStream obin=new ObjectInputStream(fin);
			Object ob = obin.readObject();
            System.out.println(ob);
	}

}
//read data from text file