package pages.features.sections;


import pages.features.FeatureAbstractPage;

public class SectionAbstractPage {

    public <T extends SectionAbstractPage> T fullyLoaded(T page){
        return page;
    }
}
