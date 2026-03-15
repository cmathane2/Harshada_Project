package stepdeffination;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class Login {
	

 WebDriver driver ;
    @Given("user already on login page")
    public void user_already_on_login_page() {
        System.out.println("chetan can do it");
        System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=FC8493753E144211A73F2D03600890AD&FORM=QBRE&sp=1&ghc=1&lq=0");
        driver.quit();
//   use class variable
        driver.manage().window().maximize();
   }
  //  download A, download B
    @And("users click on login button")
    public void users_click_on_login_button() {
       System.out.println("Step: Click login");
    }
//    
    @Given("Launch the  OpenCart")
    public void Launch_the_OpenCart() {
    	System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win64\\chromedriver.exe");
    	WebDriver launch = new ChromeDriver();
        launch.get("https://www.opencart.com/index.php?route=cms/demo");    	
    }
    
    @When("title of the page is OpenCart")
    public void title_of_the_page_is_OpenCart() {
    	WebDriver driver = new ChromeDriver();
    	driver.getTitle();
    	
    }
    
    @Then("click on Register button")
    public void click_on_Register_button() {
    	WebDriver driver = new ChromeDriver();
     WebElement button = driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
     button.click();
    }
     @Then("click on Register button_1")
     public void click_on_Register_button_1() {
     	WebDriver driver = new ChromeDriver();
      WebElement button = driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
      button.click();
    	
    }  
//   @And("close the browser")
//    public void close_the_browser() {
//        driver.quit();
//    }
}
