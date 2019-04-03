package pages.providers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MediaProvider {

    SelenideElement mediaPopUpLoaded = $(".modal-content"),
    gettyImageSearchField = $(".search-bar"),
    searchBtn = $(".search-button"),
    imageContainerLoaded = $(".getty-results"),
    selectedImageUploaded = $("div[ng-if~=\"'uploading'\"]");

    ElementsCollection gettyImages = $$(".justified-layout-item");

    /** General methods */

    public MediaProvider selectAndInsertGettyImage(String wordToSearch){
        addGettyImagesBySearch(wordToSearch)
                .waitForGettyImageToLoad()
                .getOneRandomOf30GettyImages()
                .waitForSelectedImageToLoad();
        return this;
    }

    public MediaProvider fullyLoaded(){
        mediaPopUpLoaded.shouldBe(Condition.visible);
        return this;
    }

    /** Helper methods, to be used only inside of MediaProvider */

    private MediaProvider addGettyImagesBySearch(String wordToSearch){
        gettyImageSearchField.sendKeys(wordToSearch);
        searchBtn.click();
        return this;
    }

    private MediaProvider waitForGettyImageToLoad(){
        imageContainerLoaded.shouldBe(Condition.visible);
        return this;
    }

    private MediaProvider getOneRandomOf30GettyImages(){
        gettyImages.get(new Random().nextInt(30) + 1).click();
//        driver.findElement(By.cssSelector(".justified-layout-item:nth-child(7)")).click();
        return this;
    }

    private void waitForSelectedImageToLoad(){
        selectedImageUploaded.shouldNotBe(Condition.visible);
    }

    public void insertMedia(){
//        $$("button.file[ng-if]")
    }

    public void insertText(){
        //     click on -   $$("button.text-card")
        // sendKeys - $$(".text-area-container > textarea")
    }


    public void waitUntilSelectedImageToUpload(){
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(By.cssSelector("div[ng-if~=\"'uploading'\"]"))));

//        $$("div[ng-if~=\"'uploading'\"]")
    }






}
