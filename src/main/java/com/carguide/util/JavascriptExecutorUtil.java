package com.carguide.util;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorUtil {

    private JavascriptExecutor jsDriver = null;

    public JavascriptExecutorUtil(WebDriver driver){
        this.jsDriver = (JavascriptExecutor) driver;
    }

    public void click(WebElement element) {
        this.jsDriver.executeScript("arguments[0].click()", element);
    }
    public void highlight(WebElement element) {
        for (int i = 0; i < 2; i++) {
            jsDriver.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "border: 2px solid yellow;");
            delayFor(200);
            jsDriver.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "");
            delayFor(200);
        }
    }
    public void scrollElementIntoView(WebElement element) {
        //this is for js scroll the browser page
        jsDriver.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void setAttribute(WebElement element, String attributeName, String attributeValue) {
        jsDriver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, attributeValue);
    }

    private void delayFor(int secInMili) {
        try {
            Thread.sleep(secInMili);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
