package testrunnerDemo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\a\\eclipse-workspace\\CucumberDemo\\Features\\simple-form.feature"},
		glue = {"testrunnerDemo"}
		)

public class Simpleformtestrunner extends AbstractTestNGCucumberTests{

}
