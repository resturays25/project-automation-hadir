package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-5shv7u']")
    private WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"profile-menu\"]/div[3]/ul/div/button[2]")
    private WebElement logoutButton;



    public WebElement getProfileButton() {
        return profileButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }
}
