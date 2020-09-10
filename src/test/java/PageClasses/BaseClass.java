package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	@BeforeClass
	public void beforeCLass() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
	}

	public WebDriver getDriver() {
		return driver.get();

	}
	
	@AfterClass
	public void afterClass() {
		driver.get().close();
	}
}
