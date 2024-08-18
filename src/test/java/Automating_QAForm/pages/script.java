
package Automating_QAForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class script {

    private WebDriver driver;
    private Actions actions;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(css = "label[for='gender-radio-2']")
    private WebElement gender;

    @FindBy(id = "userNumber")
    private WebElement mobile;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dob;

    @FindBy(className = "react-datepicker__year-select")
    private WebElement yearDropdown;

    @FindBy(className = "react-datepicker__month-select")
    private WebElement monthDropdown;

    @FindBy(css = ".react-datepicker__day--016")
    private WebElement dateSelect;

    @FindBy(css = "label[for='hobbies-checkbox-3']")
    private WebElement hobby;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    private WebElement address;

    @FindBy(id = "react-select-3-input")
    private WebElement state;

    @FindBy(id = "react-select-4-input")
    private WebElement city;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public script(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void openFormPage() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public void enterFirstName(String firstNameText) {
        firstName.sendKeys(firstNameText);
    }

    public void enterLastName(String lastNameText) {
        lastName.sendKeys(lastNameText);
    }

    public void enterEmail(String emailText) {
        email.sendKeys(emailText);
    }

    public void selectGender() {
        gender.click();
    }

    public void enterMobileNumber(String mobileNumber) {
        mobile.sendKeys(mobileNumber);
    }

    public void selectDOB(String year, String month) {
        dob.click();
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText(year);

        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText(month);

        dateSelect.click();
    }

    public void selectHobby() {
        hobby.click();
    }

    public void uploadPicture(String filePath) {
        uploadPicture.sendKeys(filePath);
    }

    public void enterAddress(String addressText) {
        address.sendKeys(addressText);
    }

    public void selectState(String stateText) {
        state.sendKeys(stateText);
        state.sendKeys(Keys.ENTER);
    }

    public void selectCity(String cityText) {
        city.sendKeys(cityText);
        city.sendKeys(Keys.ENTER);
    }

    public void submitForm() {
        submitButton.sendKeys(Keys.ENTER);
    }
}
