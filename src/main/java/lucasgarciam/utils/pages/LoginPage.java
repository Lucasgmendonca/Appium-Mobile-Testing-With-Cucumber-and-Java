package lucasgarciam.utils.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

    private AndroidDriver driver;

    private By nameFieldLocator = AppiumBy.id("com.androidsample.generalstore:id/nameField");
    private By genderMaleButtonLocator = AppiumBy.xpath("//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioMale']");
    private By genderFemaleButtonLocator = AppiumBy.xpath("//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioFemale']");
    private By countryDropdownLocator = AppiumBy.id("android:id/text1");
    private By letsShopButtonLocator = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        driver.findElement(nameFieldLocator).sendKeys(name);
    }

    public void selectGender(String gender) {
        if (gender.equals("Male")) {
            driver.findElement(genderMaleButtonLocator).click();
        } else if (gender.equals("Female")) {
            driver.findElement(genderFemaleButtonLocator).click();
        }
    }

    public void selectCountry(String countryName) {
        driver.findElement(countryDropdownLocator).click();
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + countryName + "\"))")).click();
    }

    public void clickLetsShop() {
        driver.findElement(letsShopButtonLocator).click();
    }
}