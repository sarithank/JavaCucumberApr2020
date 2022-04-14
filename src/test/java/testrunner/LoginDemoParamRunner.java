package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "/Users/sarithaganaparthi/Documents/Saritha/eclipseProject/JavaCucumberApr2022/src/test/resources/Features/LoginDemoParam.feature",
                 glue = {"step_def"},
                 monochrome= true,
                 plugin = {"pretty","json:target/Reporst/loginDemo.json","html:target/Reporst/loginDemo.html","junit:target/Reporst/loginDemo.xml"}
		
		
		)
public class LoginDemoParamRunner {

}
