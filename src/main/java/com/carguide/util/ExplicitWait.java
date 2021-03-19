package com.carguide.util;


import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class ExplicitWait {

    private WebDriver driver = null;
    private static Integer defaultTimeOutInSeconds = 30;
    private static Integer defaultPollingInMillis = 100;

    public ExplicitWait(WebDriver driver){
        this.driver = driver;
    }
    public ExplicitWait(WebDriver driver,Integer timeOutInSeconds, Integer pollingInMillis ){
        this.driver = driver;
        ExplicitWait.defaultTimeOutInSeconds = timeOutInSeconds;
        ExplicitWait.defaultPollingInMillis = pollingInMillis;
    }


    public Boolean waitForTitleToBe(String expectedTitle){
        return seleniumWait().until(ExpectedConditions.titleIs(expectedTitle));
    }

    public Boolean waitForUrlToBe(String expectedUrl){
        return seleniumWait().until(ExpectedConditions.urlToBe(expectedUrl));
    }

    public Boolean waitForUrlMatches(String expectedUrlRegex){
        return seleniumWait().until(ExpectedConditions.urlMatches(expectedUrlRegex));
    }

    public WebElement waitForPresenceOfElement(By elementLocatedBy){
        return seleniumWait().until(ExpectedConditions.presenceOfElementLocated(elementLocatedBy));
    }

    public WebElement waitForVisibilityOfElement(By elementLocatedBy){
        return seleniumWait().until(ExpectedConditions.visibilityOfElementLocated(elementLocatedBy));
    }
    
  
    public Boolean waitForTextToBePresentInElement(By elementLocatedBy, String textToBe){
        return seleniumWait().until(ExpectedConditions.textToBePresentInElementLocated(elementLocatedBy, textToBe));
    }
    public Boolean waitForValueToBePresentInElement(By elementLocatedBy, String valueToBe){
        return seleniumWait().until(ExpectedConditions.textToBePresentInElementValue(elementLocatedBy, valueToBe));
    }
    public Boolean waitForAttributeToBePresentInElement(By elementLocatedBy, String attribute, String valueToBe){
        return seleniumWait().until(ExpectedConditions.attributeToBe(elementLocatedBy, attribute, valueToBe));
    }

    public Boolean waitForNotPresenceOfElement(By elementLocatedBy){
        return seleniumWait().until(ExpectedConditions.invisibilityOfElementLocated(elementLocatedBy));
    }
    public Boolean waitForNotTextToBePresentInElement(By elementLocatedBy, String textToBe){
        return seleniumWait().until(ExpectedConditions.invisibilityOfElementWithText(elementLocatedBy, textToBe));
    }
    public WebElement waitForElementToBeClickable(By elementLocatedBy){
        return seleniumWait().until(ExpectedConditions.elementToBeClickable(elementLocatedBy));
    }


    public WebElement waitForElement(final By locator) {
        JavascriptExecutorUtil jsUtil = new JavascriptExecutorUtil(driver);
        WebElement foo = seleniumWait().until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(locator);
                if (element != null) {
                    jsUtil.highlight(element);
                    return element;
                }
                return null;
            }
        });
        return foo;
    }
    public WebElement waitForElementDisplayed(final By locator) {
        JavascriptExecutorUtil jsUtil = new JavascriptExecutorUtil(driver);
        WebElement foo = seleniumWait().until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(locator);
                if (element != null && element.isDisplayed()) {
                    jsUtil.highlight(element);
                    return element;
                }
                return null;
            }
        });
        return foo;
    }

    public WebElement waitForElementEnabled(final By locator) {
        JavascriptExecutorUtil jsUtil = new JavascriptExecutorUtil(driver);
        WebElement foo = seleniumWait().until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(locator);
                if (element != null && element.isEnabled()) {
                    jsUtil.highlight(element);
                    return element;
                }
                return null;
            }
        });
        return foo;
    }

    public void delayFor(int secInMili) {
        try {
            Thread.sleep(secInMili);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public Wait<WebDriver> seleniumWait(){
        return seleniumWait(defaultTimeOutInSeconds,defaultPollingInMillis);
    }
    public Wait<WebDriver> seleniumWait(Integer timeOutInSeconds){
        return seleniumWait(timeOutInSeconds,defaultPollingInMillis);
    }
    public Wait<WebDriver> seleniumWait(Integer timeOutInSeconds, Integer pollingInMillis){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOutInSeconds))
                .pollingEvery(Duration.ofMillis(pollingInMillis))
                .ignoring(NoSuchElementException.class);

        return  wait;
    }

}
