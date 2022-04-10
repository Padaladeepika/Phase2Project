package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.saucedemo.com/");
		

	}



	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user-name"));
		UserName.sendKeys(UserNameVal);

	}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		
	WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);

	}

	@When("I click on the login Button")
	public void i_click_on_the_login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement LoginBtn = driver.findElement(By.name("login-button"));
		LoginBtn.click();

	}

	@Then("I should be Landed on the product page")
	public void i_should_be_Landed_on_the_product_page() {
	    // Write code here that turns the phrase above into concrete actions
		
System.out.println("Inside Product page");
	}

	@Then("I should be getting the {string}")
	public void i_should_be_getting_the(String ExpMsg) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement Errormsg = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		
		String ActualMsg = Errormsg.getText();
		
		Assert.assertEquals(ExpMsg,ActualMsg);

	}


}
	






