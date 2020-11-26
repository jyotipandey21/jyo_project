package Aaa;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {
	
	WebDriver driver;
	
	@Test
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "Drove\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.objectspy.space");
				
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		//driver.navigate().back();
		
		System.out.println(driver.getWindowHandle());
		
		String Current=driver.getWindowHandle();//i need window handle method 
		Set<String> Child=driver.getWindowHandles();// then get window handles method unique
		
		Iterator<String> iter=Child.iterator();
		while(iter.hasNext()) {
	 String  namewind=iter.next();
	if(!Current.equals(namewind)) {// checking equal with current and iterator to get child window
			  driver.switchTo().window(namewind);
			  System.out.println(driver.switchTo().window(namewind));
		  }


	}
	
}}
		
		//driver.close();
	
	
	
	
	
	
	
	


