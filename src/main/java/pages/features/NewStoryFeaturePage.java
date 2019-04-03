package pages.features;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.features.sections.FlipCardSection;
import pages.features.sections.SectionAbstractPage;
import pages.features.sections.SectionContainer;
import pages.providers.MediaProvider;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static com.codeborne.selenide.Selenide.$;

public class NewStoryFeaturePage extends FeatureAbstractPage {

    private SelenideElement
            addSectionContainer = $(".add-section-buttons-container"),
            flipCard = $(SectionContainer.FLIP_CARD_SECTION.getLocator());

    public SectionAbstractPage addCertainSection(SectionContainer section){
        SectionAbstractPage sectionPage;

        switch(section) {
            case FLIP_CARD_SECTION:
                flipCard.click();
                sectionPage = new FlipCardSection();
                break;
            case TEXT:
                throw new NotImplementedException();
            case MEDIA:
                throw new NotImplementedException();
            case QUOTE:
                throw new NotImplementedException();
                // TBD - specify all the rest features
            default:
                throw new NotImplementedException();
        }
        return sectionPage;
    }

    public NewStoryFeaturePage fullyLoaded(){
        addSectionContainer.shouldBe(Condition.visible);
        return this;
    }
}
