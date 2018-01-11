package sravya1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ssrav\\Desktop\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver f1=new FirefoxDriver();
		f1.get("http://www.google.com");
		}

}
