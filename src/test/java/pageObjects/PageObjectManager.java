package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public ebayLandigPage ebaylandingPage;
	public filterPage filterPage;
	public WebDriver driver;
	public itemDetailPage itemDetailPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public ebayLandigPage getebayLandingPage()
	{
	
		ebaylandingPage= new ebayLandigPage(driver);
	 return ebaylandingPage;
	}
	
	public filterPage filterpage()
	{
		filterPage = new filterPage(driver);
		return filterPage;
	}
	
	public itemDetailPage itemdetailpage()
	{
		itemDetailPage = new itemDetailPage(driver);
		return itemDetailPage;
	}
}
