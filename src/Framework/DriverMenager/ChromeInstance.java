package Framework.DriverMenager;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeInstance extends BaseBrowser implements BrowserInstance {
	
	public ChromeInstance() throws MalformedURLException{
		super();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WIN10);
		webDriver = new RemoteWebDriver(url, cap);
		
		webDriverWait = new WebDriverWait(webDriver, webDriverSleepTime);
	}
	
	public ChromeInstance(int webDriverSleepTime) throws MalformedURLException {
		super();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WIN10);
		webDriver = new RemoteWebDriver(url, cap);
		
		this.webDriverSleepTime = webDriverSleepTime;
		webDriverWait = new WebDriverWait(webDriver, webDriverSleepTime);
	}
}
