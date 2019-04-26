package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Demowebshop_reg;

public class Demowebshop_stepdef {

	WebDriver driver;
	//@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");

		PageFactory.initElements(driver, Demowebshop_reg.class);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//@After
	public void after() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}
	
	@Given("url of demo webshop")
	public void url_of_demo_webshop() {
		
	   driver.get("http://demowebshop.tricentis.com/register");
	    
	}

	@When("user enters data for registration")
	public void user_enters_data_for_registration() {
		   Demowebshop_reg.firstname.sendKeys("vinay");
		   Demowebshop_reg.lastname.sendKeys("yadav");
		   Demowebshop_reg.email.sendKeys("vin3@test.com");
		   Demowebshop_reg.password.sendKeys("abc123");
		   Demowebshop_reg.confirmpassword.sendKeys("abc123");
		   Demowebshop_reg.registerbutton.click();
	}

	@Then("user registred successfully")
	public void user_registred_successfully() {
         
		String s=Demowebshop_reg.verify.getText();
		Assert.assertEquals("Your registration completed",s);
		

	}


}
