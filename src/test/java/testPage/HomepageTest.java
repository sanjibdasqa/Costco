package testPage;

import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.tethering.Tethering;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class HomepageTest extends BaseClass{
	
	
	@Test(enabled = false, priority = 1)
	public void clickSignInButtonTest() throws InterruptedException {
		homepage.clickSignInButton();
	}
	
	@Test(enabled = false, priority = 4)
	public void clickloginbuttontest() throws InterruptedException{
		homepage.clickSignInButton();
		homepage.clickLoginButton();
	
		}
	
	@Test(enabled = false, priority = 2)
	public void clickCreateAccountTest() throws InterruptedException {
		homepage.clickSignInButton();
		homepage.clickCreateAccount();
	}
	
@Test(enabled = false, priority = 3)
public void passwordbuttonTest() throws InterruptedException {
	homepage.clickSignInButton();
	homepage.clickPasswordButton();
}
	@Test(enabled = false, priority = 3)
	public void forgotPasswordTest() throws InterruptedException {
		homepage.clickforgotPassword();
	}

	@Test (enabled = false, priority = 4)
	public void inputTextInBothWayTest() throws InterruptedException {
		homepage.inputTextinBothField();
	}
	
	@Test (enabled = false, priority = 5)
	public void use_of_set_specific_size_in_window() throws InterruptedException {
		Dimension dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.navigate().to("https://www.costco.com/");
		Thread.sleep(2000);
		System.out.println("The Size of the screen is "+driver.manage().window().getSize());
		driver.manage().window().maximize();
		System.out.println("The size of the maximize screen is: "+ driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.manage().window().setSize(dimension); 
		Thread.sleep(2000);
		System.out.println("The size of the set screen is: "+ driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		System.out.println("The size of the full screen is: "+ driver.manage().window().getSize());
		
	}
	
		
		@Test(enabled=true)
		public void use_of_dropdown_by_index() throws InterruptedException {
			driver.get("https://www.statefarm.com/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement dropElement1 = driver.findElement(By.xpath("//select[@id='popDropdown']"));
			select = new Select(dropElement1);
			select.selectByIndex(2);
			Thread.sleep(2000);

			
			
		}
		
		
	
}

