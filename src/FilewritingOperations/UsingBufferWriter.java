package FilewritingOperations;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;


public class UsingBufferWriter {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "UsingBufferWriter.txt";
		String content = "Spring is coming!...";
		
		FileWriter filewriter = new FileWriter(location);
		
		BufferedWriter bufferwriter = new BufferedWriter(filewriter);
		bufferwriter.write(content);
		bufferwriter.close();
				
	}

}
