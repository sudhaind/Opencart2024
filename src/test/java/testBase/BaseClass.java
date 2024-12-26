package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	
public WebDriver driver;

public Logger logger;

public Properties p;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String oss,String br) throws IOException {
		
		//Loading config.properties file
		
		FileReader f = new FileReader("./src//test//resources//config.properties");
		
		p = new Properties();
		
		p.load(f);
		
		logger =LogManager.getLogger(this.getClass());
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
		
		//driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("appURL"));  //reading URL from properties file
		
		driver.manage().window().maximize();
		
	}
	@AfterClass
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
