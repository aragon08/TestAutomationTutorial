package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageLogin;

public class Tests {
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		Helpers helper = new Helpers();
		helper.waitSeconds(5);
	}
	
	@Test
	public void testOne() {
		
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.login("user", "use");
		
	}
	
	@Test
	public void testTwo() {
		
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.login("mercury", "mercury");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
