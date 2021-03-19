package com.carguide.steps;

import com.carguide.base.StepBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AppSteps extends StepBase {

	@Given("not a existing user")
	public void not_a_existing_user() {

		driver.manage().deleteAllCookies();

	}

	@Given("user already register in the application")
	public void user_already_register_in_the_application() {

		not_a_existing_user();
	}

	@When("user navigate to the application site {string}")
	public void user_navigate_to_the_application_site(String url) {

		navigateToUrl(url);
	}

	@Given("I am on the home page {string} of CarsGuide website")
	public void i_am_on_the_home_page_of_cars_guide_website(String url) {

		user_navigate_to_the_application_site(url);
	}

}
