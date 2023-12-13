package StepDefinition;

import Pages.Locators;
import Utility.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartSteps {
    Locators locators = new Locators();

    @Then("Shopping cart successfully cleared")
    public void shoppingCartSuccessfullyCleared() {
        locators.verifyContainsTextFunction(locators.cartKont, "Your Shopping Cart is empty!");
    }

    @And("Go to desktop category")
    public void goToDesktopCategory() {
        new Actions(GWD.getDriver()).moveToElement(locators.computers).build().perform();
        new Actions(GWD.getDriver()).moveToElement(locators.desktop).click().build().perform();
    }

    @And("Configure desktop")
    public void configureDesktop() {
        locators.clickElementFunc(locators.fast);
        locators.clickElementFunc(locators.ram);
        locators.clickElementFunc(locators.hdd);
        locators.clickElementFunc(locators.software);
    }

    @Then("Successfully added to cart")
    public void successfullyAddedToCart() {
        locators.verifyContainsTextFunction(locators.gKont, "The product has been added");
    }

    @And("Customize sneakers")
    public void customizeSneakers() {
        Select sizeNo = new Select(locators.sizeNo);
        sizeNo.selectByValue("26");
        locators.clickElementFunc(locators.color);
    }

    @And("Customize jewelry")
    public void customizeJewelry() {
        Select material = new Select(locators.material);
        material.selectByValue("46");
        locators.sendKeyFunc(locators.length, "6");
        locators.clickElementFunc(locators.star);
    }

    @And("Go to notebooks category")
    public void goToNotebooksCategory() {
        new Actions(GWD.getDriver()).moveToElement(locators.computers).build().perform();
        new Actions(GWD.getDriver()).moveToElement(locators.notebooks).click().build().perform();
    }

    @Then("Comparison list cleaned")
    public void comparisonListCleaned() {
        locators.verifyContainsTextFunction(locators.clearCont, "You have no items to compare.");
    }

}
