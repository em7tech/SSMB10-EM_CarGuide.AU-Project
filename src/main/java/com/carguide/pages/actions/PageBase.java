package com.carguide.pages.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.carguide.util.ExplicitWait;

public class PageBase {
	
	protected WebDriver driver = null;
	protected ExplicitWait ex;

	public PageBase(WebDriver driver) {
		
		this.driver = driver;
		ex = new ExplicitWait(driver);
	}
	
	public void verifyTitle(String expectedTitle) {
		
		String actual= driver.getTitle();
		assertThat(actual, is(equalTo(expectedTitle)));
	
	}
	
	public void moveToElement(WebElement locator) {
		
		Actions action = new Actions(driver);
		action.moveToElement(locator).perform();
	}
	
	public void selectingFromDropDown(WebElement element,String selectDropDown) {

		Select select = new Select(element);
		select.selectByVisibleText(selectDropDown);
	}
	
	
}
