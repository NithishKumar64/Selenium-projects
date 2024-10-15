package nun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/");
     	driver.findElement(By.id("Form_submitForm_action_request")).click();
        driver.findElement(By.id("Form_getForm_Name")).sendKeys("NITHISHKUMAR");
	    driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("mbappe");
	    driver.findElement(By.id("Form_getForm_Email")).sendKeys("nithiyahoo@gmail.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9345567019");
		WebElement dropdown1 = driver.findElement(By.id("Form_getForm_Country"));
	    Select sel = new  Select(dropdown1);
	    sel.selectByValue("India");
	    driver.findElement(By.id("Form_getForm_action_submitForm")).click();
  

	}

}
