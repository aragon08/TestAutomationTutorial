package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageReservation {
	
	private WebDriver driver;
	
	
	public PageReservation(WebDriver driver) {
		this.driver = driver;
		Object passengerDrop = By.name("passCount");
	}
	
	public void selectPassengers(int cat) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement passengers = wait.until(ExpectedConditions.presenceOfElementLocated(passengerDrop)); 
	}

}
