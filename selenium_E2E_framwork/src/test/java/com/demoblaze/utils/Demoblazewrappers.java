package com.demoblaze.utils;
import com.demoblaze.pages.SignupPage;
import com.demoblaze.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class Demoblazewrappers extends sewrappers{
	public void loginDemoblaze() {
		SignupPage signuppage=PageFactory.initElements(driver,SignupPage.class);
		LoginPage  loginpage =PageFactory.initElements(driver,LoginPage.class); 
		
		signuppage.clicksignup();
		signuppage.setusername("seshanthrakesh1901@gmail.com");
		signuppage.setpassword("seshanth9852");
		signuppage.clicksignupbutton();
		
	}
}
