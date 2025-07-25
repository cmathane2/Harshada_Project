package stepdeffination;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;



public class stepdeff 

{
	WebDriver driver ;
	
	
	@When("^user already on login page$")
	public void user_already_on_login_page()  {
		System.out.println("chetan can do it");
		System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=FC8493753E144211A73F2D03600890AD&FORM=QBRE&sp=1&ghc=1&lq=0");
        driver.quit();

	}

	@Given("^title of the login page is free crm$")
	public void title_of_the_login_page_is_free_crm() {
		System.out.println("chetan can do it");
		System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=FC8493753E144211A73F2D03600890AD&FORM=QBRE&sp=1&ghc=1&lq=0");
	    driver.quit();
	   
	}

	@Then("^users enter the username and password$")
	public void users_enter_the_username_and_password()  {
		System.out.println("chetan can do it");
		System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=FC8493753E144211A73F2D03600890AD&FORM=QBRE&sp=1&ghc=1&lq=0");
	    driver.quit();
		
		
		

	}

	@Then("^users click on login button$")
	public void users_click_on_login_button()  {

		System.out.println("chetan can do it");
		System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=FC8493753E144211A73F2D03600890AD&FORM=QBRE&sp=1&ghc=1&lq=0");
	    driver.quit();
	}

	@And("^close the browser$")
	public void close_the_browser()  {
		System.out.println("chetan can do it");
		System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=FC8493753E144211A73F2D03600890AD&FORM=QBRE&sp=1&ghc=1&lq=0");
	    driver.quit();
	}

}
