package Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import GenericUtils.DriverUtils;

public class BaseTest1 {
	public class BaseTest {
		WebDriver driver;

		public void setup() throws FileNotFoundException, IOException {
			DriverUtils.CreateDriver();
		}

	}
}
