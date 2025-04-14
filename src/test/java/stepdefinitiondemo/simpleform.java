package stepdefinitiondemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class simpleform {
	
	WebDriver driver;
	@Given("I am setup browser")
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@And("I am on simple form page")
	public void visit() {
		driver.get("https://v1.training-support.net/selenium/simple-form");
	    
	}

	@When("I enter first name in the first name field")
	public void enterfirstName() {
	    driver.findElement(By.id("firstName")).sendKeys("sanjay");
	}

	@And("I enter last name in the last name field")
	public void enterlastName() {
		driver.findElement(By.id("lastName")).sendKeys("jatav");
	}

	@And("I enter email in the email field")
	public void enterEmail() {
		driver.findElement(By.id("email")).sendKeys("sanjay@gmail.com");
	}

	@And("I enter mobile number in the contact number field")
	public void enterContactNumber() {
		driver.findElement(By.id("number")).sendKeys("9867456538");
	}

	@And("I enter message in the message field")
	public void enterMessage() {
		driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("I my name is sanjay jatav");
	}

	@When("I click on the submit button")
	public void clickonSubmitBtn() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("I should see the confirmation message")
	public void validateConfirm() {
	   Alert alrt = driver.switchTo().alert();
	   System.out.println(alrt.getText()); 
	   alrt.accept();
	}
	
	@And("I close the tab")
	public void tearup() {
		driver.close();
	}
}
