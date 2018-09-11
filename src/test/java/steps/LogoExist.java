package steps;

import based.StepsBased;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LogoExist extends StepsBased {

    private String HOME_PAGE_URL = "http://boomerang-boardshop.ua";
    private SelenideElement LOGO = $(By.id("//*[@id='masthead']//img[1]"));

    @Given("^Opened Home page$")
    public void openLoginPage() throws Exception {
        getChrome();
        open(HOME_PAGE_URL);
    }

    @Then("^Check if logo exist$")
    public void checkIfUserLogIn() throws Exception {
        LOGO.shouldBe(Condition.visible);
    }

    @Given("^Choice browser$")
    public void choiceBrowser() throws Throwable {
        browser = "firefox";
    }

    @Then("^Print browser$")
    public void printBrowser() throws Throwable {
        System.out.println(browser);
    }
}

