package pages.features;

import com.codeborne.selenide.Condition;
import pages.LoginPage;

/**
 * Just a blueprint page for all existing features
 */
public class FeatureAbstractPage {

    public <T extends FeatureAbstractPage> T fullyLoaded(T page){
        return page;
    }
}
