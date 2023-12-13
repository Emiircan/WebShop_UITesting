package StepDefinition;

import Pages.Locators;
import Utility.ExcelUtility;
import Utility.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginSteps {
    Locators locators = new Locators();

    @Given("Navigate to web shop page")
    public void navigateToWebShopPage() {
        GWD.getDriver().get("https://demowebshop.tricentis.com");
    }

    @And("Get User information from Excel")
    public void getUserInformationFromExcel(DataTable items) {
        List<List<String>> text = items.asLists(String.class);

        for (int i = 0; i < text.size(); i++) {
            WebElement element = locators.getWebElement(text.get(i).get(0));
            locators.sendKeyFunc(element,ExcelUtility.getData(text.get(i).get(1)));
        }
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        locators.verifyContainsTextFunction(locators.logout, "Log out");
    }

    @Then("User shouldn't login successfully")
    public void userShouldnTLoginSuccessfully() {
        locators.verifyContainsTextFunction(locators.unLogin, "Login was unsuccessful.");
    }

}
