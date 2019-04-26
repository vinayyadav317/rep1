package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.casestudy3_page;

public class casestudy3_stepdef {
	
	WebDriver Driver;
	//@Before
	public void bef()
	{
		Driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(Driver,casestudy3_page.class);
		 Driver.manage().window().maximize();
		 Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@Given("The ULR of TestMeApp")
	public void the_ULR_of_TestMeApp() {
	   
		 Driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@When("select catagory name")
	public void select_catagory_name() {
		Select subcat1=new Select(casestudy3_page.prodcat_name);
		subcat1.selectByVisibleText("Electronics");
	}

	@When("select subcatagory name")
	public void select_subcatagory_name() {
		//Select subcat2=new Select(casestudy1_addproduct.sub_cat_name);
		//subcat2.selectByVisibleText("");
	}

	@When("send {string} as product name")
	public void send_as_product_name(String string) {
		casestudy3_page.prod_name.sendKeys(string);
	}

	@When("send ${int} as prize")
	public void send_$_as_prize(String int1) {
		casestudy3_page.prod_price.sendKeys(int1);
	}

	@When("send {int} as quality")
	public void send_as_quality(String int2) {
		casestudy3_page.prod_quality.sendKeys(int2);
	}

	@When("add {string} as brand")
	public void add_as_brand(String string) {
		casestudy3_page.prod_brand.sendKeys(string);
	}

	@When("add {string} as description")
	public void add_as_description(String string) {
		casestudy3_page.prod_desc.sendKeys(string);
		
		
	}

	@Then("user is in <page>")
	public void user_is_in_page() {
		
		casestudy3_page.click_addprod1.click();
	 	}

}
