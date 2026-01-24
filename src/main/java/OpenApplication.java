import Java.Chromedriver;
import Java.Webdriver;

public class OpenApplication {
	public void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		Webdriver driver = new Chromedriver();
		
		driver.getClass();
		
		
	}

}
