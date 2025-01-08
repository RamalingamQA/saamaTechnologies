package cucumber_Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Exercise extends BasePage{
	public int total=0;
	int ind=10;

	public Exercise(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//table[@name='BookTable']//th") List<WebElement> headers;
	@FindBy(xpath="//input[@id='Wikipedia1_wikipedia-search-input']") WebElement searchBox;
	@FindBy(xpath="//input[@type='submit']") WebElement searchIcon;
	@FindBy(xpath="//select[@id='country']") WebElement countryDpd;
	@FindBy(xpath="//select[@id='country']//child::option") List<WebElement> countryDpdOptions;
	@FindBy(xpath="//div[@id='wikipedia-search-result-link']/a") List<WebElement> searchSuggestions;
	
	public void totalPrice() {
		int totalPrice=0;
		int colIndex = 0;
		for(int i=1;i<=headers.size();i++) {
			if(headers.get(i).getText().equalsIgnoreCase("price")) {
				colIndex=i+1;
				break;
				
			}
		}
		String priceXpath="//table[@name='BookTable']//td["+colIndex+"]";
		List<WebElement> priceData=driver.findElements(By.xpath(priceXpath));
		for(WebElement wb:priceData) {
			String txt=wb.getText().trim();
	            int price = Integer.parseInt(txt); 
	            totalPrice += price; 
	       
		}
		Assert.assertEquals(totalPrice,7100);		

}
	public void enter_txt_searchbox(String text) {
		searchBox.sendKeys(text);
		searchIcon.click();
		}
	
	public List<String> contryDpdValues() {
		List<String> li=new ArrayList<String>();
		for(WebElement wb:countryDpdOptions) {
			li.add(wb.getText());
		}
		return li;
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
