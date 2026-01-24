package Java;

public class Webdriver {
	public class OpenApplication {
		public void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "https://www.naukri.com/mnjuser/profile?id=&altresid");
			
			Webdriver driver = new Chromedriver();
			
			
		}

}}
