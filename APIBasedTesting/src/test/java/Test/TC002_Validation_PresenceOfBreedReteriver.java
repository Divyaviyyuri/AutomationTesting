package Test;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import Base.TestBase;
import io.restassured.RestAssured;
import junit.framework.Assert;

public class TC002_Validation_PresenceOfBreedReteriver extends TestBase {
	@BeforeClass
	public void ValidatingRetriever(){
		log.info("****************Starting TC002_Validation_PresenceOfBreedReteriver ******************");
		  response=RestAssured.get("https://dog.ceo/api/breeds/list/all");
		
	}
	
@Test	
public void CheckResposeBodyVal() {
	
	log.info("****************Checking Response Body for PresenceOfBreedReteriver ******************");
	String responseBody=response.getBody().asString();
	log.info("ResponseBody==>"+responseBody);
	 Assert.assertEquals(responseBody.contains("retriever"),true);
	 log.info("Retriever is present within the BreedList");
	}

}
