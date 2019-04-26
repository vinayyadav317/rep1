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
import pages.casestudy1_addproduct;

public class casestudy1_stepdef {
         WebDriver driver;
        public  String cat_name1="LAPTOP_v"; 
         public  String subcat_name1="HPp";
	
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver,casestudy1_addproduct.class);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@Given("user logs in")
	public void user_logs_in() {
	   
		casestudy1_addproduct.username.sendKeys("admin");
		casestudy1_addproduct.password.sendKeys("Password456");
		casestudy1_addproduct.click_login.click();
		
	}

	
	
	@When("complete adding catagory")
	public void complete_adding_catagory() {
		casestudy1_addproduct.click_cat.click();
		casestudy1_addproduct.cat_name.sendKeys(this.cat_name1);
		casestudy1_addproduct.cat_desc.sendKeys("laptops");
		casestudy1_addproduct.click_add.click();
	    casestudy1_addproduct.home.click();
	}

	@When("complete adding subcatogry")
	public void complete_adding_subcatogry() {
		casestudy1_addproduct.click_subcat.click();
		
		
		Select subcatt=new Select(casestudy1_addproduct.subcat);
		subcatt.selectByVisibleText(cat_name1);
		casestudy1_addproduct.subcat_name.sendKeys(this.subcat_name1);
		
		
		casestudy1_addproduct.subcat_desc.sendKeys("a");
		casestudy1_addproduct.click_add1.click();
		 casestudy1_addproduct.home.click();
		
	}

	@When("complete adding product")
	public void complete_adding_product() throws InterruptedException {
	  
		casestudy1_addproduct.click_aaaprod.click();
		
		Select subcat1=new Select(casestudy1_addproduct.prodcat_name);
		subcat1.selectByVisibleText(this.cat_name1);
		Select subcat2=new Select(casestudy1_addproduct.sub_cat_name);
		subcat2.selectByVisibleText(this.subcat_name1);
		casestudy1_addproduct.prod_name.sendKeys("HP Pavilion");
		casestudy1_addproduct.prod_price.sendKeys("55000");
		casestudy1_addproduct.prod_quality.sendKeys("10");
		casestudy1_addproduct.prod_brand.sendKeys("HP");
		casestudy1_addproduct.prod_desc.sendKeys("lap");
		//casestudy1_addproduct.prod_file.
		//Thread.sleep(5000);
	    casestudy1_addproduct.click_addprod1.click();
	    casestudy1_addproduct.home.click();
		
	}


	@Then("check if product is added")
	public void check_if_product_is_added() {
	   casestudy1_addproduct.click_view.click();
	   Select subcat3=new Select(casestudy1_addproduct.cat_verify);
		subcat3.selectByVisibleText(this.cat_name1);
		Select subcat4=new Select(casestudy1_addproduct.subcat_verify);
		subcat4.selectByVisibleText(this.subcat_name1);
		casestudy1_addproduct.click_verify.click();
	}

}
