package debug_package;

import Automating_Wikipedia.pages.script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class wikipediaTest {

        private WebDriver driver;
        private script wikipediaPage;

        @BeforeClass
        public void setUp() {
            // Setup WebDriver for Firefox
            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();

            // Initialize the WikipediaPage
            wikipediaPage = new script(driver);
        }

        @Test
        public void testWikipediaLanguageLinks() throws InterruptedException {
            // Open Wikipedia homepage
            wikipediaPage.openWikipediaHomePage();

            // Interact with language links
            int languageLinksCount = wikipediaPage.getLanguageLinksCount();
            System.out.println("Number of language links: " + languageLinksCount);

            for (int i = 0; i < languageLinksCount; i++) {
                try {
                    wikipediaPage.clickLanguageLink(i);
                    Thread.sleep(2000);
                    wikipediaPage.navigateBack();
                    wikipediaPage.refreshLanguageLinks();
                } catch (Exception e) {
                    System.out.println("Could not click link or navigate back: " + e.getMessage());
                }
            }
        }

        @Test
        public void testWikipediaSearch() throws InterruptedException {
            // Select a language from the dropdown
            wikipediaPage.selectLanguageFromDropdown("Deutsch");

            // Search for a term
            wikipediaPage.searchForTerm("Selenium WebDriver");
            Thread.sleep(5000);
        }

        @AfterClass
        public void tearDown() {
            // Close the browser after tests
            if (driver != null) {
                driver.quit();
            }
        }
    }

