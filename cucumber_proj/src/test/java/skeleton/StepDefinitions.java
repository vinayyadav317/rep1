package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {
	
	Person sean=new Person();
	
	@Given("sean is {int} meters away from lucia")
	public void sean_is_meters_away_from_lucia(Integer int1) {
	  sean.setdistance(int1);
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
	   sean.setmessage(string);
	  
	}

	@Then("lucia {string} to the message")
	public void lucia_listens_to_the_message(String flag)
	{
		if(flag.contentEquals("listens"))
		{
	          String message= sean.getmessage();
	          Assert.assertEquals("Free Coffee",message);
	    }
		else if(flag.contentEquals("cannot listen"))
		{
			
			   String message= sean.getmessage();
			   Assert.assertEquals("CANNOT HEAR",message);
			  
			
		}
		
		
	
	}
}