package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class Tests extends DriverSettings {

    @Test
    public void SignUp() {
        //тестирование тест-кейса №2
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.Open();
        homePage.Start();

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

        signUpPage.SignUp("bazhukova.as");

        signUpPage.CheckErrors();

        String ErrorNow = signUpPage.GetErrors();
        Assert.assertEquals(ErrorNow, "Invalid email address.");

        signUpPage.SignUp("@mail.ru");

        signUpPage.CheckErrors();

        String ErrorNow2 = signUpPage.GetErrors();
        Assert.assertEquals(ErrorNow2, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test
   public void Registration() {
        //тестирование тест-кейса №3
       HomePage homePage = PageFactory.initElements(driver, HomePage.class);

       homePage.Open();
       homePage.Start();

       SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

       Random random = new Random();

       int r = random.nextInt(100) + 1;

       String email = "bazhukova.as" + r + "@mai.ru";

       signUpPage.SignUp(email);

        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);

        registrationPage.CreationForm();

        registrationPage.FillPassword("12345");

        registrationPage.FillState();

        registrationPage.FillPostcode("00000");

        registrationPage.FillFirstName(" ");

        registrationPage.FillLastname(" ");

        registrationPage.FillCompany(" ");

        registrationPage.FillAddress(" ");

        registrationPage.FillCity(" ");

        registrationPage.FillPhone(" ");

        registrationPage.FillPassword(" ");

        registrationPage.Registr();

        registrationPage.MyAccount();
    }

}
