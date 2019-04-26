package skeleton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.DriverUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_step_definations {

	WebDriver driver;
	
	//@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//@After
	public void after()
	{
		driver.close();
	}
	
	//@Given("The ULR of TestMeApp")
	public void the_ULR_of_TestMeApp()
	{
	   
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	 }
	   


	@When("User enters {word} as username")
	public void user_enters_as_username(String string)
	{
		
		driver.findElement(By.id("userName")).sendKeys(string); 
	}

	
	
	@When("user enters {word} as password")
	public void user_enters_as_password(String string)
	{

		driver.findElement(By.id("password")).sendKeys(string); 
	}

	
	
	@Then("user is in (Home|Admin Home)")
	public void user_is_in_homepage()
	{
		
		 driver.findElement(By.cssSelector("input[value='Login']")).click();		
			Assert.assertTrue(driver.getTitle().contains("Home"));
	}
	@When("User enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> list=dataTable.asLists();
		for (List<String> list2 : list)
		{
			for (String list3 : list2)
			{
				System.out.println(list3+"\t");
			}
		
		System.out.println();
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	 
	}

	@Then("user is in loginpage")
	public void user_is_in_loginpage(List<String> s) {
		
	   for(String string :s)
	   {
		   System.out.println(string);
	   }
	}
}


