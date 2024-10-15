package nun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class suitee {
	//Aim-&gt; open chrome
	//go to google,go to youtube,go to flipkart
	
	@Test
	public void openChrome()
	{
	long starttime=System.currentTimeMillis();
	System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");

	WebDriver d =new ChromeDriver() ;
	d.get("https://www.google.com/");
	d.quit();
	long endtime=System.currentTimeMillis();
	long totaltime=endtime-starttime;
	System.out.println("the time take for openchrome:"+totaltime);
	}
	@Test
	public void youtube()
	{
	long starttime=System.currentTimeMillis();
	System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");

	WebDriver d=new ChromeDriver() ;
	d.get("https://www.youtube.com/");
	d.quit();
	long endtime=System.currentTimeMillis();
	long totaltime=endtime-starttime;

	System.out.println("the time take for openchrome:"+totaltime);
	}
	@Test
	public void flipkart()
	{
	long starttime=System.currentTimeMillis();
	System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
	
	
	WebDriver d=new ChromeDriver() ;
	d.get("https://www.flipkart.com/");
	d.quit();
	long endtime=System.currentTimeMillis();
	long totaltime=endtime-starttime;
	System.out.println("the time take for openchrome:"+totaltime);
	}
	}
	
	
	
	

	
	
	
	
	

