package Pages;

import Framework.DriverMenager.BrowserInstance;

public class BasePage {
	protected BrowserInstance bi;
	protected String url;

	public BasePage(BrowserInstance bi) {
		bi = this.bi;
	}
	
	public String GetUrl() {
		return url;
	}
	
	public void LoadPage() {
		bi.getDriver().get(url);
	}
}
