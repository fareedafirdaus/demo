package cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dataTable 
{
	
	WebDriver driver;
	public class Credentials{
        public String username;
        public String password;
    }


	@Given("^user is in home page$")
	public void user_is_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
		driver.manage().window().maximize();

	}

	@When("^user enters below credentials$")
	public void user_enters_below_credentials(List<Credentials> userdata) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		for(Credentials credentials:userdata){

	          driver.findElement(By.name("userName")).sendKeys(credentials.username);
	          driver.findElement(By.name("password")).sendKeys(credentials.password);
	          //driver.findElemenList<Credentials> userdatat(By.name("login")).click();
	          driver.findElement(By.name("Login")).click();
	          driver.navigate().back();
		}
		
	}

	@Then("^result is obtained$")
	public void result_is_obtained() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("end");
	}


}
