package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class itemDetailPage {
	
	
	public WebDriver driver;

	public itemDetailPage(WebDriver driver) {
		this.driver=driver;
	
	}
	
	
By AddtoCart = By.xpath("//span[contains(text(),'Add to cart')]");
By TitleBar = By.xpath("//h2[@class='vi-overlayTitleBar']");
By item = By.xpath("//h2[@class='vi-overlayTitleBar']");
By itemText = By.xpath("//span[@role='heading'][contains(text(),'Valentine')]");	


	public void AddtoCartItem() {
		driver.findElement(AddtoCart).click();
	}
	
	public void verifyItemAddedtoCart() {
		String message = driver.findElement(TitleBar).getText();
		Assert.assertEquals(message, "1 item added to cart");

		
	}
	
	public void clickonItem() {
		driver.findElement(itemText).click();
	}
	
	
	public void SwitchtoNewWindow() {
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}

}
