package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import scenarios.AndroidSetup;

public class MainPage extends AndroidSetup{
	@Test
	public void helloTest() {
		String app_package_name = "com.flipkart.android:id/";
		By userId = By.id(app_package_name + "user_id");
		By password = By.id(app_package_name + "user_password");
		By showPassword = By.id(app_package_name + "show_password");
		By login_Button = By.id(app_package_name + "btn_login");

		driver.findElement(userId).sendKeys("someone@testvagrant.com");
		driver.findElement(password).sendKeys("testvagrant123");
		driver.findElement(showPassword).click();
		driver.findElement(login_Button).click();
	}
}
