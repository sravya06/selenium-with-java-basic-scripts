package sravya1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geckochrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\geckodriver-v0.13.0-win64\\chromedriver.exe");
		WebDriver c1=new ChromeDriver();
		c1.get("http://www.google.com");

	}

}
