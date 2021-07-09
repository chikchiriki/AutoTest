package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver,10);

    }
    @FindBy(id = "header")
    private WebElement header;

    private By SignUpButton = By.cssSelector("[href=\"http://automationpractice.com/index.php?controller=my-account\"]");
    private By main = By.id("columns");

    public void Open(){
        driver.get("http://automationpractice.com"); //открытие сайта
    }

    public void Start() {
        header.findElement(SignUpButton).click(); //нажимаем на необходимый элемент
        wait.until(ExpectedConditions.visibilityOfElementLocated(main));
    }
}
