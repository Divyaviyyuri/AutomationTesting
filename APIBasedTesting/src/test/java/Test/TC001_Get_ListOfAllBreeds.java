package Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Base.TestBase;
import io.restassured.RestAssured;
import junit.framework.Assert;

public class TC001_Get_ListOfAllBreeds extends TestBase {
	
	
	@BeforeMethod
	public void getBreedList(){
		log.info("****************Starting TC001_Get_ListOfAllBreeds ******************");
		  response=RestAssured.get("https://dog.ceo/api/breeds/list/all");
		
	}
	
@Test	
public void CheckResposeBody() {
	
	log.info("****************Checking Response Body ******************");
	String responseBody=response.getBody().asString();
	log.info("ResponseBody==>"+responseBody);
	Assert.assertTrue(responseBody!=null);
	}
}
