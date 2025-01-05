package cucumber_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']") WebElement myAccountPage;
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']") WebElement logOut;
	
	public void myAccountTitle() {
		String title=myAccountPage.getText();
		Assert.assertEquals(title,"My Account");
			
		}
	
	public void logoutBtn() {
		logOut.click();
	}

}
