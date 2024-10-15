package nun;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;
	//Aim-&gt; open chrome
	//go to google,go to youtube,go to flipkart
	public class aftersuite {
	WebDriver d;
	long start_time;
	long endtime;
	@BeforeSuite
	public void lanchchrome()
	{
	start_time=System.currentTimeMillis();
	System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");

	d=new ChromeDriver() ;
	}
	@Test
	public void openChrome(){
	d.get("https://www.google.com/");
	}
	@Test
	public void youtube(){
	d.get("https://www.youtube.com/");
	}
	@Test
	public void flipkart()
	{
	d.get("https://www.flipkart.com/");
	}
	@AfterSuite
	public void closebrowser()
	{

	//d.quit();
	long endtime=System.currentTimeMillis();
	long totaltime=endtime-start_time;
	System.out.println("the time take for openchrome:"+totaltime);

	}
	}
