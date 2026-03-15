package Hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import Utils.CucumberPieChart;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {
    	 WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
       driver.manage().window().maximize();
    }
  
    @AfterAll
    public static void addPieChart() throws IOException {
        String chartPath = CucumberPieChart.generateChart();

        if (chartPath != null) {
            ExtentCucumberAdapter.addTestStepLog("📊 **Execution Summary Pie Chart**");

            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(chartPath);
        }
    }
    
    @After
    public void tearDown(Scenario scenario) {

        // Capture screenshot when scenario fails
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }

        if (driver != null) {
            driver.quit();
        }
    }
}
