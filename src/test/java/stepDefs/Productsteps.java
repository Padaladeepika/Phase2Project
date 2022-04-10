package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Productsteps {

	
	WebDriver driver = BaseClass.driver;

	@Given("Iam on SauceDemo login page")
	public void iam_on_SauceDemo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter Username {string} and Password {string}")
	public void i_enter_Username_and_Password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user-name"));
		WebElement Password = driver.findElement(By.id("password"));

		
		UserName.sendKeys("standard_user");
		Password.sendKeys("secret_sauce") ;
			


	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("login-button"));
		LoginBtn.click();

	}

     @When("Iam on Product page")
	public void iam_on_Product_page() {
	    // Write code here that turns the phrase above into concrete actions
 		String ExpTitle="PRODUCTS";

		
		WebElement product = driver.findElement(By.xpath("//span[@class='title']"));
		

		String actual = product.getText();
		
		Assert.assertEquals(ExpTitle,actual);
		System.out.println("User is on Products page");

	}

	@Then("I compare the below product price")
	public void i_compare_the_below_product_price(DataTable dataTable) {
		int rows = dataTable.height();
		for (int i=0;i<rows;i++) {
			
		String product= dataTable.cell(i, 0);
		String price= dataTable.cell(i, 1);
String actualprice=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/following::div[@class='inventory_item_price'][1]")).getText();

Assert.assertEquals(price,actualprice);
		}


	}
}
		
	
		
	
	



	

