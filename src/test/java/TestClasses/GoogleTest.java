package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageClasses.*;

//@Listeners(ExtentITestListenerClassAdapter.class)
public class GoogleTest extends BaseClass {

	public GoogleTest() {
		super();
	}

	@Test(priority = 1)
	public void googleTest_Method_1() {
		System.out.println("Google Test Thread = " + Thread.currentThread().getId());
		getDriver().get("https://www.google.com/");
	}

	@Test(priority = 2)
	public void googleTest_Method_2() throws InterruptedException {
		GooglePage googlePage = new GooglePage();
		googlePage.googleSearch("Google");
		Assert.assertEquals(getDriver().getTitle(), "Google - Google Search");
	}
}
