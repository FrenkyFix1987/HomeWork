package ui.steps;

import cucumber.api.java.en.Given;
import pages.HomePage;
import pages.PageGenerator;
import config.driverConfig.WebDriverM;

public class BaseStep{
    WebDriverM webDriverM = new WebDriverM();
    PageGenerator pageGenerator;

    public BaseStep() {
        this.pageGenerator = new PageGenerator(this.webDriverM.getDriver());
    }

    @Given("^User opens home page and create new account$")
    public void openHomePage(){
        pageGenerator.GetInstance(HomePage.class)
                .openRegistrationPage()
                .createNewAccount();
//                .fillOutTheRegistrationForm();
    }
}
