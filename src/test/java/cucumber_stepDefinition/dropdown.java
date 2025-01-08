package cucumber_stepDefinition;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber_Page.Exercise;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class dropdown {
	WebDriver driver=BasePage.driver;
	public Exercise ex=new Exercise(driver);

	@Then("the user enters {string} into the searchbox")
	public void the_user_enters_into_the_searchbox(String searchtxt) {
		
	    ex.enter_txt_searchbox(searchtxt);
	}
	@Then("the user selects {string} from the dropdown")
	public void the_user_selects_from_the_dropdown(String suggestedTxt) {
	    ex.select_value(suggestedTxt);
	}
	@Given("the validates all the elemets present inside dropdown")
	public void validateDropdownOptions(DataTable dataTable) {
	    List<List<String>> opts=dataTable.asLists();
	    for(List<String> row:opts) {
	    	for(String st:row) {
	    		if(!ex.contryDpdValues().contains(st)) {
	    			Assert.fail(st+": Not present in the contry dropdown");
	    		}
	    	}
	    }
	}
	
	
}
