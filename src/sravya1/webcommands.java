package sravya1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webcommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		driver.findElement(By.linkText("Privacy")).click();
		driver.getCurrentUrl();
		System.out.println("URL");
	    driver.getPageSource();
		System.out.println("PageSource");
		driver.findElement(By.linkText("Images"));
		Thread.sleep(400);
		System.out.println("URL");
		Thread.sleep(500);
		driver.close();
		driver.quit();
		
	}

}
