package com.carguide.pages.actions;

import org.openqa.selenium.WebDriver;
import com.carguide.util.DriverFactory;

public class AppPage {

	private WebDriver driver = null;

	protected HomePage homePage = null;
	protected SignUpPage signUpPage = null;
	protected SignInPage signInPage = null;
	protected SearchCarsPage searchCarsPage = null;

	public AppPage(WebDriver driver) {
		this.driver = driver;
	}

	public AppPage() {
		this.driver = DriverFactory.getInstance().getDriver();
	}

	public HomePage homePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}

	public SignUpPage signUpPage() {
		if (signUpPage == null) {
			signUpPage = new SignUpPage(driver);
		}
		return signUpPage;
	}

	public SignInPage signInPage() {
		if (signInPage == null) {
			signInPage = new SignInPage(driver);
		}
		return signInPage;
	}

	public SearchCarsPage searchCarsPage() {
		if (searchCarsPage == null) {
			searchCarsPage = new SearchCarsPage(driver);
		}
		return searchCarsPage;
	}
	

}
