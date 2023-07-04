package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    public static WebDriver driver;
    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyDetailCO;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement verifyTotalCO;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement finalCO;

    public void setFirstName(String name1){
        firstName.sendKeys(name1);
    }

    public void setLastName(String name2){
        lastName.sendKeys(name2);
    }

    public void setPostalCode(String postcode){
        postalCode.sendKeys(postcode);
    }

    public void clickContinue(){
        continueButton.click();
    }

    public boolean showDetailCO(){
        return verifyDetailCO.isDisplayed();
    }

    public boolean showTotalCO(){
        return verifyTotalCO.isDisplayed();
    }

    public void finishCO(){
        finishButton.click();
    }

    public void finalCOPage(){
        finalCO.isDisplayed();
    }
}
