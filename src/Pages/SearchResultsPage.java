package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Framework.DriverMenager.BrowserInstance;

public class SearchResultsPage extends BasePage {
	@FindBy(css = ".gsc-resultsbox-visible .gsc-result .gsc-url-top")
	private WebElement firstTopic;
	
	public SearchResultsPage(BrowserInstance bi) {
		super(bi);
	}

	public String GetFirstTopicName() {
		return firstTopic.getText();
	}
}
