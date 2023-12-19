package gluecode;

import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Utils;

public class LoginGlue extends Utils{

	@Given("Navigate to w3 schools login page")
	public void navigate_to_w3_schools_login_page() {
		try
		{
			driver.get("https://profile.w3schools.com/");
			Assert.assertEquals ("Log in - W3Schools", driver.getTitle());
			System.out.println("Navigated to W3Schools");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@When("I enter the correct username")
	public void i_enter_the_correct_username() {
		try
		{
			driver.findElement(By.id("modalusername")).sendKeys("seshanthrakesh1998@gmail.com");
			Thread.sleep(2000);
			System.out.println("Entered the username");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
	@When("I enter the correct password")
	public void i_enter_the_correct_password() {
		try
		{
			driver.findElement(By.xpath("//input[@name='current-password']")).sendKeys("seshanth9852");
			Thread.sleep(2000);
			System.out.println("Entered the password");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}


	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
		try
		{
			driver.findElement(By.xpath("//span[text()='Log in']")).click();

			Thread.sleep(7000);

			Assert.assertEquals("My learning | W3Schools", driver.getTitle());
			System.out.println("Assertion Passed");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


}
