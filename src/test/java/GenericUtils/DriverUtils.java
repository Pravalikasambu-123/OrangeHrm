package GenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	static ChromeDriver driverUtils;

	public static void CreateDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sapraval\\eclipse-workspace\\OrangeHrm\\src\\test\\resources\\Driver\\chromedriver.exe");
		driverUtils = new ChromeDriver();
		driverUtils.manage().window().maximize();
		driverUtils.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	

	}
	public static  WebDriver getDriver() {
		if(driverUtils ==null) {
			CreateDriver();
			
			
		}
		return driverUtils;
		

	}
}

