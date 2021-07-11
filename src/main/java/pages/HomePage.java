package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.LINK_TEXT, using = "http://automationpractice.com/index.php?controller=my-account")
    private WebElement signInBtn;

    public void openRegistrationPage() {
        goToLink(signInBtn, "http://automationpractice.com/index.php");
    }

}
