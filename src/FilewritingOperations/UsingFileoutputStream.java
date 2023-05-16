package FilewritingOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileoutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UsingFileoutputStream.txt";
		String content = "I like the programming language Java!";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		
		outputStream.write(writeThis);
		
		outputStream.close();

	}

}
