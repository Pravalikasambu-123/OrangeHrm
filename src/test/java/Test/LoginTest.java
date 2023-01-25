package Test;

import org.testng.annotations.Test;

import GenericUtils.DriverUtils;
import Pages.Admin;
import Pages.LoginPage;
import Pages.PimPage;


public class LoginTest extends BaseTest {
	@Test
	public void Login() throws InterruptedException {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		LoginPage page = new LoginPage();
		page.enterUsername("Admin");
		page.enterPassword("admin123");
	page.clickLogin();

		Admin admin = new Admin();
		admin.admin();
	admin.add();

		admin.adminSelect();

		 admin.roleSelect();
		admin.employee("Charlie  Carter");
		admin.username("Pravalika");
		admin.password("Ammu@123");
		admin.confirmPassword("Ammu@123");
		admin.saveBtn();
		//PimPage pim=new PimPage();
		//pim.pin();
		//pim.add();
		// pim.name("Pravalikasambu");
		// pim.middle("sambu");	
		
		
	}

}
