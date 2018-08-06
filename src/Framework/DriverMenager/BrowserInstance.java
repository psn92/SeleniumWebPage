package Framework.DriverMenager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BrowserInstance {
	public WebDriver getDriver();
	public WebDriverWait getDriverWait();
}
