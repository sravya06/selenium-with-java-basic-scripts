package sravya1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.13.0-win64\\geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get("http://Google.com");
      driver.findElement(By.id("yDmH0D")).sendKeys("selenium");
      WebElement pwd= driver.findElement(By.id("pass"));
      pwd.clear();
      pwd.sendKeys("WELCOME");
      
      
      
      
	}

}
