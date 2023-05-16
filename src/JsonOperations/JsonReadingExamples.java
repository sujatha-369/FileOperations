package JsonOperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExamples {
	
	 

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser parser = new JSONParser();
		
		FileReader reader = new FileReader("Tamil.json");
		
		Object parsedObject = parser.parse(reader);
		
		JSONObject jsonObject = (JSONObject) parsedObject;
		
		String Name = (String) jsonObject.get("Name");
		long Age =  (long) jsonObject.get("Age");
		
		JSONArray array = (JSONArray) jsonObject.get("Special Features");
		
	    Iterator<String> iterator = array.iterator();
	    System.out.println("Name is "+Name);
	    System.out.println("Age is "+Age);
	    while(iterator.hasNext())
	    {
	    	System.out.println("Special Features "+ iterator.next());
	    	
	    }
				
	
	}

}
