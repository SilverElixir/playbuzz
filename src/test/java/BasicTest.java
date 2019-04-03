import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.PlaybuzzMainPage;

import static com.codeborne.selenide.Selenide.open;


public class BasicTest {

//    protected static WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setUp(@Optional("chrome") String browser){
//        Configuration.browser = "firefox";
        Configuration.browser = "chrome";
//        driver = DriverFactory.getWebDriverInstance(browser); - to update with different tests
    }

    @AfterTest
    public void tearDown(){
//        driver.quit();
    }

    public PlaybuzzMainPage openPlaybuzzMainPage() throws InterruptedException {
        open("https://www.playbuzz.com/");
        return new PlaybuzzMainPage().fullyLoaded();
    }
}
