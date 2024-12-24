package Javapractice2024October;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class miscSelenium {

	public static void main(String[] args) {
		
		WebDriver driver;
				
		System.setProperty("webdriver.chrome.driver", "C:\\Software_JARs\\chromedriver-win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
				
		driver.get("https://www.google.ca");
		
		driver.manage().window().maximize();
		
		
		

	}

}
