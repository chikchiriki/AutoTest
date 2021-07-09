package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSettings {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Влад\\IdeaProjects\\Test\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();//открытие полноразмаерного окна браузера

        wait = new WebDriverWait(driver,10); //ожидание появления элемента  10 сек
    }
    @AfterTest
    public void Close() {

       //driver.quit();

    }
}
