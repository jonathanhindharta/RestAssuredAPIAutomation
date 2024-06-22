package api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import api.endpointresponses.ResponseAssertionLists;
import api.data.DataLists;

public class GenderizeTest extends ResponseAssertionLists  {
	DataLists dataList = new DataLists();
	
	@Test
	public void TestCertainName() {
		for(int i=0;i<dataList.genderizeDataArray().size();i++) {
			//call data for input and expected
			JSONObject object = (JSONObject)dataList.genderizeDataArray().get(i);
			String inputName = (String)object.get("name");
			String inputGender = (String)object.get("expectedGender");
			//call function to call api and assert response
			getGenderizeResponseAssertions(inputName, inputGender);
		}
		
		
	}
}
