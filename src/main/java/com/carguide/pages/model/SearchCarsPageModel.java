package com.carguide.pages.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.carguide.pages.actions.PageBase;

public class SearchCarsPageModel {

	@FindBy(how = How.XPATH, using = "//*[@id='makes']")
	private WebElement carMakeDropDownLocator;

	@FindBy(how = How.XPATH, using = "//*[@id='models']")
	private WebElement selectModelDropDownLocator;

	@FindBy(how = How.XPATH, using = "//select[@id='locations']")
	private WebElement selectLocationDropDownLocator;

	@FindBy(how = How.NAME, using = "priceTo")
	private WebElement priceDropDownLocator;

	@FindBy(how = How.XPATH, using = "//input[@id='search-submit'][@value='Find My Next Car']")
	private WebElement findMyNextCarBtnLocator;

	@FindBy(how = How.CSS, using = ".listing-search-title")
	private WebElement desiredHeader;

	public WebElement getCarMakeDropDownLocator() {
		return carMakeDropDownLocator;
	}

	public WebElement getSelectModelDropDownLocator() {
		return selectModelDropDownLocator;
	}

	public WebElement getSelectLocationDropDownLocator() {
		return selectLocationDropDownLocator;
	}

	public WebElement getPriceDropDownLocator() {
		return priceDropDownLocator;
	}

	public WebElement getFindMyNextCarBtnLocator() {
		return findMyNextCarBtnLocator;
	}

	public WebElement getDesiredHeader() {
		return desiredHeader;
	}

	public SearchCarsPageModel(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

	}

}
