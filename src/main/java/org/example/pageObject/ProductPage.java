package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    public static WebDriver driver;
    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectFilter;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement btn1product;

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement btn2product;

    @FindBy(xpath = "//a[.='2']")
    private WebElement cartbtn;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement cartPage;

    public void selectProductFilter(String sort){
        Select a = new Select(selectFilter);
        a.selectByVisibleText(sort);
    }

    public void chooseFirstProduct(){
        btn1product.click();
    }

    public void chooseSecondProduct(){
        btn2product.click();
    }

    public void clickCart(){
        cartbtn.click();
    }

    public boolean verifyCartPage(){
        return cartPage.isDisplayed();
    }
}
