package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Getter
@Setter
public class LogoExist {

    private static final String HOME_PAGE_URL = "http://boomerang-boardshop.ua";
    private static final By LOGO = By.xpath("//*[@id='masthead']//img[1]");

    @Given("^Opened Home page$")
    public void openLoginPage() throws Exception {

        open(HOME_PAGE_URL);
    }

    @Then("^Check if logo exist$")
    public void checkIfUserLogIn() throws Exception {

        $(LOGO).exists();
    }
}

