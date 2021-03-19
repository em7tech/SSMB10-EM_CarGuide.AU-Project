package com.carguide.steps;

import java.util.List;
import com.carguide.base.StepBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends StepBase {

	@Then("home page should display with text {string} on right hand corner")
	public void home_page_should_display_with_text(String expectedText) {

		carGuide.homePage().verifyPageLink(expectedText);

	}

	@Then("home page should display {string}")
	public void home_page_should_display(String expectedTitle) {

		ex.waitForTitleToBe(expectedTitle);
		carGuide.homePage().verifyTitle(expectedTitle);

	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {

		carGuide.homePage().verifyTitle(expectedTitle);

	}

	@When("user click on sign up link")
	public void user_click_on_sign_up_link() {

		carGuide.homePage().navigateToSignUpPage();
	}

	@When("user click on sign in link")
	public void user_click_on_sign_in_link() {

		user_click_on_sign_up_link();
	}

	@Then("user name {string} display at the top right corner")
	public void user_name_display_at_the_top_right_corner(String expectedName) {

		carGuide.homePage().verifyUserName(expectedName);

	}

	@When("I move to the top menu")
	public void i_move_to_the_top_menu(List<String> list) {
		
		carGuide.homePage().moveToBuyPlusSellMenu(list);
	}

	@And("I click on {string} link")
	public void i_click_on_link(String list) {

		carGuide.homePage().clickOnMenu(list);

	}
}
