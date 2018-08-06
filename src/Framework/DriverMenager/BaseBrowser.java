package Framework.DriverMenager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseBrowser {
	URL url;
	int webDriverSleepTime = 10000;
	WebDriver webDriver;
	WebDriverWait webDriverWait;
	
	public BaseBrowser() throws MalformedURLException {
		url = new URL("http://localhost:4444/wd/hub");
	}

	public WebDriver getDriver() {
		return webDriver;
	}

	public WebDriverWait getDriverWait() {
		return webDriverWait;
	}
}
