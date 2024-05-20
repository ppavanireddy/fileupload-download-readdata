package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filedownload {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "chromedriver_v123.exe");
		
		WebDriver dr = new ChromeDriver();
		
	       
	            dr.get("https://www.pexels.com/search/nature/");
	            
	           Thread.sleep(5000);
	            WebElement download = dr.findElement(By.xpath("//a[2]//span[1]//span[1]//span[1]"));
	            download.click();
	}

}
