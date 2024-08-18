package Automating_example.com.Test;

import Automating_example.com.pages.script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test_script {

    private WebDriver driver;
    private script examplePage;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver for Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://example.com");

        // Initialize the ExamplePage
        examplePage = new script(driver);
    }

    @Test
    public void testNavigation() {
        try {
            examplePage.clickMoreInfo();
            examplePage.waitForTitleContains("Example Domains");

            examplePage.clickDomains();
            examplePage.clickDomainsSideLink();

            examplePage.navigateBack();
            Thread.sleep(1000);
            examplePage.navigateBack();
            Thread.sleep(1000);

            examplePage.clickNumbers();
            Thread.sleep(1000);
            examplePage.clickNumbersSideLink();

            examplePage.navigateBack();
            Thread.sleep(1000);
            examplePage.navigateBack();
            Thread.sleep(1000);

            examplePage.clickAbout();
            Thread.sleep(1000);
            examplePage.clickAboutSideLink();

            examplePage.navigateBack();
            Thread.sleep(1000);
            examplePage.navigateBack();
            Thread.sleep(1000);

            examplePage.clickProtocols();
            Thread.sleep(3000);
            examplePage.clickProtocolsSideLink();

            examplePage.navigateBack();
            Thread.sleep(1000);
            examplePage.navigateBack();
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
        System.out.println("Test completed successfully.");
    }
}

