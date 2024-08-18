package Automating_example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class script {
    public static void main(String[] args) {

        // Setup WebDriver for Firefox
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Navigate to example website
        driver.get("https://example.com");

        try {

            // Interact with elements using Firefox
            WebElement moreInfoLink = driver.findElement(By.linkText("More information..."));
            moreInfoLink.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.titleContains("Example Domains"));

            WebElement domainsLink = driver.findElement(By.linkText("Domains"));
            domainsLink.click();

            WebElement domainsSideLink = driver.findElement(By.linkText("Root Zone Management"));
            domainsSideLink.click();

            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);


            WebElement numbersLink = driver.findElement(By.linkText("Numbers"));
            numbersLink.click();
            Thread.sleep(1000);
            WebElement numbersSideLink = driver.findElement(By.linkText("RIR Allocation Data"));
            numbersSideLink.click();

            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);

            WebElement aboutLink = driver.findElement(By.linkText("About"));
            aboutLink.click();
            Thread.sleep(1000);
            WebElement aboutSideLink = driver.findElement(By.linkText("Reviews"));
            aboutSideLink.click();

            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);

            WebElement protocolsLink = driver.findElement(By.linkText("Protocols"));
            protocolsLink.click();
            Thread.sleep(3000);
            WebElement protocolsSideLink = driver.findElement(By.id("nav_prot_performance"));
            protocolsSideLink.click();

            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);


        }catch (Exception e){
            e.printStackTrace();
            driver.quit();
        }finally {
            driver.quit();
            System.out.println("hehe");
        }

    }
}
