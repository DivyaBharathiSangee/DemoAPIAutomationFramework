package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

//import com.api.models.request.LoginRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private static final String BASE_PATH="/api/auth";
	public Response login(Object payload)
	{
		return postRequest(payload, BASE_PATH+"login");
	}
	public Response signUp(SignUpRequest payload)
	{
		return postRequest(payload,BASE_PATH+"signup");
	}
	public Response forgotPassword(String emailaddress) //only one payload
	{
		HashMap<String,String> payload=new HashMap<String,String>();
		payload.put("email", emailaddress);
		return postRequest(payload, BASE_PATH+"forgot-password");
	}
}
