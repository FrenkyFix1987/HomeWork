package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.CLASS_NAME, using = "login")
    private WebElement signInBtn;

    public RegistrationPage openRegistrationPage() {
        goToLink(signInBtn, "http://automationpractice.com/index.php");
        signInBtn.click();
        return PageFactory.initElements(webDriver, RegistrationPage.class);
    }

}
