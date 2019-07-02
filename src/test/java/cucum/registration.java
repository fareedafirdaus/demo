package cucum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registration 
{
	WebDriver driver;
	@Given("^the user is in the registration page$")
	public void the_user_is_in_the_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
		
	}

	@When("^user enters the correct username and password$")
	public void user_enters_the_correct_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		page_definition loginpage = PageFactory.initElements(driver, page_definition.class);

		loginpage.userName.sendKeys("Lalitha");
		loginpage.password.sendKeys("Password123");
		loginpage.Login.click();
		
	}

	@Then("^the successful login is made$")
	public void the_successful_login_is_made() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.close();
	}
}
