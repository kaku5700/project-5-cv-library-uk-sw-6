package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) throws InterruptedException {
        new HomePage().acceptCookies();
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
        new HomePage().clickMoreSearchOptions();
    }

    @And("I enter salary minimum {string}")
    public void iEnterSalaryMinimum(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I enter salary maximum {string}")
    public void iEnterSalaryMaximum(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().enterMinSalary(salaryType);

    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }



    @And("I click on find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobs();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        new ResultPage().verifyResults(result);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }
}
