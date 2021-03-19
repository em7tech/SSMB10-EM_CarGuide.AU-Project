package com.carguide.pages.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePageModel  {
	
	@FindBy(xpath = "//span[contains(text(),'Sign up / Sign in')]")
	private WebElement signUpLinkLocator;

	@FindBy(xpath = "//span[contains(text(),'Sign up / Sign in')]")
	private WebElement verifyTilteLinkLocator;

	@FindBy(how = How.LINK_TEXT, using = "buy + sell")
	private WebElement buyPlusSaleCarLinkLocator;

	@FindBy(how = How.LINK_TEXT, using = "reviews")
	private WebElement reviewsLinkLocator;

	@FindBy(how = How.LINK_TEXT, using = "news")
	private WebElement newsLinkLocator;

	@FindBy(how = How.LINK_TEXT, using = "Search Cars")
	private WebElement searchCarsLinkLocator;

	@FindBy(how = How.LINK_TEXT, using = "Used")
	private WebElement usedCarsSearchLinkLocator;

	@FindBy(how = How.LINK_TEXT, using = "New")
	private WebElement newCarsSearchLinkLocator;

	public WebElement getSignUpLinkLocator() {
		return signUpLinkLocator;
	}

	public WebElement getVerifyTilteLinkLocator() {
		return verifyTilteLinkLocator;
	}

	public WebElement getBuyPlusSaleCarLinkLocator() {
		return buyPlusSaleCarLinkLocator;
	}

	public WebElement getReviewsLinkLocator() {
		return reviewsLinkLocator;
	}

	public WebElement getNewsLinkLocator() {
		return newsLinkLocator;
	}

	public WebElement getSearchCarsLinkLocator() {
		return searchCarsLinkLocator;
	}

	public WebElement getUsedCarsSearchLinkLocator() {
		return usedCarsSearchLinkLocator;
	}

	public WebElement getNewCarsSearchLinkLocator() {
		return newCarsSearchLinkLocator;
	}
	


	private By acctName = By.xpath("//span[@class='uhf-logged-out-show uhf-user-label']/following-sibling::span");
	
	public By getAcctNameLocator () {
		
		return acctName;
	}
	
	public HomePageModel(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

}
