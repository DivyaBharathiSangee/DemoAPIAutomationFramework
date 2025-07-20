package com.api.models.request;

public class SignUpRequest {

	 private String username;
	 private String  password;
	 private String email;
	 private String firstName;
	 private String  lastName;
	 private String mobileNumber;
	 public SignUpRequest(String username, String password, String email, String firstName, String lastName,
				String mobileNumber) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
			this.mobileNumber = mobileNumber;
		}
		
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "SignUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	
	public static class Builder{   // inner class
		 private String username;
		 private String  password;
		 private String email;
		 private String firstName;
		 private String  lastName;
		 private String mobileNumber;
		 
		 public Builder userName(String username)
		 {
			 this.username=username;
			 Builder x=this;   //object creation for current instance
			 return x;    //return current obj 
		 }
		 public Builder email(String email)
		 {
			 this.username=email;
			    //object creation for current instance
			 return this;    //return current obj 
		 }
		 public Builder password(String password)
		 {
			 this.username=password;
			    //object creation for current instance
			 return this;    //return current obj 
		 }
		 public Builder firstName(String firstName)
		 {
			 this.username=firstName;
			    //object creation for current instance
			 return this;    //return current obj 
		 }
		 public Builder lastName(String lastName)
		 {
			 this.username=lastName;
			    //object creation for current instance
			 return this;    //return current obj 
		 }
		 public Builder mobileNumber(String mobileNumber)
		 {
			 this.username=mobileNumber;
			    //object creation for current instance
			 return this;    //retur n current obj 
		 }
		 
		 public SignUpRequest build()
		 {
			 SignUpRequest signuprequest=new SignUpRequest(username, password, email, firstName, lastName, mobileNumber);
			 return signuprequest;
		 }
	}
	
}
