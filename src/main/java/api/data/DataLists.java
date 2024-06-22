package api.data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//class for list data to assert in API
public class DataLists {
	
	@SuppressWarnings("unchecked")
	public JSONArray genderizeDataArray() {//function for list data to assert in API genderize
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonItem = new JSONObject();
		jsonItem.put("name", "Isabella");
		jsonItem.put("expectedGender", "female");
		jsonArray.add(jsonItem);
		jsonItem = new JSONObject();
		jsonItem.put("name", "Olivia");
		jsonItem.put("expectedGender", "female");
		jsonArray.add(jsonItem);
		jsonItem = new JSONObject();
		jsonItem.put("name", "Ethan");
		jsonItem.put("expectedGender", "male");
		jsonArray.add(jsonItem);
		jsonItem = new JSONObject();
		jsonItem.put("name", "Christopher");
		jsonItem.put("expectedGender", "male");
		jsonArray.add(jsonItem);
		jsonItem = new JSONObject();
		jsonItem.put("name", "Sophia");
		jsonItem.put("expectedGender", "female");
		jsonArray.add(jsonItem);
		
		return jsonArray;
	}
	
}
