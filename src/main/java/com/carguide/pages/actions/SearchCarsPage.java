package com.carguide.pages.actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.carguide.pages.model.SearchCarsPageModel;

public class SearchCarsPage extends PageBase {

	private SearchCarsPageModel searchCarsPageModel = null;

	public SearchCarsPage(WebDriver driver) {
		super(driver);
		searchCarsPageModel = new SearchCarsPageModel(driver);

	}

	public void selectCarMake(String carBrand) {

		selectingFromDropDown(searchCarsPageModel.getCarMakeDropDownLocator(), carBrand);

	}

	public void selectCarModel(String carModel) {

		selectingFromDropDown(searchCarsPageModel.getSelectModelDropDownLocator(), carModel);

	}

	public void selectLocation(String location) {

		selectingFromDropDown(searchCarsPageModel.getSelectLocationDropDownLocator(), location);

	}

	public void selectCarPrice(String carPrice) {

		selectingFromDropDown(searchCarsPageModel.getPriceDropDownLocator(), carPrice);

	}

	public void clickOnFindMyNextCarBtn() {

		searchCarsPageModel.getFindMyNextCarBtnLocator().click();
	}

	public void veirfyPage(String header) {

		Boolean pageHeaderText = searchCarsPageModel.getDesiredHeader().getText().contains(header);
		Assert.assertTrue("Landed on wrong page", pageHeaderText);

	}

}
