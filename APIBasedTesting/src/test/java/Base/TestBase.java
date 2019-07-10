package Base;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;


public class TestBase {
	public static Properties prop;
	public Logger log;
	public static Response response;
	
	@BeforeClass
	public void setup() throws Throwable
	{
		log=LogManager.getLogger(TestBase.class.getName());
	
	}
	
}
