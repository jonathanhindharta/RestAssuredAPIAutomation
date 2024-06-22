package api.endpointresponses;

import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ResponseAssertionLists extends EndPointLists {
	
	public void getGenderizeResponseAssertions(String name, String genderExpected) {
        //get base url
        baseURI=genderizeBaseURI();
        //System.out.println("name: "+name+" ; genderExpected: "+genderExpected);
        given().
        	get(genderizeEndPointName()+name).//get End Point for using name param
        then().
        	statusCode(200).//assert statusCode to equal 200
        	assertThat().body(matchesJsonSchemaInClasspath("schema.json")).//assert that JSON of response body match schema.json
        	body("name", equalTo(name)).//assert response name to equal param name
        	body("gender", equalTo(genderExpected)); //assert response gender to equal param genderExpected
        
    }
}
