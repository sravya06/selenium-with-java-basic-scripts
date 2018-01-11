package sravya1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
		public class Adminlogin {

			public static void main(String[] args) throws InterruptedException
			{
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		         WebDriver driver = new ChromeDriver();
		         driver.get("www.linkdin.com");
		         Thread.sleep(1000);
		         String url = driver.getCurrentUrl();
		         if(url.equals("http://localhost:3000/dashboard"))
		         {
		        	 System.out.println("login sucessful-passed");
		         }
		         else
		         {
		        	 System.out.println("login not sucessfull-failed");
		         }

	}

}
