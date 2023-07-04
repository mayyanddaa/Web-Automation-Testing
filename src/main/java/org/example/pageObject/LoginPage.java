package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyDashboard;

    @FindBy(xpath = "//h3")
    private WebElement textError;

    public void setUserName(String username){
        userName.sendKeys(username);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public boolean verifyLoginPage(){
        return userName.isDisplayed();
    }

    public boolean verifyDBoard(){
        return verifyDashboard.isDisplayed();
    }

    public String errorText(){
        return textError.getText();
    }
}
