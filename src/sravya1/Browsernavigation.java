package sravya1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsernavigation {

	public static void main(String[] args) throws InterruptedException
	{
	{
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.13.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://google.com");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Images")).click();
	Thread.sleep(200);
	driver.navigate().back();
	Thread.sleep(500);
	driver.navigate().forward();
	Thread.sleep(600);
	driver.navigate().refresh();
	}
	}

}
