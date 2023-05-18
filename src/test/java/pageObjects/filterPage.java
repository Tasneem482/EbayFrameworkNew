package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filterPage {
	public WebDriver driver;

	public filterPage(WebDriver driver) {
		this.driver=driver;
	
	}

	By MoreFilters = By.xpath("//button[normalize-space()='More filters...']");
	By price = By.xpath("//div[@id='c3-mainPanel-price']//span[1]");
	By MinPrice = By.xpath("//input[@id='c3-subPanel-_x-price-0-textrange-beginParamValue-textbox']");
	By MaxPrice = By.xpath("//input[@id='c3-subPanel-_x-price-0-textrange-endParamValue-textbox']");
	By PostageOptions = By.xpath("//span[normalize-space()='Postage options']");
	By PostageOptions1 = By.xpath("//label[contains(@for,'c3-subPanel-LH_FS_Free%20international%20postage-0_cbx')]//div[contains(@class,'x-refine__select__svg')]");
	By Seller = By.xpath("//span[normalize-space()='Seller']");
	By onlyShowitem = By.xpath("//span[normalize-space()='Only show items from:']");
	By Sellerwithebay = By.xpath("//label[normalize-space()='Sellers with eBay Stores']");
	By ShowOnly = By.xpath("//span[normalize-space()='Show only']");
	By Salesitem = By.xpath("//span[normalize-space()='Sale items']");
	By Apply = By.xpath("//button[normalize-space()='Apply']");
	
	
	public void ApplyFilter() throws InterruptedException {
		driver.findElement(MoreFilters).click();
		Thread.sleep(3000);
		driver.findElement(price).click();
		Thread.sleep(2000);
		driver.findElement(MinPrice).sendKeys("500");
		driver.findElement(MaxPrice).sendKeys("1000");
		driver.findElement(PostageOptions).click();
		driver.findElement(PostageOptions1).click();
		driver.findElement(Seller).click();
		driver.findElement(onlyShowitem).click();
		driver.findElement(Sellerwithebay).click();
		driver.findElement(ShowOnly).click();
		driver.findElement(Salesitem).click();
		driver.findElement(Apply).click();
		 Thread.sleep(5000);
	}
}
