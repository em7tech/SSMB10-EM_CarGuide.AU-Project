package com.carguide.pages.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.opentest4j.TestSkippedException;

import com.carguide.pages.model.SignUpPageModel;

public class SignUpPage extends PageBase {

	private SignUpPageModel signUpPageModel = null;

	public SignUpPage(WebDriver driver) {
		super(driver);
		signUpPageModel = new SignUpPageModel(driver);

	}

	public void enterEmail(String userEmail) {

		signUpPageModel.getEmailLocator().sendKeys(userEmail);

	}

	public void enterPassword(String userPass) {
		signUpPageModel.getPasswordLocator().sendKeys(userPass);

	}

	public void enterFirstName(String enterFirstName) {
		signUpPageModel.getFirstNameLocator().sendKeys(enterFirstName);

	}

	public void enterLastName(String enterLastName) {
		signUpPageModel.getLastNameLocator().sendKeys(enterLastName);

	}

	public void clickSignUp() {

		signUpPageModel.getSignUpLocator().click();
	}

	public String verifySignUpLink() {

		String actualText = signUpPageModel.getSignUpLocator().getText();

		return actualText;
	}

	public void verifySignUpLink(String text) {

		boolean actualText = signUpPageModel.getSignUpLocator().getText().contains(text);
		Assert.assertTrue("Wrong Section", actualText);

	}

	public void getErrorMsg(String expectedText) {

		String text = signUpPageModel.getErrorMsgLocator().getText();

		if (text != null) {
			System.out.println("Printing the warning field : " + text);
			assertThat(expectedText, is(equalTo(text)));
		} else
			throw new TestSkippedException();

	}

}
