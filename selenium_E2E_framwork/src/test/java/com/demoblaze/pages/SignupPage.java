package com.demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.sewrappers;

public class SignupPage extends sewrappers{
	public WebDriver driver=null;

	@FindBy(id="signin2")
	public WebElement signup;
	
	@FindBy(id="sign-username")
	public WebElement username;

	@FindBy(id="sign-password")
	public WebElement password;

	@FindBy(xpath="//button[text()='Sign up']")
	public WebElement signupbutton;
	
	public void clicksignup() {
		waitForElement(signup,20);
		clickElement(signup);
	}
	public void setusername(String usrname){
		waitForElement(username,20);
		clickElement(username);
		typeText(username, usrname);
	}
	public void setpassword(String pswd){
		waitForElement(password,20);
		typeText(password, pswd);
	}
	public void clicksignupbutton()
	{
	waitForElement(signupbutton,20);
	clickElement(signupbutton);
	
	}

}
