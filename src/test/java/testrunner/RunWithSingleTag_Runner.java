package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;//if you dont import this you will get below error for <cucumber.class>
									//Class<Cucumber> cannot be resolved to a type

@RunWith(Cucumber.class)

@CucumberOptions(features = "/Users/sarithaganaparthi/Documents/Saritha/eclipseProject/JavaCucumberApr2022/"+
		                      "src/test/resources/FeatureWithTags/Tags.feature", 
                glue = {"step_def"},
		// plugin= {"pretty","html:target/Reports/report.html"},
		// plugin= {"pretty","json:target/Reports/report.json"},
		// plugin= {"pretty","junit:target/Reports/report.xml"},
		// or
		plugin = { "pretty", "html:target/Reports/report.html", "json:target/Reports/report.json",
				"junit:target/Reports/report.xml" }, 
		//dryRun = false, // it will check mapping between feature & step
																		// definition is proper or not
		// strict = true//it will check if any step is not defined in the step
		// definition file
		//monochrome = true // it will check the console output in a proper readable format
		// publish=true
        // tags = "@smoke or @regression and @important",
         tags = "@smoke or @regression or @important and not @smoke"
         
         ) // filtering Scenarios using tags


public class RunWithSingleTag_Runner {

}
