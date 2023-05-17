package cucumber.stepDefinations;

import cucumber.RegistrationPages.RegistrationPage;
import cucumber.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationDataDrivenTest extends BaseTest {
	RegistrationPage regPage;

	@Given("user open facebook homepage")
	public void userOpenFacebookHomepage() {
		setUp();
	}

	@When("user enter {string} and {string}")
	public void userEnterAnd(String firstName, String lasttName) {
		regPage = new RegistrationPage(driver);
		regPage.clickCreateButton();
		regPage.enterFirstName(firstName);
		regPage.enterLastName(lasttName);
	}

	@When("user enter {string}")
	public void userEnter(String mobileNumber) {
		regPage.enterMobileOrEmail(mobileNumber);
	}

	@When("user enter {string} and {string} and {string}")

	public void userEnterAndAnd(String month, String day, String year) {
		regPage.selectBirthday(month, day, year);
	}

	@When("user select gender")
	public void userSelectGender() {
		regPage.selectGenderFemale();
	}

	@When("user click reg button")
	public void userClickRegButton() {
		regPage.clickSignUpButton();
	}

	@Then("I verify registration page is created")
	public void iVerifyRegistrationPageIsCreated() {
		closeApp();
	}

}
