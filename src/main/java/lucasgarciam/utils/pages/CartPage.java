package lucasgarciam.utils.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

public class CartPage {

    private AndroidDriver driver;

    private By productNameLocator = AppiumBy.id("com.androidsample.generalstore:id/productName");
    private By totalAmountLocator = AppiumBy.id("com.androidsample.generalstore:id/totalAmountLbl");
    private By termsButtonLocator = AppiumBy.id("com.androidsample.generalstore:id/termsButton");
    private By acceptTermsLocator = AppiumBy.className("android.widget.CheckBox");
    private By proceedButtonLocator = AppiumBy.id("com.androidsample.generalstore:id/btnProceed");
    private By alertAcceptButtonLocator = AppiumBy.id("android:id/button1");
    private By firstCartProductLocator = AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName'])[1]");
    private By secondCartProductLocator = AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName'])[2]");

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(productNameLocator).getText();
    }

    public String getTotalAmount() {
        return driver.findElement(totalAmountLocator).getText();
    }

    public void openTerms() {
        WebElement termsButton = driver.findElement(termsButtonLocator);
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) termsButton).getId(), "duration", 2000));
    }

    public void closeTerms() {
        driver.findElement(alertAcceptButtonLocator).click();
    }

    public void acceptTerms() {
        driver.findElement(acceptTermsLocator).click();
    }

    public void completePurchase() {
        driver.findElement(proceedButtonLocator).click();
    }

    public void verifyFirstProduct(String firstProduct) {
        String firstCartProduct = driver.findElement(firstCartProductLocator).getText();
        Assert.assertEquals(firstCartProduct, firstProduct);
    }

    public void verifySecondProduct(String secondProduct) {
        String secondCartProduct = driver.findElement(secondCartProductLocator).getText();
        Assert.assertEquals(secondCartProduct, secondProduct);
    }
}