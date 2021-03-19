package com.carguide.pages.actions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.carguide.pages.model.HomePageModel;

public class HomePage extends PageBase {

	private HomePageModel homePageModel = null;

	public HomePage(WebDriver driver) {
		super(driver);
		homePageModel = new HomePageModel(driver);
	}

	public void navigateToSignUpPage() {

		homePageModel.getSignUpLinkLocator().click();
	}

	public void verifyPageLink(String expectedText) {

		String actualText = homePageModel.getVerifyTilteLinkLocator().getText();
		assertThat(actualText).isEqualToIgnoringCase(expectedText);
		System.out.println("Landing on home page");

	}

	public void verifyUserName(String expectedName) {

		WebElement text = ex.waitForVisibilityOfElement(homePageModel.getAcctNameLocator());
		String actual = text.getText();
		assertEquals(expectedName, actual);

	}

	public void moveToBuyPlusSellMenu(List<String>list) {

		String menu = list.get(1);
		System.out.println("Menu selected is :" + menu);
		moveToElement(homePageModel.getBuyPlusSaleCarLinkLocator());
	}

	
	public void clickOnMenu(String carsSection) {
		if (carsSection.equalsIgnoreCase("Search cars")) {
			homePageModel.getSearchCarsLinkLocator().click();
		}else if (carsSection.equalsIgnoreCase("Used")) {
			homePageModel.getUsedCarsSearchLinkLocator().click();
		}else if (carsSection.equalsIgnoreCase("New")) {
			homePageModel.getNewCarsSearchLinkLocator().click();
		}

	}

	public void moveToReviewMenu() {

		moveToElement(homePageModel.getReviewsLinkLocator());

	}

}
