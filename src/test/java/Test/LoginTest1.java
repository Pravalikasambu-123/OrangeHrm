package Test;

import org.testng.annotations.Test;

import GenericUtils.DriverUtils;

import Pages.LoginPage1;

public class LoginTest1 extends BaseTest1 
{
	@Test
	public void Login() throws InterruptedException 
	{
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");

		LoginPage1 pagep = new LoginPage1();
		pagep.clicklogin();
		pagep.emailId("sambu.pravalika@capgemini.com");
		pagep.password("Lathika@7032");
		pagep.clicklogin1();
		
		pagep.Computers1();
		pagep.Notebooks1();
		pagep.laptop();
		
		
		
		}
	}
		
		
		
		

