package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Getter
@Setter
public class LogIn {

    public String LOG_IN_PAGE_URL = "http://boomerang-boardshop.ua/my-account/";
    public SelenideElement USER_NAME_INPUT = $(By.id("username"));
    public SelenideElement USER_PASS_INPUT = $(By.id("password"));
    public SelenideElement AUTHORIZATION_BUTTON = $(By.xpath("(//*[@id='login']//input)[3]"));
    public SelenideElement USER = $(By.xpath("//*[@id='post-8']//strong"));

    @Given("^Opened login page$")
    public void openLoginPage() throws Exception {
        browser = "chrome";
        open(LOG_IN_PAGE_URL);
    }

    @When("^Set username like:(.*)$")
    public void fillUsernameLike(final String userName) throws Exception {
        USER_NAME_INPUT.sendKeys(userName);
    }

    @When("^Set password like:(.*)$")
    public void fillPasswordLike(final String userPass) throws Exception {
        USER_PASS_INPUT.sendKeys(userPass);
    }


    @When("^Do log in$")
    public void logIn() {
        AUTHORIZATION_BUTTON.click();
    }

    @Then("^Check if user like: \"([^\"]*)\" authorized$")
    public void checkIfUserLogIn(final String user) throws Exception {
        USER.shouldHave(Condition.text(user));
    }
}
