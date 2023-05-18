package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class ebayLandigPage {
	
	public WebDriver driver;

	public ebayLandigPage(WebDriver driver) {
		this.driver=driver;
	
	}

	By searchbox = By.xpath("//input[@aria-label='Search for anything']");
	
	By search = By.xpath("//input[@value='Search']");
	
	By categoryDropdown = By.xpath("//select[@aria-label='Select a category for search']");
	
	By GiftCard = By.xpath("//option[contains(text(),'Gift Cards & Vouchers')]");

	
	
	public void searchItem(String searchText) {
		driver.findElement(searchbox).sendKeys(searchText);
	}
	
	
	
	public void clickSearch() {
		driver.findElement(search).click();
	}
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public void ApplyCategory() {
	
		driver.findElement(categoryDropdown).click();
		driver.findElement(GiftCard).click();
		
	   
		
		
		
	}
	
}
