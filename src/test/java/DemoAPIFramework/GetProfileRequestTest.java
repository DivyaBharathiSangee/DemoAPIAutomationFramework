package DemoAPIFramework;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	@Test()
	public void getProfileTest()
	{
		AuthService authservice=new AuthService();
		Response response=authservice.login(new LoginRequest("divya","divya1234"));
		LoginResponse loginresponse=response.as(LoginResponse.class); //loginresponse object //deserialisation
		System.out.println(loginresponse.getToken());
		UserProfileManagementService userProfile=new UserProfileManagementService();
		 response=userProfile.getProfile(loginresponse.getToken());
		 System.out.println(response);
		UserProfileResponse userprofileresponse= response.as(UserProfileResponse.class); // deserialisation 
		System.out.println(userprofileresponse.getUsername()); //getuser response -- username
	}
}
