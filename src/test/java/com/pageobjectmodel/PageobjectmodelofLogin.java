package com.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageobjectmodelofLogin {

	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement clickloginPagElement;
	
	@FindBy(xpath = "//a[@class=\"action create primary\"]")
	WebElement createNewAccountElement;
	
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstNamElement;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastNamElement;
	
	@FindBy(xpath = "//input[@id='email_address']")
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordElement;
	
	@FindBy(xpath = "//input[@name = \"password_confirmation\"]")
	WebElement confirmPasswordElement;
	
	@FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement CreateAnAccountButtonElement;
	
	
	public PageobjectmodelofLogin(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
			
	}
	
     public void ClickloginPage() {
		driver.navigate().refresh();
		
		clickloginPagElement.click();
		
	}
	
	public void createNewAccount() throws InterruptedException {
		Thread.sleep(3000);
		createNewAccountElement.click();
	}
	
	public void enterFirstname(String FirstName){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		firstNamElement.sendKeys(FirstName);
	}
		
	public void enterlastname(String LastName){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	lastNamElement.sendKeys(LastName);
	}		
	public void enteremail(String Email){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	emailElement.sendKeys(Email);
	}		
				
	public void pass(String password){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	passwordElement.sendKeys(password);
				
	}
	
	public void ConfirmPass(String confirmpassword){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		confirmPasswordElement.sendKeys(confirmpassword);
	
}
	
	
	public void ClickAccountCreateButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		CreateAnAccountButtonElement.click();
	}
}
