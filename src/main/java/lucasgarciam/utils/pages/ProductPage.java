package lucasgarciam.utils.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;

public class ProductPage {

    private AndroidDriver driver;

    private By productNameLocator = By.id("com.androidsample.generalstore:id/productName");
    private By productAddCartLocator = By.id("com.androidsample.generalstore:id/productAddCart");
    private By cartButtonLocator = AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart");

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart(String productName) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + productName + "\"))"));

        int productCount = driver.findElements(productNameLocator).size();
        for (int i = 0; i < productCount; i++) {
            String currentProductName = driver.findElements(productNameLocator).get(i).getText();
            if (currentProductName.equalsIgnoreCase(productName)) {
                driver.findElements(productAddCartLocator).get(i).click();
                break;
            }
        }
    }

    public void goToCart() {
        driver.findElement(cartButtonLocator).click();
    }
}