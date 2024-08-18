package Automating_example.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class script {

    private WebDriver driver;

    // Define the elements on the page
    private By moreInfoLink = By.linkText("More information...");
    private By domainsLink = By.linkText("Domains");
    private By domainsSideLink = By.linkText("Root Zone Management");
    private By numbersLink = By.linkText("Numbers");
    private By numbersSideLink = By.linkText("RIR Allocation Data");
    private By aboutLink = By.linkText("About");
    private By aboutSideLink = By.linkText("Reviews");
    private By protocolsLink = By.linkText("Protocols");
    private By protocolsSideLink = By.id("nav_prot_performance");

    public script(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Define methods to interact with the elements
    public void clickMoreInfo() {
        driver.findElement(moreInfoLink).click();
    }

    public void clickDomains() {
        driver.findElement(domainsLink).click();
    }

    public void clickDomainsSideLink() {
        driver.findElement(domainsSideLink).click();
    }

    public void clickNumbers() {
        driver.findElement(numbersLink).click();
    }

    public void clickNumbersSideLink() {
        driver.findElement(numbersSideLink).click();
    }

    public void clickAbout() {
        driver.findElement(aboutLink).click();
    }

    public void clickAboutSideLink() {
        driver.findElement(aboutSideLink).click();
    }

    public void clickProtocols() {
        driver.findElement(protocolsLink).click();
    }

    public void clickProtocolsSideLink() {
        driver.findElement(protocolsSideLink).click();
    }

    public void waitForTitleContains(String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public void navigateBack() {
        driver.navigate().back();
    }
}
