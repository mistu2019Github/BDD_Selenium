package StepDefinations;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;

public class TestCase02 
{

	@When("^user selects (.*) from to port$")
	public void selectDropdown(String countryName)
	{
		AbstractDefinations.driver.findElement(By.xpath("//select[@name='toPort']/option[@value ='"+countryName+"']")).click();
	}
	
}
