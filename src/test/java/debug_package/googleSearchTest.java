package debug_package;

import Automating_Google_search.pages.script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class googleSearchTest {

    private WebDriver driver;
    private script googleSearchPage;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver for Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

        // Initialize the GoogleSearchPage
        googleSearchPage = new script(driver);
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Open Google homepage
        googleSearchPage.openGoogleHomePage();

        // Enter search text and select the third suggestion
        googleSearchPage.enterSearchText("blockch");
        googleSearchPage.selectThirdSuggestion();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after tests
        if (driver != null) {
            driver.quit();
        }
    }
}

