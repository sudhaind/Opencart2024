package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	
	@Test
	public void verify_Login()
	{
		
		logger.info("******Starting TC002_LoginTest***********");
		
		//HomePage
		
		try {
		logger.info("***In Home Page ***********");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		logger.info("***In Login Page ***********");
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		
		//MyAccount
		
		logger.info("***In MyAccount Page ***********");
		MyAccount ma =new MyAccount(driver);
		boolean targetPage = ma.isMyAccountPageExists();
		
		Assert.assertEquals(targetPage, true,"Login failed");
		//Assert.assertTrue(targetPage);
		}
		
		catch(Exception e)
		{
			
			Assert.fail();
		}
		logger.info("*********Finished TC002_LoginTest*******");
		
	}

}
