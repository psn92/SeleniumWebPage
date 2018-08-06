package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.testng.annotations.*;

import Framework.DriverMenager.*;
import Pages.SearchResultsPage;
import Pages.StartPage;
import Exceptions.BrowserNotRecognized;

public class TopToolbar_Content extends TestBase {
	private BrowserInstance bi;
	private StartPage startPage;

	@Parameters("browsername")
	public TopToolbar_Content(String browserName) throws BrowserNotRecognized, MalformedURLException {
		  super(browserName);
		  startPage = new StartPage(bi);
	}
	
	@Test
	public void ByTypingWordInSearchUserCanFindExpectingItem() {
		startPage.TypeToSearch("selenium");
		SearchResultsPage resultsPage = startPage.ClickSearchGoButton();
		String firstItemSouerce = resultsPage.GetFirstTopicName();
		
		assertEquals(firstItemSouerce, startPage.GetUrl(), "About topic is not present on page");
	}
	
	@Test
	public void VisibilityAndTypeOfTopicProject() {
		boolean visibility = startPage.GetVisibility_ToolbarTopicProject();
		boolean isLink = startPage.IsAnLink_ToolbarTopicProject();
		
		assertTrue(visibility, "About topic is not present on page");
		assertTrue(isLink, "About topic does not contains link");
	}
	
	@Test
	public void VisibilityAndTypeOfTopicDownload() {
		boolean visibility = startPage.GetVisibility_ToolbarTopicDownload();
		boolean isLink = startPage.IsAnLink_ToolbarTopicDownload();
		
		assertTrue(visibility, "About topic is not present on page");
		assertTrue(isLink, "About topic does not contains link");
	}
	
	@Test
	public void VisibilityAndTypeOfTopicDocumentation() {
		boolean visibility = startPage.GetVisibility_ToolbarTopicDocumentation();
		boolean isLink = startPage.IsAnLink_ToolbarTopicDocumentation();
		
		assertTrue(visibility, "About topic is not present on page");
		assertTrue(isLink, "About topic does not contains link");
	}
	
	@Test
	public void VisibilityAndTypeOfTopicSupport() {
		boolean visibility = startPage.GetVisibility_ToolbarTopicSupport();
		boolean isLink = startPage.IsAnLink_ToolbarTopicSupport();
		
		assertTrue(visibility, "About topic is not present on page");
		assertTrue(isLink, "About topic does not contains link");
	}
	
	@Test
	public void VisibilityAndTypeOfTopicAbout() {
		boolean visibility = startPage.GetVisibility_ToolbarTopicAbout();
		boolean isLink = startPage.IsAnLink_ToolbarTopicAbout();
		
		assertTrue(visibility, "About topic is not present on page");
		assertTrue(isLink, "About topic does not contains link");
	}
}
