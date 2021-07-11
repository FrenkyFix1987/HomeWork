package ui.steps;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.PageGenerator;
import config.driverConfig.WebDriverM;

public class BaseStep{
    WebDriverM webDriverM = new WebDriverM();
    PageGenerator pageGenerator;

    public BaseStep() {
        this.pageGenerator = new PageGenerator(this.webDriverM.getDriver());
    }

    @Given("User opens home page")
    public void openHomePage(){
        pageGenerator.GetInstance(HomePage.class).openRegistrationPage();
    }
}
