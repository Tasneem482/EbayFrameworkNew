package stepDefinations;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.filterPage;
import utils.TestContextSetup;

public class FilterPagestepdefination {

public WebDriver driver;	
TestContextSetup testContextSetup;
filterPage filterPage1;

public FilterPagestepdefination(TestContextSetup testContextSetup) {
	
	this.testContextSetup=testContextSetup;
	this.filterPage1 =testContextSetup.pageObjectManager.filterpage();
	
}




@Then("User applies the Filter then Add item to cart")
public void user_applies_the_filter_then_add_item_to_cart() throws InterruptedException {
	 
	
	filterPage1.ApplyFilter();
	
	
}


}
