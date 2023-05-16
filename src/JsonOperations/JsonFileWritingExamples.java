package JsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWritingExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Tamil School");
		jsonObject.put("Age", "3");
	
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("Magical Smile");
		jsonArray.add("Magnetic Eye");
		
		jsonObject.put("Special Features", jsonArray);
		
		FileWriter fileWriter = new FileWriter("Tamil.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
	}

}
