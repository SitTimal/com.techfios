package com.techfios.qa.com.techfios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginPage {

	@Test

	public void verifyLoginPage() {

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/billing/?ng=login/");

		LoginPage login = new LoginPage(driver);

		login.typeUserName();
		login.typePassword();
		login.clickLoginBtn();

		driver.quit();
	}

}
