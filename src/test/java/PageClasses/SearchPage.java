package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{

	//BaseClass bc = new BaseClass();
	
	public SearchPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@title='search']")
	WebElement searchBox;
	@FindBy(xpath = "(//a[@class='nav-item'])[1]")
	WebElement downloadText;
	
	public String searchPage(String searchKeyword) throws InterruptedException {
		searchBox.sendKeys(searchKeyword);
		Thread.sleep(1000);
		String text = downloadText.getText();
		return text;
	}
	
	public String getDownloadText() {
		return downloadText.getText();
	}
}
