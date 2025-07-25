package com.sdet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firsttest


{


	@Test
	public void Test1()
	{
		System.out.println("chetan can do it");
		System.setProperty("webdriver.chrome.driver","D:\\Automation testing\\Chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=FC8493753E144211A73F2D03600890AD&FORM=QBRE&sp=1&ghc=1&lq=0");
	    driver.quit();


	}
	@Test
	public void Tes1()
	{
		System.out.println("chetan can do it");
	Assert.assertEquals(true, true);
	}
	@Test
	public void Test2()
	{
		System.out.println("chetan can do it 2");
		Assert.assertEquals(true, true);
	}
	@Test
	public void Test3()
	{
		System.out.println("chetan can do it 3");
		Assert.assertEquals(true, false);
	}
}