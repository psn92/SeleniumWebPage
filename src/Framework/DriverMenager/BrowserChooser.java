package Framework.DriverMenager;

import java.net.MalformedURLException;

import Exceptions.BrowserNotRecognized;

public class BrowserChooser {
	public BrowserChooser() {}
	
	public BrowserInstance getBrowser(String name) throws BrowserNotRecognized, MalformedURLException {
		if(name.equals("chrome"))
			return new ChromeInstance();
		else if(name.equals("firefox"))
			return new FirefoxInstance();
		else
			throw new BrowserNotRecognized();
	}
}
