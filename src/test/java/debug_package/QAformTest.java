package debug_package;

import Automating_QAForm.pages.script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QAformTest {

    private WebDriver driver;
    private script qaFormPage;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver for Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

        // Initialize the QAFormPage
        qaFormPage = new script(driver);
    }

    @Test
    public void testFormSubmission() {
        // Open the form page
        qaFormPage.openFormPage();

        // Fill out the form
        qaFormPage.enterFirstName("John");
        qaFormPage.enterLastName("Wick");
        qaFormPage.enterEmail("abc@gamil.com");
        qaFormPage.selectGender();
        qaFormPage.enterMobileNumber("91238998721");
        qaFormPage.selectDOB("2003", "July");
        qaFormPage.selectHobby();
        qaFormPage.uploadPicture("C:\\Users\\ritis\\OneDrive\\Pictures\\bhaago.PNG");
        qaFormPage.enterAddress("Punjaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab, Amritsarrrrrrrrrrrrrrrrrrrrrrr, 143001");
        qaFormPage.selectState("Haryana");
        qaFormPage.selectCity("Panipat");

        // Submit the form
        qaFormPage.submitForm();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after tests
        if (driver != null) {
            driver.quit();
        }
    }
}
