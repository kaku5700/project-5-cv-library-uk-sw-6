package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getTypeName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='keywords'])[1]")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptions;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;

    public void acceptCookies() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllCookies);
        log.info("Accept All Cookies : ");

    }

    public void enterJobTitle(String jobTitle) {
        log.info("Entering Job Title : " + jobTitle.toString());
        sendTextToElement(this.jobTitle, jobTitle);

    }

    public void enterLocation(String location) {
        log.info("Enter Location : " + location.toString());
        sendTextToElement(this.location, location);

    }

    public void selectDistance(String distance) {
        log.info("Select Distance: " + distanceDropDown.toString());
        sendTextToElement(distanceDropDown, distance);
    }

    public void clickMoreSearchOptions() {
        log.info("Click on More Search Options : " + moreSearchOptions.toString());
        clickOnElement(moreSearchOptions);

    }

    public void enterMinSalary(String minSalary) {
        log.info("Enter Minimum Salary: " + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);

    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Enter Maximum Salary: " + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryType(String salaryType) {
        log.info("Select Salary Type: " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);

    }

    public void selectJobType(String jType) {
        log.info("Select Job Type: " + jType);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jType);

    }

    public void clickOnFindJobs() {
        log.info("Click Find Jobs Button: " + findJobs);
        clickOnElement(findJobs);

    }

}
