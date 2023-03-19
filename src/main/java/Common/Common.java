package Common;



import java.util.NoSuchElementException;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Common {
	
	public static void clickElement(WebElement element) {
		try {	element.click();			
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			
			}
	
	}

	public static void inputText(WebElement element,  String input) {
		try {element.sendKeys(input);
		
		}catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
	
	



