package com.carguide.base;

import org.openqa.selenium.WebDriver;

import com.carguide.pages.actions.AppPage;
import com.carguide.util.DriverFactory;
import com.carguide.util.ExplicitWait;


public class StepBase {
	
	protected WebDriver driver = null;
	protected AppPage carGuide =null;
	protected ExplicitWait ex =null;
	
	
	public StepBase() { 
		
		driver=DriverFactory.getInstance().getDriver();
		carGuide = new AppPage();
		ex = new ExplicitWait(driver);
			
	}
	
	public void navigateToUrl(String url) {
		
		driver.get(url);
	}
	
	
	

}
