package stepDefinition.Scholastic;

import Pages.Scholastic.NewAccountByZipCode;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
public class NewAccountWithZipCode {

NewAccountByZipCode zipAccount = new NewAccountByZipCode();

    @Given("^When user gets to landing page$")
    public void launchLandingPage (){
        zipAccount.openScholasticLandingPage();
    }

         @When("^Teacher clicks on create new account$")
         public void startNewAccount () throws InterruptedException {
        zipAccount.educationRoleSelectioniFrame();
         }
             @Then("^Teacher enters Personal information$")
             public void teacherPersonalInformation () throws InterruptedException {
             zipAccount.personalInformationiFrame();
             }

            @Then("^Teacher puts in zipcode information$")
            public void zipCodeInput () throws InterruptedException {
            zipAccount.zipcodeiFram();
            }

            @Then("^Teacher selects their school$")
             public void teacherSchoolSlection () throws InterruptedException {
             zipAccount.schoolSelection();
            }

            @Then("^Teacher selects their teaching role$")
             public void teachersTeachingRole () throws InterruptedException {
             zipAccount.teacherRoleSelection();
             }

            @Then("^Teacher selects class reading level$")
            public void teachersClassReadingLevel (){
            zipAccount.teacherReadingLevel();
            }

            @Then("^Teacher must close dropdown page$")
            public void teachersInteractionWithLandingPage () throws InterruptedException {
            zipAccount.loggedInLandingPage();
            }

            @Then("^The teacher will verify class code in their profile$")
            public void classCodeVerification (){
            zipAccount.profileLandingPage();
            }





}
