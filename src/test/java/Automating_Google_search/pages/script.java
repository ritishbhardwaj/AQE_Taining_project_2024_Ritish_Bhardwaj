package Automating_Google_search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class script {

    private WebDriver driver;
    private Actions actions;

    @FindBy(className = "gLFyf")
    private WebElement searchBox;

    public script(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void openGoogleHomePage() {
        driver.get("https://www.google.com");
    }

    public void enterSearchText(String text) {
        searchBox.click();
        searchBox.sendKeys(text);
    }

    public void selectThirdSuggestion() throws InterruptedException {
        Thread.sleep(3000);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
    }
}
