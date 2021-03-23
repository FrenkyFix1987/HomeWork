package config.driverConfig;
import enums.EDriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverM {
    private static WebDriver driver;
    private static EDriverType type;
    private static DesiredCapabilities cabs;

    public WebDriver getDriver(){
        if (driver == null) {
            driver = this.createDriver();
        }
        return driver;
    }

    private WebDriver createDriver(){
        driver = this.createRemoteDriver();
        return driver;
    }

    private WebDriver createRemoteDriver() {
        switch (type) {
            case CHROME:
                cabs = DesiredCapabilities.chrome();
                cabs.setBrowserName("chrome");
                break;
            case FIREFOX:
                cabs = DesiredCapabilities.firefox();
                cabs.setBrowserName("firefox");
                break;
        }
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cabs);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
