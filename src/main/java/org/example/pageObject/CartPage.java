package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement remove1Product;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement coButton;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCOpage;

    public void removeProduct(){
        remove1Product.click();
    }

    public void CheckOut(){
        coButton.click();
    }

    public void verifyCOPage(){
        verifyCOpage.isDisplayed();
    }
}
