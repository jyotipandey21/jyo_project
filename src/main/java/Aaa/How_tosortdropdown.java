package Aaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class How_tosortdropdown {
	WebDriver driver;

	@BeforeTest
	public void launch() {

		System.setProperty("webdriver.chrome.driver", "Drove\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101");
		driver.manage().deleteAllCookies();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	@Test
	public void Drop_Down_list() {
		Select Sel_DropDown = new Select(driver.findElement(By.xpath("//select[@name='due_month']")));
		List actual_list = new ArrayList();
		
		List<WebElement> drops = Sel_DropDown.getOptions();
		for (WebElement webElement : drops) 
			{
			String data = webElement.getText();
			actual_list.add(data);
		}
		List temp = new ArrayList();
		temp.addAll(actual_list);

		Collections.sort(temp);
		Assert.assertTrue(actual_list.equals(temp));

	}
	@Test(enabled=false)
public void Item_list() {
// How to get all list item of dropdown
//		Select select=new Select(DropDown);
//		 select.selectByVisibleText("Jan");
//		 List<WebElement> list_dropDown=driver.findElements(By.xpath("//select[@name='due_month']"));
//		 int list_size=list_dropDown.size();
//		 System.out.println(list_size);
//		 for (WebElement webElement : list_dropDown) {
//			System.out.println( webElement.getText());
//		}
}
}