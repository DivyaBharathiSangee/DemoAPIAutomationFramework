package DemoAPIFramework;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test()
	public void forgotPasswordTest()
	{
		AuthService authservice=new AuthService();
		Response response=authservice.forgotPassword("divya123@gmail.com");
		System.out.println(response.asPrettyString());
	}
}
