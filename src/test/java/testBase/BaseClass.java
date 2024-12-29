package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	
public WebDriver driver;

public Logger logger;

public Properties p;
	
	@BeforeClass(groups= {"Sanity","Regression","Master","DataDriven"})
	@Parameters({"os","browser"})
	public void setup(String oss,String br) throws IOException {
		
		//Loading config.properties file
		
		FileReader f = new FileReader("./src//test//resources//config.properties");
		
		p = new Properties();
		
		p.load(f);
		
		logger =LogManager.getLogger(this.getClass());
		
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			//String hubur
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			
			//os
			
			if(oss.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN10);
			}
			
			else if(oss.equalsIgnoreCase("MAC"))
			{
				capabilities.setPlatform(Platform.MAC);
				
			}
			
			else if(oss.equalsIgnoreCase("Linux"))
			{
				capabilities.setPlatform(Platform.LINUX);
				
			}
			
			else
			{
				
				System.out.println("No matching os");
				
				return;
			}
			
			//browser
			
			switch (br.toLowerCase())
			{
			case "chrome":capabilities.setBrowserName("chrome");break;
			case "edge"  :capabilities.setBrowserName("MicrosoftEdge");break;
			case "firefox"  :capabilities.setBrowserName("firefox");break;
			default:System.out.println("No matching browser");
			return;
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		
		}
		
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		
		{
		//I put the information.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//WebDriver driver = new ChromeDriver(options);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software_JARs\\chromedriver-win32\\chromedriver.exe");
			
		switch(br.toLowerCase())
		
		{
		case "chrome" :driver = new ChromeDriver(options);break;
		case "edge"   :driver =new EdgeDriver();break;
		case "firefox": driver =new FirefoxDriver();break;
		default:System.out.println("Invalid browser name..");return;
		
		}
		}
		//driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("appURL"));  //reading URL from properties file
		
		driver.manage().window().maximize();
		
	}
	@AfterClass(groups= {"Sanity","Regression","Master","DataDriven"})
	public void tearDown() {
		
		//driver.close();
		
		driver.quit();
		
	}
	
	
	public String randomeString()
	{
		
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	
	public String randomeNumber()
	{
		
		String generatedNumber =RandomStringUtils.randomNumeric(10);
		
		return generatedNumber;
	}
	
	public String randomeAlphaNumeric() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		String generatedNumber =RandomStringUtils.randomNumeric(4);
		
		return(generatedString+"%"+generatedNumber);
	}
}
