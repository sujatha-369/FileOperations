package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "UsingBufferWriter.txt";
	    String  currentLine;
        FileReader filereader = new FileReader(location);
        BufferedReader bufferReader = new BufferedReader(filereader);
        while((currentLine = bufferReader.readLine())!=null)
        {
        	System.out.println(currentLine);
        }        
        
	}

}
