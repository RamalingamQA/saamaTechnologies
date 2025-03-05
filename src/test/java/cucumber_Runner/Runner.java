package cucumber_Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="",features={"src\\test\\resources\\features\\login.feature"},glue= {"cucumber_stepDefinition"},plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","html:target/htmlreport.html"})

public class Runner extends AbstractTestNGCucumberTests {
	

} 
