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
import pageObjects.filterPage;
import pageObjects.itemDetailPage;

import utils.TestContextSetup;

public class ItemDetailPagestepdefination {

	TestContextSetup testContextSetup;
	itemDetailPage itemPage;

	public ItemDetailPagestepdefination(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;
		this.itemPage =testContextSetup.pageObjectManager.itemdetailpage();
	}

	@Then("validate item is added successfully in the cart")
	public void validate_item_is_added_successfully_in_the_cart() {
	

		switchToItemDetailsPage();
		itemPage.AddtoCartItem();
		itemPage.verifyItemAddedtoCart();

	}

	public void switchToItemDetailsPage() {
	
	
		itemPage.clickonItem();
	
		itemPage.SwitchtoNewWindow();
		
	

	}

}
