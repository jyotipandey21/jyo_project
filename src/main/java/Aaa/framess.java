package Aaa;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framess {

	
	WebDriver driver;

	@Test
	public void launch() throws Exception {

		System.setProperty("webdriver.chrome.driver", "dance\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home");	
		driver.manage().deleteAllCookies();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(2000);
		 WebElement iframeElements = driver.findElement(By.tagName("iframe"));
		 System.out.println("The total number of iframes are " + iframeElements.getSize());
		
		 
		 JavascriptExecutor exe = (JavascriptExecutor) driver;
		 Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		 System.out.println("Number of iframes on the page are " + numberOfFrames);
		 
		 //WebElement iframeElement = driver.findElement(By.className("line-content"));
		 WebElement iframeElement = driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(705) > td.line-content"));
		 //now use the switch command
		 driver.switchTo().frame(iframeElement);
		
		//System.out.println(driver.getPageSource());
		//System.out.println(a);
		
//		WebElement webs=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
//		driver.switchTo().frame("a077aa5e");
//		System.out.println(webs);
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
//		driver.switchTo().frame("google_ads_iframe_/22152718/sws-hb//w3schools.com//try_it_leaderboard_0");
	}
	
	
	
}
