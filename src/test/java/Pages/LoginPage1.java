package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 extends BasePage1 {
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement Loginpage1;
	@FindBy(xpath="//input[@id='Email']")
	private WebElement enterEmail;
	@FindBy(xpath="//input[@class='password']")
	private WebElement enterPassword;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login;
	private Object click;
	@FindBy(xpath="//a[@href='/computers']")
	private WebElement Computers;
	@FindBy(xpath="//img[@alt='Picture for category Notebooks']")
	private WebElement notebooks;
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement Laptop;
	
	
	

	
	

public void clicklogin() {
	
	Loginpage1.click();
}
public void emailId(String string) {
	enterEmail.sendKeys(string);
}
public void password(String string) {
	enterPassword.sendKeys(string);
	
}
public void clicklogin1()
{
	login.click();
}
public void Computers1()
{
	Computers.click();
}
public void Notebooks1()
{
	notebooks.click();
}
public void laptop()

{
	Laptop.click();
	
	
}
}

	

	


	
