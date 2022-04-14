package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/sarithaganaparthi/Documents/Saritha/eclipseProject/JavaCucumberApr2022/src/test/resources/Features/GoogleSearch.feature",
                  glue = "step_def",
                  monochrome= true,
                 // strict= true
                  plugin = {"pretty","html:target/Reports/GoogleSerchreports.html", "json:target/Reports/GoogleSerchreports.json","junit:target/Reports/GoogleSerchreports.xml"}
		
		
		
		)


public class GoogleSearchTestRunner {

}
