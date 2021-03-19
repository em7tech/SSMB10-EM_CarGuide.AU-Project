package com.carguide.pages.actions;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import com.carguide.pages.model.SignInPageModel;

public class SignInPage extends SignInPageModel {

	private SignInPageModel signInPageModel = null;

	public SignInPage(WebDriver driver) {
		super(driver);
		signInPageModel = new SignInPageModel(driver);

	}

	public void clickSignIntab() {

		signInPageModel.getSignInTabLocator().click();

	}

	public void clickSignInBtn() {

		signInPageModel.getSignInBtnLocator().click();

	}

	public String verifySignInLink() {

		String actualText = signInPageModel.getSignInTabLocator().getText();

		return actualText;
	}

	public boolean verifySignInLink(String text) {

		boolean actualText = signInPageModel.getSignInTabLocator().getText().contains(text);

		return actualText;
	}

	public void verifyErrorMsg(String expectedMsg) {

		String text = verifyErrMsgLocator().getText();
		assertThat(text).isEqualToIgnoringCase(expectedMsg);

	}

}
