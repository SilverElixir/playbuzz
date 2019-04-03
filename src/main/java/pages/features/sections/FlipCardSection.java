package pages.features.sections;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.providers.MediaProvider;

import java.time.Instant;
import java.time.LocalDateTime;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FlipCardSection extends SectionAbstractPage {

    // below line might be refactored with Dependency Injection - via Spring Boot, I guess
    MediaProvider mediaProvider = new MediaProvider();

    ElementsCollection buttons = $$(By.xpath("//button[@class='source-button file']"));

    SelenideElement flipCardFrontSide = $("div[ng-click$=\"'front'\"]"),
            flipCardBackSideClickBth = $("div[ng-click$=\"'back'\"]"),
            flipCardBackSideText = $(".source-select-title-back"),
            flipCardTitle = $("div[data-placeholder='Title']"),
            textInputBtn = buttons.get(2),
            textAreaInput = $("textarea#text-editor"),
            mediaInputBtn = buttons.get(1);


    public FlipCardSection setUpFrontSideWithText(){
//        System.out.println("size " + buttons.size());
//        System.out.println(buttons.first().getWrappedElement());
//        System.out.println(buttons.last().getWrappedElement());
        textInputBtn.click();
        textAreaInput.sendKeys(getRandomText("What means 'NARANJA' in Spanish?"));
        return this;
    }

    public FlipCardSection setUpBackSideWithImage(String searchingWord){
        flipCardBackSideClickBth.click();
        flipCardBackSideText.shouldHave(Condition.text("Back Card"));
        flipCardBackSideText.shouldBe(Condition.visible);
//        flipCardBackSide.shouldHave(Condition.text())
        mediaInputBtn.click();
        mediaProvider.selectAndInsertGettyImage(searchingWord);
        return this;
    }

    public FlipCardSection addHeaderWithTitle(){
        flipCardTitle.sendKeys(getRandomText("Flip Card Title _"));
        return this;
    }

    private String getRandomText(String text){
        Instant instant = Instant.now();
        return text + String.valueOf(instant.getEpochSecond());
//        return text + System.currentTimeMillis() % 1000;
    }


    // wait for $$(".media-provider.flip-card-landscape") + inject FlipCardFeature

    // FlipCardFeature > pages.providers.MediaProvider


}
