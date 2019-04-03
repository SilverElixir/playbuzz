package pages.features;

public enum Feature {
    NEW_STORY(".feature[href$='_new']"),
    PERSONALITY_QUIZ(".feature[href$='_quiz']"),
    POLL(".feature[href$='_poll']"),
    FLIP_CARD(".feature[href$='_flipCard']"),
    LIST(".feature[href$='_list']"),
    TRIVIA(".feature[href$='_trivia']"),
    VIDEO(".feature[href$='_videoCreator']"),
    RANKED_LIST(".feature[href$='_randkedList']"),
    CONVO(".feature[href$='_convo']");

    private String locator;

    Feature(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }

}