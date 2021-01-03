package stepDefinition.Scholastic;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import Pages.Scholastic.NewTeacherNonTaxable;
public class NonTaxableAccount {

NewTeacherNonTaxable nonTaxableAccount = new NewTeacherNonTaxable();

    @Given("^Teacher launches landing page$")
    public void launchingLandingPage (){
        nonTaxableAccount.openScholasticLandingPage();
    }
        @When("^Teacher Selects role in education$")
        public void teacherRole () throws InterruptedException {
        nonTaxableAccount.educationRoleSelectioniFrame();
        }
            @Then("^Teacher will input personal information$")
            public void teacherPersonalInfo () throws InterruptedException {
            nonTaxableAccount.personalInformationiFrame();
            }
            @Then("^Teacher will input by zipcode$")
            public void zipcodeInteraction () throws InterruptedException {
            nonTaxableAccount.zipcodeiFram();
            }
            @Then("^Teacher will select school by its name$")
            public void schoolNameSelect () throws InterruptedException {
            nonTaxableAccount.schoolSelection();
            }
            @Then("^Teacher will select will grade they teach$")
            public void teacherGradeSelect () throws InterruptedException {
            nonTaxableAccount.teacherRoleSelection();
            }
            @Then("^Teacher will select the reading level of their class$")
            public void readingLevel () {
            nonTaxableAccount.teacherReadingLevel();
            }
            @Then("^Teacher will then close drop down menu$")
            public void closeDropDown () throws InterruptedException {
            nonTaxableAccount.loggedInLandingPage();
            }
            @Then("^Teacher will veirfy class code in profile page$")
            public void classCodeVerification (){
            nonTaxableAccount.profileLandingPage();
            }
}
