package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/sarithaganaparthi/Documents/Saritha/eclipseProject/JavaCucumberApr2022/src/test/resources/Features/LoginDemoParam.feature",
                glue = {"step_def"},
                dryRun = false,
                monochrome = true
		
		
		)

public class LoginDemoParamPomRunner {

}
