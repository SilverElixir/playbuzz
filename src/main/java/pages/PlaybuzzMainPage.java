package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PlaybuzzMainPage extends AbstractPage {

    SelenideElement loginBtn = $("#pb-navbar-login-btn"),
            playbuzzPageLoaded = $(".navbar-collapse");
//            playbuzzPageLoaded = $(".intro-section--title");

    public LoginPage goToLoginPage(){
        loginBtn.click();
        return new LoginPage().fullyLoaded();
    }

    public PlaybuzzMainPage fullyLoaded() throws InterruptedException {
        playbuzzPageLoaded.shouldBe(Condition.visible);
        return this;
    }

}
