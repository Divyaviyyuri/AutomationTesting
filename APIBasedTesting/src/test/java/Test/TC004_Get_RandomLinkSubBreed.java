package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import io.restassured.RestAssured;
import junit.framework.Assert;

public class TC004_Get_RandomLinkSubBreed extends TestBase{
	@BeforeClass
	public void getBreedList(){
		log.info("****************TC004_Get_RandomLinkSubBreed ******************");
		  response=RestAssured.get("https://dog.ceo/api/breeds/image/random");
		
	}
	
@Test	
public void CheckResposeBodyVal3() {
	
	log.info("****************Checking Response Body for RandomLinkSubBreed ******************");
	String responseBody=response.getBody().asString();
	log.info("ResponseBody==>"+responseBody);
	Assert.assertTrue(responseBody!=null);
	}

}
