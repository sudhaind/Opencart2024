package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		
		super(driver);
		
	}
	
//PageFactory elements
	
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement txtConfirmpassword;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkPolicy;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnContinue;
	
	
	//write an element for confirmation of Registration
	
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
		
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
		
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		txtTelephone.sendKeys(telephone);
		
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
		
	}
	
	public void setConfirmpassword(String confirmpassword)
	{
		
		txtConfirmpassword.sendKeys(confirmpassword);
	}
	
	
	public void SetPrivacyPolicy()
	{
		chkPolicy.click();
	}
	
	public void ClickContinue()
	{
		btnContinue.click();
	}
	
	
	
	/*
	 * public String getConfirmationMsg() {
	 * 
	 * 
	 * try { return (msgConfirmation.getText());
	 * 
	 * } catch(Exception e)
	 * 
	 * { return (e.getMessage()); } }
	 */
	 
	
}

