package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;

public class VisaconfirmSteps {
    @Given("^I am on the Check UK visa website$")
    public void iAmOnTheCheckUKVisaWebsite() {
    }

    @And("^I click on Start now$")
    public void iClickOnStartNow() {
        new StartPage().clickOnStartNow();
    }

    @When("^I select a nationality of 'Australia'$")
    public void iSelectANationalityOfAustralia() {
        new SelectNationalityPage().selectNationality("Australia");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^I select reason 'Tourism'$")
    public void iSelectReasonTourism() throws InterruptedException {
        new ReasonForTravelPage().selectReasonForTravel("Tourism or visiting family and friends");
        Thread.sleep(8000);
    }



    @When("^I select a nationality of 'Chile'$")
    public void iSelectANationalityOfChile() {
        new SelectNationalityPage().selectNationality("Chile");
    }

    @And("^I select reason 'Work'$")
    public void iSelectReasonWork() {
        new  ReasonForTravelPage().selectReasonForTravel("Work, academic visit or business");
    }


    @When("^I select a nationality of 'Colombia'$")
    public void iSelectANationalityOfColombia() {
        new SelectNationalityPage().selectNationality("Colombia");
    }

    @And("^I select reason 'family'$")
    public void iSelectReasonFamily() {
        new ReasonForTravelPage().selectReasonForTravel("Join partner or family for a long stay");
    }

    @And("^I state My partner or family member have uk immigration status 'yes'$")
    public void iStateMyPartnerOrFamilyMemberHaveUkImmigrationStatusYes()  {
        new FamilyImmigrationStatusPage().selectImmigrationStatus();
    }



    @Then("^I verify that message$")
    public void iVerifyThatMessage() {
        new  ResultPage().confirmResultmess("You will not need a visa to come to the UK");
    }


    @Then("^I verify that a message$")
    public void iVerifyThatAMessage() {
        new ResultPage().confirmResultmess1("You need a visa to work in health and care");
    }



    @Then("^I verify a that message$")
    public void iVerifyAThatMessage() {
        new ResultPage().confirmResultmess2("You’ll need a visa to join your family or partner in the UK");
    }


    @And("^I state I am intending to stay$")
    public void iStateIAmIntendingToStay() {
        new DurationOfStayPage().setduration();
    }

    @And("^I state I have planning to work$")
    public void iStateIHavePlanningToWork() {
        new WorkTypePage().clickonworktype();
    }
}
