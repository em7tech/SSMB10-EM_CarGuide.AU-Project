package com.carguide.pages.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.carguide.pages.actions.PageBase;

public class SignUpPageModel {

	@FindBy(how = How.CSS, using = "input[type='email'][name='email']")
	private WebElement emailLocator;

	@FindBy(how = How.NAME, using = "password")
	private WebElement passwordLocator;

	@FindBy(how = How.NAME, using = "given_name")
	private WebElement firstNameLocator;

	@FindBy(how = How.NAME, using = "family_name")
	private WebElement lastNameLocator;

	@FindBy(how = How.XPATH, using = "//span[text()='Sign Up']")
	private WebElement signUpLocator;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),\"Can't be blank\")]")
	private WebElement errorMsgLocator;

	public WebElement getEmailLocator() {
		return emailLocator;
	}

	public WebElement getPasswordLocator() {
		return passwordLocator;
	}

	public WebElement getFirstNameLocator() {
		return firstNameLocator;
	}

	public WebElement getLastNameLocator() {
		return lastNameLocator;
	}

	public WebElement getSignUpLocator() {
		return signUpLocator;
	}

	public WebElement getErrorMsgLocator() {
		return errorMsgLocator;
	}

	public SignUpPageModel(WebDriver driver) {
		//super(driver);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

	}

}
