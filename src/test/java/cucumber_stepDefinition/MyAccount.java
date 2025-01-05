package cucumber_stepDefinition;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber_Page.MyAccountPage;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyAccount {
	WebDriver driver=BasePage.driver;
	MyAccountPage mp=new MyAccountPage(driver);
	

	@Then("the user validates title in MyAccount page")
	public void into_login_screen()  {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account");
		
		
	}
	
	

}
