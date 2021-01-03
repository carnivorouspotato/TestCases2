package stepDefinition.Scholastic;

import Pages.Scholastic.NewAccountBySchoolSearch;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewAccountWithSchoolSearch {

NewAccountBySchoolSearch schoolSearchAccount = new NewAccountBySchoolSearch();

    @Given("^User opens Scholastic landing page$")
    public void launchingLandingPage (){
        schoolSearchAccount.openScholasticLandingPage();
    }
        @Then("^Teacher clicks new account button then selects education role$")
        public void teacherNewAccountButton () throws InterruptedException {
        schoolSearchAccount.educationRoleSelectioniFrame();
        }

        @Then("^Teacher inputs personal information$")
        public void teacherPersonalInfo () throws InterruptedException {
        schoolSearchAccount.personalInformationiFrame();
        }
        @Then("^Teacher searches for school by state$")
        public void schoolInformation () throws InterruptedException {
        schoolSearchAccount.searchByStateandCityiFrame();
        }
        @Then("^Teacher will find school by name$")
        public void SchoolByName () throws InterruptedException {
        schoolSearchAccount.schoolSelection();
        }
        @Then("^Teacher inputs their role in teaching$")
        public void teachingRole () throws InterruptedException {
        schoolSearchAccount.teacherRoleSelection();
        }
        @Then("^Teacher will select the classes reading level$")
        public void readingLevel () {
        schoolSearchAccount.teacherReadingLevel();
        }
        @Then("^Teacher must close dropdown page to interacti with landing page$")
        public void landingPageInteraction () throws InterruptedException {
        schoolSearchAccount.loggedInLandingPage();
        }
        @Then("^Teacher will verify class code in profile page$")
        public void verificationOfClassCode () {
        schoolSearchAccount.profileLandingPage();
        }


}
