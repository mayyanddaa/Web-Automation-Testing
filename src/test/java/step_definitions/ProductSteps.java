package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {
    public WebDriver webDriver;
    public ProductSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User sort product list by {string}")
    public void selectProductSort(String sort){
        ProductPage productPage = new ProductPage(webDriver);
        productPage.selectProductFilter(sort);
    }

    @Then("User add products to cart")
    public void addToCart(){
        ProductPage productPage = new ProductPage(webDriver);
        productPage.chooseFirstProduct();
        productPage.chooseSecondProduct();
    }

    @When("User click cart button")
    public void clickCart(){
        ProductPage productPage = new ProductPage(webDriver);
        productPage.clickCart();
    }

    @Then("User already on cart page")
    public void verifyYourCart(){
        ProductPage productPage = new ProductPage(webDriver);
        Assert.assertTrue(productPage.verifyCartPage());
    }
}
