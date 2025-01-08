package cucumber_stepDefinition;



import org.openqa.selenium.WebDriver;

import cucumber_Page.Exercise;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class webTable {
	WebDriver driver=BasePage.driver;
	public Exercise ex=new Exercise(driver);

	@Then("the user validates book price")
	public void total_price()  {
		ex.totalPrice();	
	}
	
	
}
