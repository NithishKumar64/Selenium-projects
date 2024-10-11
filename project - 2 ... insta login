package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe"); ## webdriver is a key to access the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en"); ## get url from Instagram
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")).sendKeys("XXXXXXXXXXXX");##In this line if you register your id instead of "XXXXXX 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input")).sendKeys("XXXXXXXX");###In this line if you register your id instead of "XXXXXX 
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]")).click();
		Thread.sleep(2000);
		



	}

}
