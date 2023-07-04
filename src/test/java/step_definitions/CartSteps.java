package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    public WebDriver webDriver;
    public CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User remove one item product")
    public void remove1Product(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.removeProduct();
    }

    @And("User checkout product")
    public void checkOutProduct(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.CheckOut();
    }

    @Then("User already on checkout page")
    public void verifyCOPage(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.verifyCOPage();
    }
}
