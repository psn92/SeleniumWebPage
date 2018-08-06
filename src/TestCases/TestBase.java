package TestCases;

import java.net.MalformedURLException;
import org.testng.annotations.*;
import Framework.DriverMenager.*;
import Exceptions.BrowserNotRecognized;

public class TestBase {
	BrowserInstance bi;
	
	public TestBase(String browserName) throws BrowserNotRecognized, MalformedURLException {
		  bi = new BrowserChooser().getBrowser(browserName);
	}

  @BeforeTest
  public void openPage() throws BrowserNotRecognized, MalformedURLException {
	  bi.getDriver().get("http://www.seleniumhq.org/");
	  bi.getDriver().manage().window().maximize();
  }

  @AfterTest
  public void closePage() throws BrowserNotRecognized, MalformedURLException {
	  //bi.getDriver().close();
  }
}
