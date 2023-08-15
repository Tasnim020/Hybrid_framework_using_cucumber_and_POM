package StepDfinitionforLogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.PageobjectmodelofLogin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;



public class StepsforNewAccountProduce {

	
	WebDriver driver;
	PageobjectmodelofLogin lP1;
	
	@Before(order = 0)
	public void driversetup() {
		
		
		 driver = new ChromeDriver();
		
		
		lP1 = new PageobjectmodelofLogin(driver);
	}
	
	@Before(order = 1)
	@Given("go to url")
	public void go_to_url() {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}

	@When("go to login page")
	public void go_to_login_page() {
	    lP1.ClickloginPage();
	}

	@When("go to Create New Account")
	public void go_to_create_new_account() throws InterruptedException{
	   lP1.createNewAccount();
	}

	@When("I put firstname")
	public void i_put_firstname() {
	    
		
	lP1.enterFirstname("tas");
	}

	@When("I put Lastname")
	public void i_put_lastname() {
	   lP1.enterlastname("nim");
	}

	@When("I put email")
	public void i_put_email() {
	    lP1.enteremail("ssumtaba@gmail.com");
	}

	@When("I put password")
	public void i_put_password() {
	   lP1.pass("tasnim..123");
	}

	@When("I put confirm password")
	public void i_put_confirm_password() {
	    lP1.ConfirmPass("tasnim..123");
	}


	@When("click the create a new accounr button")
	public void click_the_create_a_new_accounr_button() {
	   lP1.ClickAccountCreateButton();
	}

	@Then("I log in successfully")
	public void i_log_in_successfully() {
		System.out.println("passed");
	   
	}
	

	@After
	public void teardown() {
		 
		 
		 driver.quit();
	 }
	
	
	
	
}
