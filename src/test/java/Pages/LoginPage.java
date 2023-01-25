package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement textUsername;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement textPassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnClick;

	public void enterUsername(String string){
		textUsername.sendKeys(string);
	
		
	
		
	
		
	}
	public void enterPassword(String string) {
		textPassword.sendKeys(string);
		

}
	public void clickLogin()
	{
		btnClick.click();
	}
}
	