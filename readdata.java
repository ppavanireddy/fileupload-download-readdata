package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata {
	public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "chromedriver_v123.exe");

        WebDriver dr = new ChromeDriver();
        dr.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement table = dr.findElement(By.id("customers"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }
            System.out.println(); 
        }
	}

}
