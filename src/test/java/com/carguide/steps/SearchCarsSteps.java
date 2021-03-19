package com.carguide.steps;

import com.carguide.base.StepBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchCarsSteps extends StepBase {

	@And("select carbrand as {string} from Anymake dropdown")
	public void select_carbrand_as_from_anymake_dropdown(String carBrand) {

		carGuide.searchCarsPage().selectCarMake(carBrand);
	}

	@And("select carmodel as {string} from SelectModel dropdown")
	public void select_carmodel_as_from_select_model_dropdown(String carModel) {

		carGuide.searchCarsPage().selectCarModel(carModel);
	}

	@And("select location as {string} from AnyLocation dropdown")
	public void select_location_as_from_any_location_dropdown(String location) {

		carGuide.searchCarsPage().selectLocation(location);
	}

	@And("select price as {string} from price dropdown")
	public void select_price_as_from_price_dropdown(String carPrice) {

		carGuide.searchCarsPage().selectCarPrice(carPrice);
	}

	@And("I click on Find_My_Next_Car button")
	public void i_click_on_find_my_next_car_button() {

		carGuide.searchCarsPage().clickOnFindMyNextCarBtn();
	}

	@Then("I should see list of search cars {string}")
	public void i_should_see_list_of_search_cars(String header) {

		carGuide.searchCarsPage().veirfyPage(header);
	}

}
