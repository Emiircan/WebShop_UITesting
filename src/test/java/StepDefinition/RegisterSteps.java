package StepDefinition;

import Pages.Locators;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterSteps {
    Locators locators = new Locators();

    @And("Click on the element")
    public void clickOnTheElement(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = locators.getWebElement(strButton);
            locators.clickElementFunc(element);
        }
    }

    @And("User sending the keys in element")
    public void userSendingTheKeysInElement(DataTable items) {
        List<List<String>> text = items.asLists(String.class);

        for (int i = 0; i < text.size(); i++) {
            WebElement element = locators.getWebElement(text.get(i).get(0));
            locators.sendKeyFunc(element, text.get(i).get(1));
        }
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        locators.verifyContainsTextFunction(locators.regRes, "Your registration completed");
    }

    @Then("User shouldn't register successfully")
    public void userShouldnTRegisterSuccessfully() {
        locators.verifyContainsTextFunction(locators.regResnt, "The specified email already exists");
    }
}
