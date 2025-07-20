package DemoAPIFramework;

import org.testng.Assert;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	public void updateProfileTest()
	{
		AuthService authService=new AuthService();
		Response response=authService.login(new LoginRequest("divya","divya123"));
		LoginResponse loginresponse=response.as(LoginResponse.class);
		UserProfileManagementService userProfileManagementService=new UserProfileManagementService();
		response=userProfileManagementService.getProfile(loginresponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "divya");
		ProfileRequest profileRequest=new ProfileRequest.Builder()
				.firstName("dd")
				.lastName("bharathy")
				.email("bhar@gmail.com")
				.mobileNumber("8989")
				.build();
		response=userProfileManagementService.updateProfile(loginresponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
		
		
	}
}
