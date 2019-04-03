import org.testng.annotations.Test;
import pages.features.Feature;
import pages.features.NewStoryFeaturePage;
import pages.features.sections.FlipCardSection;
import pages.features.sections.SectionContainer;


public class SmokeFlipcardTest extends BasicTest {

    @Test
    public void testMe() throws InterruptedException {
        openPlaybuzzMainPage()
                .goToLoginPage()
                .logIntoAsRegisteredUser("iyc22749@zwoho.com", "coolguy8")
                .chooseAppropriateFeature(Feature.NEW_STORY)
                .fullyLoaded(new NewStoryFeaturePage())
                .addCertainSection(SectionContainer.FLIP_CARD_SECTION)
                .fullyLoaded(new FlipCardSection())
                .setUpFrontSideWithText()
                .setUpBackSideWithImage("orange fruit")
                .addHeaderWithTitle();

    }

}
