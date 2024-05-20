package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "chromedriver_v123.exe");
		
		WebDriver dr = new ChromeDriver();
		
	        try {
	            
	            dr.get("https://uploadnow.io/");

	            
	            WebElement fileInput = dr.findElement(By.xpath("//button[normalize-space()='Add files']"));
	            fileInput.click();

	            
	            String filePath = "C:\\Users\\DELL\\Downloads\\practice.txt"; 

	            Robot robot = new Robot();

	            StringSelection stringSelection = new StringSelection(filePath);
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

	            
	            robot.delay(1000); 
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);

	           
	            Thread.sleep(5000);

	        } catch (AWTException | InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	          
	            dr.quit();
	        }
	}
}