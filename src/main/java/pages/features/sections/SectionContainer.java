package pages.features.sections;

/**
 * Contains all available sections for 'New Story' feature:
 * Text, Media, Quote, Playbuzz Video, Convo, Summary Card, Flip Card, Poll, Personality Quiz, Trivia
 */
public enum SectionContainer {

    TEXT(".add-paragraphsection-btn"),
    MEDIA(".add-mediasection-btn"),
    QUOTE(".add-quotesection-btn"),
    PLAYBUZZ_VIDEO(".add-videocreatorsection-btn"),
    CONVO(".add-convosection-btn"),
    SUMMARY_CARD(".add-summarysection-btn"),
    FLIP_CARD_SECTION(".add-flipcardsection-btn"),
    POLL_SECTION(".add-pollsection-btn"),
    PERSONALITY_QUIZ_SECTION(".add-quizsection-btn"),
    TRIVIA(".add-triviasection-btn");

    private String locator;

    SectionContainer (String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }

}
