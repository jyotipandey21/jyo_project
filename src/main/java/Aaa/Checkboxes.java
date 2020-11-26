package Aaa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkboxes {

	
		WebDriver driver;

		@BeforeTest
		public void launch() {

			System.setProperty("webdriver.chrome.driver", "Drove\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			//driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice"); 
					
			driver.manage().deleteAllCookies();
			driver.manage().window();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		}
		@Test
		public void Check_Box_element() {
    List<WebElement> list_link=driver.findElements(By.tagName("a"));
	for (WebElement current_link : list_link) {
		String texts=current_link.getText();
		System.out.println(texts);
	//	Assert.assertTrue(texts.equals(list_link));
	}
		
		}	
		}


