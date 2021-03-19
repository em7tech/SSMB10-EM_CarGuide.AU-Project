package com.carguide.pages.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.carguide.pages.actions.PageBase;

public class SignInPageModel extends PageBase {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'sign in')]")
	private WebElement signInTabLocator;

	@FindBy(how = How.CSS, using = ".auth0-label-submit")
	private WebElement signInBtnLocator;

	@FindBy(how = How.XPATH, using = "//span[text()='Wrong email or password.']")
	private WebElement errorMsgLocator;
	
	

	public WebElement getSignInTabLocator() {
		return signInTabLocator;
	}

	public WebElement getSignInBtnLocator() {
		return signInBtnLocator;
	}

	public WebElement getErrorMsgLocator() {
		return errorMsgLocator;
	}

	public SignInPageModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

	}

	public WebElement verifyErrMsgLocator() {

		return ex.waitForVisibilityOfElement(By.xpath("//span[text()='Wrong email or password.']"));

	}

}
