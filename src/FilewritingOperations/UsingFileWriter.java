package FilewritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        // file location
		//file content
		
		String location = "UsingFileWriter.txt";
		String content = "Learning Java is a simple!";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
	}

}
