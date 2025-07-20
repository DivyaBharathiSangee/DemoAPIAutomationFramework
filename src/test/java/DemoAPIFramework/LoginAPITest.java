package DemoAPIFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class LoginAPITest {

	//@Test(description="verify if the login API is working")
	public void loginTest()
	{
		//RestAssured.baseURI="http://64.227.160.186:8080";
		//RequestSpecification x= RestAssured.given();
		//RequestSpecification y= x.header("Content-Type","application/json");
		Response response = RestAssured
	            .given()
	            .baseUri("http://64.227.160.186:8080")
	            .header("","")
	            .body("")
	            .when()
	            .post( "https://d30ogb4y69iifg.cloudfront.net/live");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);		
	}
	@Test()
	public void loginTest1()
	{
		LoginRequest loginrequest=new LoginRequest("divya","divya123");
		AuthService authservice=new AuthService();
		Response response=authservice.login(loginrequest);
		System.out.println(response.asPrettyString());
	    LoginResponse loginresponse=response.as(LoginResponse.class);
	    System.out.println(loginresponse.getToken());
	    System.out.println(loginresponse.getEmail());
	    Assert.assertTrue(loginresponse.getToken()!=null);
	    
	}
}
