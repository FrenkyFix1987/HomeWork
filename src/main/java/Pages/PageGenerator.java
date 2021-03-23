package Pages;

import config.driverConfig.WebDriverM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PageGenerator extends WebDriverM {
    public WebDriver webDriver;

    public PageGenerator(WebDriver driver){
        this.webDriver = driver;
    }

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> pageClass){
        return PageFactory.initElements(this.webDriver, pageClass);
    }
}
