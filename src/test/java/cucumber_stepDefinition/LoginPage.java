package cucumber_stepDefinition;




import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber_Page.HomePage;
import cucumber_Page.loginPage;
import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	WebDriver driver=BasePage.driver;
	public HomePage hp=new HomePage(driver);
	public loginPage lp=new loginPage(driver);
	Properties p=new Properties();

	@Then("the user enters into loginPage page")
	public void into_login_screen()  {
		hp.accountBtn();
		hp.loginBtn();		
	}
	
	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String userName, String password) {
	    lp.userNametxt(userName);
	    lp.passwordtxt(password);
	    lp.loginBtn();
	}
	
	@And("the user enters username and password and submits loginPage Page")
	public void enter_Username_Password() throws IOException{
		FileReader fi= new FileReader("./src//test//resources//config.properties");
		p.load(fi);
		String username=p.getProperty("email");
		String password=p.getProperty("password");
		lp.userNametxt(username);
		lp.passwordtxt(password);
		lp.loginBtn();
	}
	
	

}
