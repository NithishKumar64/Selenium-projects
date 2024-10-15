package seleniumbasic;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnnaUniversity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://coe1.annauniv.edu/home/");
		driver.findElement(By.id("register_no")).sendKeys("XXXXXXXXXXXX");
		Thread.sleep(2000);
		driver.findElement(By.name("dob")).sendKeys("XXXXX");
		Thread.sleep(2000);
		System.out.print("Captcha:");
		Scanner sc = new Scanner(System.in);
		String captachavalue = sc.nextLine();
		WebElement captachainput = driver.findElement(By.name("security_code_student"));
	  captachainput.sendKeys(captachavalue);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div/div[2]/form/div/div[4]/input")).click();
		Thread.sleep(2000);
		
	}

}
