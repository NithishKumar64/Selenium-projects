package nun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class   Assertion {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		 System.out.println("Page title is : " + driver.getTitle());
	      driver.close();

   }
}

    