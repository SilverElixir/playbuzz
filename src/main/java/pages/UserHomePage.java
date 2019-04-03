package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.features.Feature;
import pages.features.FeatureAbstractPage;
import pages.features.NewStoryFeaturePage;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static com.codeborne.selenide.Selenide.$;

/**
 * Starting page, that appears once after user has successfully logged in
 * "What’s your story?"
 */
public class UserHomePage extends AbstractPage {

    SelenideElement welcomePageLoaded = $(".featured"),
    newStory = $(Feature.NEW_STORY.getLocator());


    public FeatureAbstractPage chooseAppropriateFeature(Feature myFeature){
        FeatureAbstractPage feature;

        switch(myFeature) {
            case NEW_STORY:
                newStory.click();
                feature = new NewStoryFeaturePage();
                break;
            case PERSONALITY_QUIZ:
                throw new NotImplementedException();
            case POLL:
                throw new NotImplementedException();
            case FLIP_CARD:
                throw new NotImplementedException();
                // TBD - specify all the rest features
            default:
                return new NewStoryFeaturePage();
        }
         return feature;
    }

    public UserHomePage fullyLoaded(){
        welcomePageLoaded.shouldBe(Condition.visible);
        return this;
    }

}
