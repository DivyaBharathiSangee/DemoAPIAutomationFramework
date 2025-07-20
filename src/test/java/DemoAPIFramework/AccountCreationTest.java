package DemoAPIFramework;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description="signup")
	public void createAccountTest()
	{
		SignUpRequest signUpRequest=new SignUpRequest .Builder()
		.userName("divya")
		.email("divya@gmail.com")
		.firstName("Divya")
		.lastName("bharathy")
		.password("123")
		.mobileNumber("78654344")
		.build();
	
	AuthService auth=new AuthService();
	
	Response response=auth.signUp(signUpRequest);
	System.out.println(response.asPrettyString());
}
}
