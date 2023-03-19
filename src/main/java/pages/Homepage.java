package pages;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static Common.Common.*;
public class Homepage {
	
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@id='header_sign_in']")
	WebElement signInButton;
	
	@FindBy(xpath = "(//a[@class='myaccount'])[1]")
	WebElement loginButton;
	
	@FindBy(id = "//a[@id='createAccount']")
	WebElement createAccount;
	
	@FindBy(name ="//input[@name='Password']")
	WebElement password;
	
	@FindBy(how = How.ID,using = "//button[@id='PasswordResetUsingEmailAddressExchange']")
	WebElement forgotPassword;
	
	public void clickSignInButton() throws InterruptedException {
		signInButton.click();
		Thread.sleep(3000);
	}
	
	
	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(3000);
			
	}
	
	public void clickCreateAccount()throws InterruptedException{
	createAccount.click();
	Thread.sleep(3000);
	}
	
	public void clickPasswordButton() throws InterruptedException {
		password.click();
		Thread.sleep(3000);
	}
	
	public void clickforgotPassword() throws InterruptedException {
		forgotPassword.click();
		Thread.sleep(2000);
	}
			
	@FindBy(id = "//input[@id='signInName']")
	WebElement emailaddress;
	
	 /*public void clickEmailButtonWithsomething() throws InterruptedException{
		  emailaddress.click();
		 Thread.sleep(2000);
	 }*/
	
 public void clickEmailButton() throws InterruptedException{
	  clickElement(emailaddress);
	 Thread.sleep(2000);
 }

 public void clickpasswordWriteSomething() throws InterruptedException{
	  clickElement(password);
	 Thread.sleep(2000);
}

public void inputTextinBothField() throws InterruptedException {
	clickElement(signInButton);
	Thread.sleep(1000);
	inputText(emailaddress, "sanjibdas@gmail.com");
	inputText(password, "123654");
	Thread.sleep(1000);
	
}
 

	
	}
