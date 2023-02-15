package StepDefinitions;

import Pages.HepsiburadaPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HepsiburadaSteps {
    WebDriver driver = DriverFactory.getDriver();
    HepsiburadaPages hepsiburadaPages = new HepsiburadaPages(driver);
    @Given("User is on homepage")
    public void userIsOnHomepage() {
        HepsiburadaPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        HepsiburadaPages.acceptCookie();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        HepsiburadaPages.clickSearch();
    }

    @When("Write product name")
    public void writeProductName() {
        HepsiburadaPages.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        HepsiburadaPages.searchButton();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        HepsiburadaPages.firstProduct();
    }

}
