package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	
	
	@Test
	public void verify_account_registration() {
		
		logger.info("Starting the testcase");
		
		try {
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on My account");
		hp.clickRegister();
		logger.info("Clicked on Register");
		
		AccountRegistrationPage ap = new AccountRegistrationPage(driver);
		
		/*
		 * ap.setFirstName("Ragh"); ap.setLastName("paines");
		 * ap.setEmail("rag.pained@gmail.com"); ap.setTelephone("4304489245");
		 * ap.setPassword("abcd12345"); ap.setConfirmpassword("abcd12345");
		 * ap.SetPrivacyPolicy(); ap.ClickContinue();
		 */
		
		String password = randomeAlphaNumeric();
		
		logger.info("Providing Customer Information.....");
		
		ap.setFirstName(randomeString().toUpperCase());
		ap.setLastName(randomeString().toUpperCase());
		ap.setEmail(randomeString()+"@gmail.com");
		ap.setTelephone(randomeNumber());
		ap.setPassword(password);
		ap.setConfirmpassword(password);
		ap.SetPrivacyPolicy();
		ap.ClickContinue();
		logger.info("Clicked on My Account Link");
		}
		catch(Exception e)
		{
			logger.error("Test failed");
			logger.debug("Debug logs");
			Assert.fail();
		}
		
		logger.info("Finished verify account registration test ");
	}
	
}
