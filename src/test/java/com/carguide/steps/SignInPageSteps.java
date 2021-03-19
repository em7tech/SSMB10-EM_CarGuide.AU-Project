package com.carguide.steps;

import com.carguide.base.StepBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageSteps extends StepBase {

	@Then("sign in page should display {string}")
	public void sign_in_page_should_display(String expectedText) {

		carGuide.signInPage().verifyTitle(expectedText);

	}

	@Then("sign in page display {string}")
	public void sign_in_page_display(String expectedTitle) {

		carGuide.signInPage().verifyTitle(expectedTitle);

	}

	@When("user click on sign in tab")
	public void user_click_on_sign_in_tab() {

		carGuide.signInPage().clickSignIntab();
	}

	@And("user click on sign in button")
	public void user_click_on_sign_in_button() {

		carGuide.signInPage().clickSignInBtn();
	}

	@And("error message should display with {string}")
	public void error_message_should_display_with(String expectedMsg) {

		carGuide.signInPage().verifyErrorMsg(expectedMsg);

	}

}
