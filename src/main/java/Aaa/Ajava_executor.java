package Aaa;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajava_executor {

	WebDriver driver;
	
	@Test
	public void browser() {
			System.setProperty("webdriver.chrome.driver", ".\\Drove\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://learn.letskodeit.com/p/practice");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("scroll(0,20000)"); //This script take you range of scrolling..
			//js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //This script take you bottom of the page...
			//js.executeScript("arguments[0].scrollIntoView(true);", webelement); //Scroll until find the elements
			//js.executeScript("arguments[0].style.border='3px solid red'", webelements); //We can use this statement for snapshot where we found fail our test that image will border with 3px solid red..
			//js.executeScript("arguments[0].click();", element); //hidden element 
//			//JavascriptExecutor js = (JavascriptExecutor)driver;
//			//js.executeScript("arguments[0].click();", element);
			//js.executeScript(script, args);",element);
			//js.executeScript("document.getElementById('displayed-text').value='text123'");
}
}