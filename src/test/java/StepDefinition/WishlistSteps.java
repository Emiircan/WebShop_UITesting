package StepDefinition;

import Pages.Locators;
import Utility.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class WishlistSteps {
    Locators locators = new Locators();

    @When("Go to mobile phone category")
    public void goToMobilePhoneCategory() {
        new Actions(GWD.getDriver()).moveToElement(locators.electronicHov).build().perform();
        new Actions(GWD.getDriver()).moveToElement(locators.cellPhone).click().build().perform();
    }

    @And("Add to wishlist")
    public void addToWishlist() {
        locators.clickElementFunc(locators.addWish);
    }

    @Then("Successfully added to  wishlist")
    public void successfullyAddedToWishlist() {
        locators.verifyContainsTextFunction(locators.gKont, "The product has been added");
    }

    @Then("Clear wishlist")
    public void clearWishlist() {
        locators.clickElementFunc(locators.wishlist);
        locators.clickElementFunc(locators.removeBox);
        locators.clickElementFunc(locators.upWishlist);
        locators.verifyContainsTextFunction(locators.wishlistKont, "The wishlist is empty!");
    }

    @Then("Update wishlist to cart")
    public void updateWishlistToCart() {
        locators.clickElementFunc(locators.addCartBox);
        locators.clickElementFunc(locators.addToCart);
    }

    @And("Select country")
    public void selectCountry() {
        Select country = new Select(locators.county);
        country.selectByValue("68");

    }

    @Then("Select Country")
    public void SelectCountry() {
        Select country = new Select(locators.aCountry);
        country.selectByValue("68");
    }

    @Then("Make payment transaction")
    public void makePaymentTransaction() {
     locators.clickElementFunc(locators.billingSave);
     locators.clickElementFunc(locators.shippingSave);
     locators.clickElementFunc(locators.shipSave);
     locators.clickElementFunc(locators.paySave);
     locators.clickElementFunc(locators.paymentSave);
     locators.clickElementFunc(locators.confirmSave);
    }

    @Then("Order placed successfully")
    public void orderPlacedSuccessfully() {
        locators.verifyContainsTextFunction(locators.saveKont,"Your order has been successfully processed!");
    }
}
