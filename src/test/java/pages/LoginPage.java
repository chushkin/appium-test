package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	/*
	 * By userId = By.id(app_package_name + "user_id"); By password =
	 * By.id(app_package_name + "user_password"); By showPassword =
	 * By.id(app_package_name + "show_password"); By login_Button =
	 * By.id(app_package_name + "btn_login");
	 */
	By button_abc = By.id(app_package_name + "button_abc");
	By button_p = By.id(app_package_name + "imageView");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage invalidLogin() {
		waitForVisibilityOf(button_abc);

		for (int i = 1; i < 10; i++) {
			driver.findElement(By.id(app_package_name + "imageView"+i)).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// log(e.toString());
			}
		}
		return new LoginPage(driver);
		/*
		 * waitForVisibilityOf(userId);
		 * driver.findElement(userId).sendKeys("someone@testvagrant.com");
		 * driver.findElement(password).sendKeys("testvagrant123");
		 * driver.findElement(showPassword).click();
		 * driver.findElement(login_Button).click(); return new
		 * LoginPage(driver);
		 */
	}

}
