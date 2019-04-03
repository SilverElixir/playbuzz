package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage extends AbstractPage {

    private SelenideElement
            loginForm = $("#login-form-wrapper"),
            emailInput = $("#elogin_email_field"),
            paswordInput = $("#elogin_pass_field"),
            submitBtn = $("#submitLogin"),
            welcomePageLoaded = $(".featured");
//            forgotPasswordLink = $$(".container a").findBy(Condition.text("Can't remember your password?"));


    public UserHomePage logIntoAsRegisteredUser(String email, String password){
       emailInput.sendKeys(email);
//        driver.findElement(By.id("elogin_email_field")).sendKeys(email);
        paswordInput.sendKeys(password);
//        driver.findElement(By.id("elogin_pass_field")).sendKeys(password);
        submitBtn.click();
//        driver.findElement(By.id("submitLogin")).click();

        System.out.println("WAIT UP HERE");
        return new UserHomePage().fullyLoaded();
    }


    public LoginPage fullyLoaded(){
        loginForm.shouldBe(Condition.visible);
        return this;
    }
}
