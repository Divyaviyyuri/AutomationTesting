package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import io.restassured.RestAssured;
import junit.framework.Assert;

public class TC003_Get_ListOfSubBreedRetriever extends TestBase {
	@BeforeClass
	public void getSubBreedList(){
		log.info("****************TC003_Get_ListOfSubBreedRetriever ******************");
		  response=RestAssured.get("https://dog.ceo/api/breed/retriever/list");
		
	}
	
@Test	
public void CheckResposeBodyval2() {
	
	log.info("****************Checking Response Body for ListOfSubBreedRetriever******************");
	String responseBody=response.getBody().asString();
	log.info("ResponseBody==>"+responseBody);
	Assert.assertTrue(responseBody!=null);
	}

}
