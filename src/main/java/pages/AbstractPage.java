package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by lucky on 12/16/18.
 */
public class AbstractPage {

    protected WebDriver driver;

    public void draft(){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

//    protected WebDriverWait wait;
//
//    public AbstractPage(){
//        this.driver = driver;
//        wait = new WebDriverWait(driver, 15);
//    }

//
//    public <T extends AbstractPage> T ensurePageIsLoaded(String locator, T page){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("TBD")));
//        return page;
//    }

//    protected PlaybuzzMainPage openPlaybuzzMainPage(){
//        open("https://www.playbuzz.com/");
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".intro-section--title")));
//        return new PlaybuzzMainPage();
//    }

}
