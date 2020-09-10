package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import PageClasses.*;


//@Listeners(ExtentITestListenerClassAdapter.class)
public class SearchTest extends BaseClass {

	public SearchTest() {
		super();
	}

	@Test(priority = 1)
	public void searchTest_Method_1() {
		System.out.println("Search Test Thread = " + Thread.currentThread().getId());
		getDriver().get("https://www.selenium.dev/");
	}

	@Test(priority = 2)
	public void searchTest_Method_2() throws InterruptedException {
		SearchPage searchPage = new SearchPage();
		searchPage.searchPage("wait");
		Assert.assertEquals(getDriver().getTitle(), "SeleniumHQ Browser Automation");
		Assert.assertEquals(searchPage.getDownloadText(), "Downloads");
	}

}
