package config.driverConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
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
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
