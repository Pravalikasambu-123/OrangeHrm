package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin extends BasePage {

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminClick;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addClick;
	

	@FindBy(xpath = "//div[@class='oxd-select-wrapper']")
	private WebElement adminSelect;
	@FindBy(xpath="//div[contains(text(),'Select')]")
	private WebElement select;
	

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement roleSelect;

	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	private WebElement roleChosee;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement status;;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employee;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement password1;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement confirmPassword;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement saveBtn;

	public void saveBtn() {
		saveBtn.click();

	}

	public void confirmPassword(String string) {
		confirmPassword.sendKeys(string);

	}

	public void username(String string) {
		username.sendKeys(string);

	}

	public void password(String string) {
		password1.sendKeys(string);

	}

	public void admin() {
		adminClick.click();

	}

	public void status() {
		status.click();

	}

	public void add() {
		addClick.click();

	}

	public void adminSelect() {
		adminSelect.click();
	}

	public void roleChosee() {
		roleChosee.click();
	}


	public void roleSelect() {


		roleSelect.click();

	}

	public void employee(String string) {
		employee.sendKeys(string);
	}

	
	}

