package Automating_QAForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class script{
    public static void main(String[] args) {
        System.out.println("hello world");
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();

        try {
            // Open Google
            driver.get("https://demoqa.com/automation-practice-form");
            System.out.println("Title: " + driver.getTitle());

            Actions builder = new Actions(driver);
            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys("John");

            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys("Wick");

            WebElement mail = driver.findElement(By.id("userEmail"));
            mail.sendKeys("abc@gamil.com");

            WebElement gender = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
            gender.click();


            WebElement mobile = driver.findElement(By.id("userNumber"));
            mobile.sendKeys("91238998721");

            WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
            dob.click();
            WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
            Select yearSelect = new Select(yearDropdown);
            yearSelect.selectByVisibleText("2003");

            WebElement monthDropdown =driver.findElement(By.className("react-datepicker__month-select"));
            Select month = new Select(monthDropdown);
            month.selectByVisibleText("July");

            WebElement dateSelect =driver.findElement(By.cssSelector(".react-datepicker__day--016"));
            dateSelect.click();

//            WebElement subselect = driver.findElement(By.cssSelector(".subjects-auto-complete__placeholder"));
//            subselect.click();
//            subselect.sendKeys("s");
//            subselect.sendKeys(Keys.RETURN);

            WebElement hobby = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
            hobby.click();

            driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\ritis\\OneDrive\\Pictures\\bhaago.PNG");
//            WebElement addFile = driver.findElement(By.id("uploadPicture"));
//            addFile.click();

            WebElement Address = driver.findElement(By.id("currentAddress"));
            Address.sendKeys("Punjaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab, Amritsarrrrrrrrrrrrrrrrrrrrrrr, 143001");

            WebElement state = driver.findElement(By.id("react-select-3-input"));
            state.sendKeys("Haryana");
            state.sendKeys(Keys.ENTER);
//            state.click();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-select__menu")));


            WebElement city = driver.findElement(By.id("react-select-4-input"));
            city.sendKeys("Panipat");
            city.sendKeys(Keys.ENTER);

            // Locate the desired option within the dropdown menu
            driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);

            // Print the text to ensure it's the correct element
//            System.out.println("Selecting state: " + selectState.getText());
//
//            // Click the option
//            selectState.click();
//
//            WebElement selectstate = driver.findElement(By.className("react-select-3-option-2"));
//            selectstate.click();



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//             Close the browser
//            driver.quit();
        }
    }
}
