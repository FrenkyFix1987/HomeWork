package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends PageGenerator {
    BasePage (WebDriver driver) {
        super(driver);
    }

    public <T> void goToLink(T element, String baseUrl) {
        this.webDriver.get(baseUrl);
        Assert.assertTrue("Page doesn't open", ((WebElement)element).isDisplayed());
    }
}
