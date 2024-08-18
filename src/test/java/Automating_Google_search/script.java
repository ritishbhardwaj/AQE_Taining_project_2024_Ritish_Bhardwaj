package Automating_Google_search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class script {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        try {

            driver.get("https://www.google.com");

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));
            WebElement searchBox = driver.findElement(By.className("gLFyf"));
            Thread.sleep(3000);
            searchBox.click();
//            Thread.sleep(5000);
            searchBox.sendKeys("blockch");
            Thread.sleep(3000);
            Actions act =new Actions(driver);
            act.sendKeys(Keys.DOWN).perform();
            Thread.sleep(2000);
            act.sendKeys(Keys.DOWN).perform();
            Thread.sleep(2000);
            act.sendKeys(Keys.DOWN).perform();
            Thread.sleep(2000);
            act.sendKeys(Keys.UP).perform();
            Thread.sleep(2000);
            act.sendKeys(Keys.ENTER).perform();

        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
//            driver.quit();
        }

    }
}
