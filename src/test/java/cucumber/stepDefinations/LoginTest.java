package cucumber.stepDefinations;

import org.junit.Assert;

import cucumber.base.BaseTest;
import cucumber.loginPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseTest{
	LoginPage loginPage;
	@Given("user open browser and app")
	public void user_open_browser_and_app() {
	   System.out.println(">>>given>>>");
	   setUp();
	}

	@When("user enter userName")
	public void user_enter_user_name() {
		loginPage= new LoginPage(driver);
		loginPage.enterEmail("jlm@bmail.com");
		
	}

	@When("user enter password")
	public void user_enter_password() {
		loginPage.enterPassword("jkd87@df"); 
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("I validate the landing page")
	public void i_validate_the_landing_page() {
	  String expectedTitle=driver.getTitle();
	  String acutalTitle="Facebook";
	  //Assert.assertEquals("Title did not match", expectedTitle, acutalTitle);
	  closeApp();
	}

}
