package testrunnerDemo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\a\\eclipse-workspace\\CucumberDemo\\LoginDemo\\logindemo.feature"},
		glue= {"testrunnerDemo"}
		
		)

public class Testrunner extends AbstractTestNGCucumberTests{

}
