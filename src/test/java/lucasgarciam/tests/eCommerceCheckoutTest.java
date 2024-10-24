package lucasgarciam.tests;

import org.testng.annotations.Test;

import lucasgarciam.pageobjects.CartPage;
import lucasgarciam.pageobjects.LoginPage;
import lucasgarciam.pageobjects.ProductPage;
import lucasgarciam.utils.BaseTest;

public class eCommerceCheckoutTest extends BaseTest {

    @Test
    public void testCheckoutProcess() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterName("Lucas Garcia");
        loginPage.selectGender("Male");
        loginPage.selectCountry("Brazil");
        loginPage.clickLetsShop();

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("PG 3");
        productPage.addProductToCart("Jordan 6 Rings");
        productPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.verifyFirstCartProduct("PG 3");
        cartPage.verifySecondProduct("Jordan 6 Rings");
        cartPage.openTerms();
        cartPage.closeTerms();
        cartPage.acceptTerms();
        cartPage.completePurchase();
    }
}