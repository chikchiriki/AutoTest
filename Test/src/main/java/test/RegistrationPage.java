package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegistrationPage (WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    @FindBy(id = "SubmitCreate")
    private WebElement submit_create;

    @FindBy(id = "passwd")
    private WebElement passwd;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postcode;

    @FindBy(id = "customer_firstname")
    private WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    private WebElement customer_lastname;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;

    @FindBy(id = "submitAccount")
    private WebElement submitAccount;

    private By creation_form = By.id("account-creation_form");
    private By my_account = By.id("my-account");

    public void SubmitForm(){
        submit_create.click();
    }

    public void CreationForm(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(creation_form));
    }

    public void FillPassword(String password){
        passwd.sendKeys(password);
    }

    public void FillState(){
        Select select = new Select(state);
        select.selectByIndex(6);
    }

    public void FillPostcode(String zip){
        postcode.sendKeys(zip);
    }

    public void FillFirstName(String firstname){
        customer_firstname.sendKeys(firstname);
    }

    public void FillLastname(String lastname){
        customer_lastname.sendKeys(lastname);
    }

    public void FillCompany(String Company){
        company.sendKeys(Company);
    }

    public void FillAddress(String address){
        address1.sendKeys(address);
    }

    public void FillCity(String City){
        city.sendKeys(City);
    }

    public void FillPhone(String phone){
        phone_mobile.sendKeys(phone);
    }


    public void Registr(){
        submitAccount.click();
    }

    public void MyAccount(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(my_account));
    }

}
