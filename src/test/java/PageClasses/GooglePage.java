package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BaseClass{

	public GooglePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(name = "q")
	WebElement searchBox;
	
	public void googleSearch(String searchKeyword) throws InterruptedException {
		searchBox.sendKeys(searchKeyword);
		Thread.sleep(1000);
		searchBox.submit();
		Thread.sleep(1000);
	}
}
