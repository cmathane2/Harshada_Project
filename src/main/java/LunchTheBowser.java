import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LunchTheBowser {

   
	public void  Lunchbrowers()
	
	{
	System.setProperty("webdriver.edge.driver", "C:\\Edge driver\\msedgedriver.exe");

    // Initialize WebDriver
    WebDriver driver = new EdgeDriver();
    // Navigate to a website
    driver.get("https://www.bajajmall.in/emi-store/");
   // driver.switchTo().frame("//*[@id=\"homepage-opt-452c204a65\"]/iframe[5]");
    driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
   // driver.switchTo().defaultContent();
    
  WebElement TwoWheeler =  driver.findElement(By.xpath("//*[@id=\"bfl-dy-payment\"]/div/a"));
  TwoWheeler.click(); 
//*[@id="bfl-dy-payment"]/div[2]/div[2]/div[1]/a
  WebElement Honda =  driver.findElement(By.xpath("//*[@id=\"bfl-dy-payment\"]/div[2]/div[2]/div[1]/a"));
  Honda.click();
  WebElement Click_on_first_bike=  driver.findElement(By.xpath("//section[@id='plp-view-type']//section/div[2]/div/div[1]/a[1]"));
//section[@id='plp-view-type']//section/div[2]/div/div[1]/a[1]
//  driver.get("https://www.amazon.in/");
  Click_on_first_bike.click();
  
  //WebElement Click_on_Login_button=  driver.findElement(By.xpath("//*[@id=\"twowheelerpdp-1bd8702c7e\"]/div[1]/div/div[2]/div/div/div[6]/div[1]/div/div[2]"));
  
  
 // Click_on_Login_button.click();
//*[@id="twowheelerpdp-1bd8702c7e"]/div[1]/div/div[2]/div/div/section[1]/div/div[1]/div[1]/div[3]/div[2]/div/span
WebElement Click_on_Login_button=  driver.findElement(By.xpath("//*[@id=\"twowheelerpdp-1bd8702c7e\"]/div[1]/div/div[2]/div/div/section[1]/div/div[1]/div[1]/div[3]/div[2]/div/span"));
Click_on_Login_button.click();
WebElement cross = driver.findElement(By.xpath("//div[@class=\"hello-popup-wrapper\"]/div/div[1]/div[3]"));
cross.click();
Alert alert = driver.switchTo().alert();
  
  
//  System.out.println("Alert Text: " + alert.getText());  // Print alert message
 // alert.accept();  // Click "OK" to accept the alert
  driver.switchTo().alert().dismiss();
 // Thread.sleep(300);
    // Close the browser
  // driver.quit();
	}
	public void print() {
		System.out.println("Chetan Mathane Is Best");
		
	}
}
