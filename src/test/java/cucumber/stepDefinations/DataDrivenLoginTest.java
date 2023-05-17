package cucumber.stepDefinations;

import cucumber.base.BaseTest;
import cucumber.loginPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenLoginTest extends BaseTest{
	LoginPage loginPage;
	@Given("Given user open chrome browser and facebook application")
	public void givenUserOpenChromeBrowserAndFacebookApplication() {
		System.out.println(">>>given>>>");
		   setUp();
	}
	@When("users enter {string} in the loginPage")
	public void usersEnterInTheLoginPage(String userName) {
		loginPage= new LoginPage(driver);
		loginPage.enterEmail(userName);
	}
	@When("users enter {string} in the facebook loginPage")
	public void usersEnterInTheFacebookLoginPage(String Pssword) {
		loginPage.enterPassword(Pssword);
	}
	@Then("I verify the user is logged in")
	public void iVerifyTheUserIsLoggedIn() {
		loginPage.clickLoginButton();
		  closeApp();
	}



}
