package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckOutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutSteps {
    public WebDriver webDriver;
    public CheckOutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as firstName, input {string} as lastName and  input {string} as postalCode")
    public void inputInformation(String name1, String name2, String postCode){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.setFirstName(name1);
        checkOutPage.setLastName(name2);
        checkOutPage.setPostalCode(postCode);
        checkOutPage.clickContinue();
    }

    @Then("User already on detail checkout page")
    public void verifyDetailCO(){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.showDetailCO());
    }

    @And("User check total checkout")
    public void checkTotalCO(){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.showTotalCO());
        checkOutPage.finishCO();
    }

    @And("User already on final checkout page")
    public void verifyFinalCO(){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.finalCOPage();
    }
}
