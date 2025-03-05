package cucumber_stepDefinition;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber_Page.HomePage;
import cucumber_Page.RegistrationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Registration_Step {
	WebDriver driver=BasePage.driver;
	HomePage hp=new HomePage(driver);
	RegistrationPage rp=new RegistrationPage(driver);
	
	
	@Then("the user enters into register page")
	public void into_login_screen()  {
		hp.accountBtn();
		hp.registerBtn();		
	}
	

	@Given("the user fills all the required fields in Registations page and registers it")
	public void dataTable_RegistrationPage(DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> userList=dataTable.asMaps(String.class,String.class);
	//
	int totNewUsers=userList.size();
	
	for(int i=0;i<totNewUsers;i++) {
		String fname=userList.get(i).get("firstName");
		rp.firstNametxt(fname);
		String lastName=userList.get(i).get("lastName");
		rp.lastNametxt(lastName);
		String eMail=userList.get(i).get("eMail");
		rp.emailtxt(eMail);
		String telePhone=userList.get(i).get("telePhone");
		rp.telePhonetxt(telePhone);
		String password=userList.get(i).get("password");
		rp.passWordtxt(password);
		String confirmPassword=userList.get(i).get("confirmPassword");
		rp.confirmPasswordtxt(confirmPassword);
		Thread.sleep(5000);
	}
	   
	}
	
	

}
