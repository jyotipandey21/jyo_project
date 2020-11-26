package Aaa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowGetTAg_string {

	WebDriver driver;
	
	public void test() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 // to iterate
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		 System.out.println(links.get(i).getText());// we can extract data through Get()
//		 links.get(index);to get through i loop all tags
//		 links.size(); to get size 
		 }
	}

}
