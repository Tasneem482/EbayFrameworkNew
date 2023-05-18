package stepDefinations;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ebayLandigPage;
import utils.TestContextSetup;

public class ebayLandingPagestepdefination {
public WebDriver driver;	
TestContextSetup testContextSetup;
ebayLandigPage ebaylandingpage;

public ebayLandingPagestepdefination(TestContextSetup testContextSetup) {
	
	this.testContextSetup=testContextSetup;
	this.ebaylandingpage =testContextSetup.pageObjectManager.getebayLandingPage();
}

@Given("User is on the Ebay Website home page")
public void user_is_on_the_ebay_website_home_page() {
   
	Assert.assertTrue(ebaylandingpage.getTitleLandingPage().contains("Electronics, Cars, Fashion, Collectibles & More | eBay"));

}


@When("^user searched with keyword (.+) and Select Gift Cards$")
public void user_searched_with_keyword_and_select_gift_cards(String searchText) throws InterruptedException {
	
	

	ebaylandingpage.searchItem(searchText);
	
	
	ebaylandingpage.ApplyCategory();
	ebaylandingpage.clickSearch();
	 Thread.sleep(3000);
	
	
   
}



}
