package Automating_Wikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class script {

    private WebDriver driver;

    @FindBy(css = ".central-featured-lang a")
    private List<WebElement> languageLinks;

    @FindBy(id = "searchLanguage")
    private WebElement languageDropdown;

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    public script(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openWikipediaHomePage() {
        driver.get("https://www.wikipedia.org/");
    }

    public int getLanguageLinksCount() {
        return languageLinks.size();
    }

    public void clickLanguageLink(int index) {
        WebElement link = languageLinks.get(index);
        link.click();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void refreshLanguageLinks() {
        languageLinks = driver.findElements(By.cssSelector(".central-featured-lang a"));
    }

    public void selectLanguageFromDropdown(String language) {
        Select selectLanguage = new Select(languageDropdown);
        selectLanguage.selectByVisibleText(language);
    }

    public void searchForTerm(String term) {
        searchInput.sendKeys(term);
        searchInput.sendKeys(Keys.RETURN);
    }
}
