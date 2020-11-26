package Aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitingalert {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.alertIsPresent()); 
	//driver.switchTo().alert().accept(); 
}
