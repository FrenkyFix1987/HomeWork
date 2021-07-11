package pages;
import objects.Users;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BasePage extends PageGenerator {
    Users users = new Users();
    BasePage (WebDriver driver) {
        super(driver);
    }

    public <T> void goToLink(T element, String baseUrl) {
        this.webDriver.get(baseUrl);
        Assert.assertTrue("Page doesn't open", ((WebElement)element).isDisplayed());
    }

    public <T> void writeDataToExistingField(T element, String userName) {
        Assert.assertTrue("The email address field is enabled", ((WebElement)element).isEnabled());
        ((WebElement)element).sendKeys(userName);
    }

    public <T> void selectFromDropDownByValue(T element, String value) {
        Select dropDown = new Select((WebElement) element);
        dropDown.selectByValue(value);
    }
}
