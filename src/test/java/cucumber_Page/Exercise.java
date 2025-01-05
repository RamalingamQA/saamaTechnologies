package cucumber_Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Exercise extends BasePage{
	public int total=0;

	public Exercise(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//table[@name='BookTable']//tr//td[4]") List<WebElement> price;
	@FindBy(xpath="//input[@id='Wikipedia1_wikipedia-search-input']") WebElement searchBox;
	@FindBy(xpath="//input[@type='submit']") WebElement searchIcon;
	@FindBy(xpath="//div[@id='wikipedia-search-result-link']/a") List<WebElement> searchSuggestions;
	
	public int totalPrice() {
		for(WebElement pc:price) {
			String txt=pc.getText();
			int cost=Integer.parseInt(txt);
			total=total+cost;
		}
		return total;

}
	public void enter_txt_searchbox(String text) {
		searchBox.sendKeys(text);
		searchIcon.click();
		}
	public void select_value(String value) {
		for(WebElement wb:searchSuggestions) {
			String val=wb.getText();
			if(val.equalsIgnoreCase(value)) {
				wb.click();
				break;
			}
		}
	}
}
