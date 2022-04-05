package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin {
	
	private WebDriver driver;
	public PageLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login(String user, String pwd) {
		driver.findElement(By.name("userName")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Helpers helper = new Helpers();
		//helper.waitSeconds(5);
	}
}
