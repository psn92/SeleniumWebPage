package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Framework.DriverMenager.BrowserInstance;

public class StartPage extends BasePage {
	@FindBy(id = "q")
	private WebElement SearchInput;
	@FindBy(id = "submit")
	private WebElement SearchSubmit;
	
	public StartPage(BrowserInstance bi) {
		super(bi);
		url = "http://www.seleniumhq.org/";
	}

	public boolean GetVisibility_ToolbarTopicAbout() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean IsAnLink_ToolbarTopicAbout() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean GetVisibility_ToolbarTopicProject() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean IsAnLink_ToolbarTopicProject() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean GetVisibility_ToolbarTopicDownload() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean IsAnLink_ToolbarTopicDownload() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean GetVisibility_ToolbarTopicDocumentation() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean IsAnLink_ToolbarTopicDocumentation() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean GetVisibility_ToolbarTopicSupport() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean IsAnLink_ToolbarTopicSupport() {
		// TODO Auto-generated method stub
		return false;
	}

	public void TypeToSearch(String word) {
		new PageTools(bi.getDriverWait(), bi.getDriver()).WaitForElementPresent(SearchInput);
		SearchInput.sendKeys(word);
	}

	public SearchResultsPage ClickSearchGoButton() {
		SearchSubmit.click();
		
		return new SearchResultsPage(bi);
	}
}
