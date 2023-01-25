package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PimPage extends BasePage {

	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
	private WebElement pimclickElement;

	public void pin() {
		pimclickElement.click();
	}

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addClick;

	public void add() {
		addClick.click();
	}
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	private WebElement Firstname;
	public void name(String string) {
		Firstname.sendKeys(string);
	}
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active orangehrm-middlename']")
	private WebElement MiddleName;
	public void middle(String string)
	{
	MiddleName.sendKeys(string);
	
	
	}
}


