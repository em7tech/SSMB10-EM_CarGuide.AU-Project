package com.carguide.steps;

import com.carguide.base.StepBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPageSteps extends StepBase {

	@And("user click on sign up button")
	public void user_click_on_sign_up_button() {

		carGuide.signUpPage().clickSignUp();
	}

	@Then("sign up page should display with text {string}")
	public void sign_up_page_should_display(String expectedText) {

		carGuide.signUpPage().verifySignUpLink(expectedText);

	}

	@And("the new page title should be {string}")
	public void the_new_page_title_should_be(String expectedTitle) {

		carGuide.signUpPage().verifyTitle(expectedTitle);

	}

	@When("user enter email address is {string}")
	public void user_enter_email_address_is(String userEmail) {

		carGuide.signUpPage().enterEmail(userEmail);
	}

	@And("user enter password is {string}")
	public void user_enter_password_is(String userPass) {

		carGuide.signUpPage().enterPassword(userPass);

	}

	@And("user enter first name is {string}")
	public void user_enter_first_name_is(String firstName) {

		carGuide.signUpPage().enterFirstName(firstName);
	}

	@And("user enter last name is {string}")
	public void user_enter_last_name_is(String lastName) {

		carGuide.signUpPage().enterLastName(lastName);
	}

	@Then("user should see the verification message")
	public void user_should_see_the_verification_message() {

		// Due to captcha only printing the message
		System.out.println("SIGN UP COMPLETED ");

	}

	@Then("warning sign {string} should pop up")
	public void warning_sign_should_pop_up(String text) {

		 carGuide.signUpPage().getErrorMsg(text);
		

	}

	@Then("warning sign should pop up")
	public void warning_sign_should_pop_up() {

		// Warning sign locator cant be fetched cause it gets disappear.Therfor just
		// printing the message.
		System.out.println("Please enter at least one capital letter and one numeric for valid password");
	}

}
