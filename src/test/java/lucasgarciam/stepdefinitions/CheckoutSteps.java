package lucasgarciam.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import lucasgarciam.utils.pages.*;
import lucasgarciam.utils.utils.BaseTest;

public class CheckoutSteps extends BaseTest {

    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;

    @Before
    public void setup() throws Exception {
        ConfigureAppium();
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage = new LoginPage(driver);
    }

    @When("the user enters the name {string}")
    public void the_user_enters_the_name(String name) {
        loginPage.enterName(name);
    }

    @When("the user selects gender {string}")
    public void the_user_selects_gender(String gender) {
        loginPage.selectGender(gender);
    }

    @When("the user selects country {string}")
    public void the_user_selects_country(String country) {
        loginPage.selectCountry(country);
    }

    @When("the user clicks on Let's Shop")
    public void the_user_clicks_on_lets_shop() {
        loginPage.clickLetsShop();
    }

    @When("the user adds {string} to the cart")
    public void the_user_adds_product_to_cart(String productName) {
        productPage = new ProductPage(driver);
        productPage.addProductToCart(productName);
    }

    @When("the user goes to the cart")
    public void the_user_goes_to_the_cart() {
        productPage.goToCart();
        cartPage = new CartPage(driver);
    }

    @Then("the user should see the first product {string} in the cart")
    public void the_user_should_see_first_product_in_the_cart(String productName) {
        cartPage.verifyFirstProduct(productName);
    }

    @Then("the user should see the second product {string} in the cart")
    public void the_user_should_see_second_product_in_the_cart(String productName) {
        cartPage.verifySecondProduct(productName);
    }

    @When("the user agrees to the terms and completes the purchase")
    public void the_user_agrees_to_the_terms_and_completes_the_purchase() {
        cartPage.openTerms();
        cartPage.closeTerms();
        cartPage.acceptTerms();
        cartPage.completePurchase();
    }

    @Then("the purchase should be completed successfully")
    public void the_purchase_should_be_completed_successfully() {
    }
}