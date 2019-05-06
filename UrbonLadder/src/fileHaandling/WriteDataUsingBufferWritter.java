package fileHaandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class WriteDataUsingBufferWritter {

	public static void main(String[] args) throws Exception {
		
		
		File file= new File("C:\\Users\\MANISH SUKLA\\Desktop\\gitttt\\Practice\\UrbonLadder\\data\\filehandeling.txt");
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        for (int i = 1; i <15; i++)
           {
    	     bw.write("This is line number "+i);
             bw.newLine();
      
	       }
	   bw.close();	
		
		
	}
}
