package sravya1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class geckoIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Program Files\\geckodriver-v0.13.0-win64\\IEDriverServer.exe");
		WebDriver y1= new InternetExplorerDriver();
		y1.get("http://www.google.com");
		

	}

}
