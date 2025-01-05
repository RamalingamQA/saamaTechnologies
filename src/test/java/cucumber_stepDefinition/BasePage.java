package cucumber_stepDefinition;

import java.io.FileReader;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BasePage {
	public static WebDriver driver;
	public static Logger log;
	public static Properties p; 
	/*@BeforeClass()
	public void setup() throws IOException {
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		this.browser=p.getProperty("browser");
	}*/
	
	@Given("user launches the application")
	public void launch_application() throws IOException {
		log=LogManager.getLogger(BasePage.class);	
		//properties file
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		String appUrl=p.getProperty("appURL2");
		String browser=p.getProperty("browser");
		switch(browser) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox": driver= new FirefoxDriver();break;
		default: System.out.println("ENter valid browser");return;
		}		//driver=new ChromeDriver();
		log.info("Browser is launched");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(appUrl);	
		driver.manage().window().maximize();
	}
	

	@Then("the user closes browser")
	public void the_user_closes_the_driver() {
		driver.quit();	}
	

}
