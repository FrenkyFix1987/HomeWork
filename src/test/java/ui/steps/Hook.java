package ui.steps;

import config.driverConfig.WebDriverM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

public class Hook {

    WebDriverM webDriverM;

    @After
    public void afterScenario(Scenario scenario) {

    }

}
