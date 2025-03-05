package cucumber_stepDefinition;

import java.util.Collection;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

    @After
    public void before(Scenario sc) {
    	
        Collection<String> scenarioTags = sc.getSourceTagNames();
        if(sc.isFailed()) {
        	System.out.println("Tags: "+scenarioTags);
        }
    }
    
}
