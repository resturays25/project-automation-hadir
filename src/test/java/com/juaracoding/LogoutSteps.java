package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LogoutPage;
import com.juaracoding.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogoutSteps {

    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private LogoutPage logoutPage = new LogoutPage(driver);

    @Given("User is on login page for logout")
    public void user_Is_On_Login_Page_for_logout() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("User enters valid email and password for logout")
    public void user_enters_valid_email_and_password_for_logout() {
        loginPage.enterEmail("admin@hadir.com");
        loginPage.enterPassword("admin@hadir");
    }

    @And("User clicks login button for logout")
    public void user_clicks_login_button_for_logout() {
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to dashboard")
    public void user_should_be_redirected_to_dashboard() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "User is not redirected to dashboard");
        delay(1);
    }

    @When("User clicks the profile button on the dashboard")
    public void user_clicks_the_profile_button_on_the_dashboard() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutPage.getProfileButton())).click();
        delay(2);
    }

    @And("User clicks logout button")
    public void user_clicks_logout_button() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutPage.getLogoutButton())).click();
        delay(1);
    }

    @Then("User should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("login"));
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "User is not redirected to the login page");
        delay(1);
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

