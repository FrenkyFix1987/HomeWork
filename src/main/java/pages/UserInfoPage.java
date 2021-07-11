package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserInfoPage extends BasePage{
    UserInfoPage(WebDriver driver) {
        super(driver);
    }

    private String title = "Your personal information";

    @FindBy(how= How.CLASS_NAME, using = "page-heading")
    private WebElement titleUI;

    @FindBy(how= How.ID, using = "uniform-id_gender1")
    private WebElement mrRb;

    @FindBy(how= How.ID, using = "customer_firstname")
    private WebElement customerFirstnameFiled;

    @FindBy(how= How.ID, using = "customer_lastname")
    private WebElement customerLastnameField;

    @FindBy(how= How.ID, using = "passwd")
    private WebElement passwdField;

    @FindBy(how= How.ID, using = "days")
    private WebElement daysList;

    @FindBy(how= How.ID, using = "months")
    private WebElement monthsList;

    @FindBy(how= How.ID, using = "years")
    private WebElement yearsList;


    public void fillOutTheRegistrationForm() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-id_gender1")));
        Assert.assertTrue("It was not a registration form", titleUI.getText().contains(title));
        mrRb.click();
        writeDataToExistingField(customerFirstnameFiled, users.getFirstName());
        writeDataToExistingField(customerLastnameField, users.getLastName());
        writeDataToExistingField(passwdField, users.getPassword());
        selectFromDropDownByValue(daysList, users.getDate());
        selectFromDropDownByValue(monthsList, users.getMonth());
        selectFromDropDownByValue(yearsList, users.getYear());
    }
}
