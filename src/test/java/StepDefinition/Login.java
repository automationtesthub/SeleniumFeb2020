package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseTest {
	
	
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		openapplication();	   
	}

		
	@When("^user enter valid \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
	public void user_enter_valid_and_and_click_login_button(String userid, String pwd) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(userid, pwd);
		
	}

	
	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
		System.out.println("user should be login successfully");
	}

	@Then("^user should see logout option on home page$")
	public void user_should_see_logout_option_on_home_page() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
	}
	
	@Then("^error should be dispaled$")
	public void error_should_be_dispaled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//td[contains(text(),'You must specify a valid username and password.')]")).isDisplayed();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
	
	@Then("^title should be dispaled on browser tab$")
	public void title_should_be_dispaled_on_browser_tab() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		boolean val = lp.verifyTitle("vtiger CRM - Commercial Open Source CRM");
		Assert.assertEquals(val, true);
	}

	@Then("^logo should be dispaled on browser$")
	public void logo_should_be_dispaled_on_browser() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		boolean val = lp.verifyLogo();
		Assert.assertEquals(val, true);
	}


}
