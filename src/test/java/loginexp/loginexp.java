package loginexp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class loginexp {
	
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\ChromeDriver2\\chromedriver2\\chromedriver.exe");
	}
	WebDriver d=new ChromeDriver();
	@Given("enduser is on the login page")
	public void enduser_is_on_the_login_page() {
		d.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement signin=d.findElement(By.linkText("SignIn"));
		signin.click();
	    
	}

	@When("endusers enters {string} and {string} and click on submit button")
	public void endusers_enters_and_and_click_on_submit_button(String string, String string2) {
		 WebElement username=d.findElement(By.id("userName"));
			username.sendKeys(string);
			WebElement pwd=d.findElement(By.id("password"));
			pwd.sendKeys(string2);
			WebElement login=d.findElement(By.name("Login"));
			login.click();
			 
	}
	 @Then("user is successful")
	    public void user_is_successful () {
		 WebElement SignOut=d.findElement(By.linkText("SignOut"));
			SignOut.click();

	 }


	



}
