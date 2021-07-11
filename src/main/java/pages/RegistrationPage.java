package pages;

import objects.Users;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
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

    @FindBy(how= How.ID, using = "email_create")
    private WebElement emailCreateInp;

    @FindBy(how= How.ID, using = "SubmitCreate")
    private WebElement submitCreateBtn;

    public void createNewAccount() {
        writeDataToExistingField(emailCreateInp, users.getUserName());
        submitCreateBtn.click();
        WebDriverWait wait = new WebDriverWait(webDriver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-id_gender1")));
        mrRb.click();
        writeDataToExistingField(customerFirstnameFiled, users.getFirstName());
        writeDataToExistingField(customerLastnameField, users.getLastName());
        writeDataToExistingField(passwdField, users.getPassword());
        selectFromDropDownByValue(daysList, users.getDate());
        selectFromDropDownByValue(monthsList, users.getMonth());
        selectFromDropDownByValue(yearsList, users.getYear());
    }
}
