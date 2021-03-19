package com.carguide.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.carguide.base.StepBase;
import com.carguide.util.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookSteps extends StepBase {
	
	@Before
	public void setUp() {
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@After
	public void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","img.png");
        }
		DriverFactory.getInstance().quit();
		driver=null;
		carGuide = null;
	
	}

}
