package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTools {
	private WebDriverWait wait;
	private static WebDriver driver;
	@FindBy(id = "header")
	WebElement header;
	
	public PageTools(WebDriverWait wait, WebDriver driver) {
		this.wait = wait;
		PageTools.driver = driver;
	}
	
	public void WaitForElementPresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
}
