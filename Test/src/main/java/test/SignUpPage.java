package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SignUpPage (WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    @FindBy(id = "email_create")
    private WebElement email_create;

    @FindBy(id = "SubmitCreate")
    private WebElement submit_create;

    private By error = By.id("create_account_error");

    public void FillEmail(String email){
        email_create.sendKeys(email);
    }

    public void SubmitForm(){
        submit_create.click();
    }

    public void CheckErrors(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(error));
    }

    public String GetErrors(){
        WebElement ParentError = driver.findElement(error);
        return ParentError.findElement(By.tagName("li")).getText();
    }

    public void SignUp(String email) {
        this.FillEmail(email);
        this.SubmitForm();
    }

}
