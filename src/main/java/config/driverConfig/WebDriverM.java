package config.driverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverM {
    private static WebDriver driver;

    public WebDriver getDriver(){
        if (driver == null) {
            driver = this.createDriver();
        }
        return driver;
    }

    private WebDriver createDriver(){
        driver = this.createLocalDriver();
        return driver;
    }

    private WebDriver createLocalDriver() {
        System.setProperty("webdriver.chrome.driver", "/HomeWork/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
