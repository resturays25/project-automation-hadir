package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.juaracoding.utils.Hooks.driver;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage(driver);


    @Given("User is on login page for login")
    public void user_Is_On_Login_Page_for_login() {
        driver.get("https://magang.dikahadir.com/authentication/login");
    }

    @When("User enters valid email and password for login")
    public void user_Enters_Valid_Email_And_Password_For_Login() {
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
    }


    @And("User clicks login button for login")
    public void user_Clicks_Login_Button_On_Login_Page() {
        loginPage.clickLoginButton();
    }

    @And("User enters invalid email and valid password")
    public void user_enters_invalid_email_and_valid_password() {
        loginPage.enterEmail("invalid@email");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
    }

    @When("User enters email without at sign and valid password")
    public void user_enters_email_without_at_sign_and_valid_password() {
        loginPage.enterEmail("adminhadir.com");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
    }

    @When("User enters valid email and invalid password for login")
    public void user_enters_valid_email_and_invalid_password_for_login() {
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("wrong_password");
        delay(2);
    }

    @When("User enters empty email and valid password for login")
    public void user_enters_empty_email_and_valid_password_for_login() {
        loginPage.enterEmail("");
        delay(1);
        loginPage.enterPassword("admin@hadir");
        delay(2);
    }


    @When("User enters valid email and empty password for login")
    public void user_enters_valid_email_and_empty_password_for_login() {
        loginPage.enterEmail("admin@hadir.com");
        delay(1);
        loginPage.enterPassword("");
        delay(2);
    }

    @When("User enters empty email and empty password for login")
    public void user_enters_empty_email_and_empty_password_for_login() {
        loginPage.enterEmail("");
        delay(1);
        loginPage.enterPassword("");
        delay(2);
    }

    @When("User accesses the dashboard directly without login")
    public void user_accesses_the_dashboard_directly_without_login() {
        driver.get("https://magang.dikahadir.com/dashboards/dashboard");
        delay(2);
    }

    @And("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
        delay(1);
    }

    @Then("User should see an error message for login")
    public void user_should_see_an_error_message_for_login() {
        loginPage.getErrorMessage();
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
