package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestCase01 
{
/*WebDriver driver;

@Given("^User has opened website in chrome$")
public void openBrowse()
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Ethans Selenium\\chromedriver_win32 (2)\\"+"chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com//");
}

@And("^User entered username and password$")
public void enterDetails()
{
	driver.findElement(By.name("userName")).sendKeys("batman");
	driver.findElement(By.name("password")).sendKeys("batman");
	driver.findElement(By.name("login")).click();
}*/

	@When("^User selects Oneway radio$")
public void SelectRadios()
{
		AbstractDefinations.driver.findElement(By.xpath("//input[@value='oneway']")).click();	
}
	
	
	
	
}
