package cucumber.stepDefinations;

import cucumber.RegistrationPages.RegistrationPage;
import cucumber.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest extends BaseTest{
	RegistrationPage regPage;

		@Given("User open app")
		public void userOpenApp() {
			setUp();  
		}
		@When("I complete registration page")
		public void iCompleteRegistrationPage() {
			regPage=new RegistrationPage(driver);
			regPage.clickCreateButton();
			regPage.enterFirstName("Alam");
			regPage.enterLastName("Meah");
			regPage.enterMobileOrEmail("8183328569");
			//regPage.reEnterEmail("8183328569");
			regPage.enterPassword("j$345fr");
			regPage.selectBirthday("Dec", "19", "1996");
			//regPage.selectGenderFemale();
			regPage.selectGenderMale();
		}
		@When("I submit the app")
		public void iSubmitTheApp() {
			regPage.clickSignUpButton(); 
		}
		@Then("I should be registered")
		public void iShouldBeRegistered() {
			closeApp();
		}


}
