package com.fb.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.SingnUpPage;

public class SignUpPageTest extends TestBase {
	LoginPage loginPage;
	SingnUpPage signUpPage;
	HomePage homePage;
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		signUpPage = new SingnUpPage();
		homePage = new HomePage();
		
	}
	

	@Test(priority=1)
	public void createNewAccountTest() {
		signUpPage.createNewAccount().signup(prop.getProperty("firstName"), 
				prop.getProperty("lastName"), prop.getProperty("emailAddress"),
				prop.getProperty("remailAddress"), prop.getProperty("password"), 
				prop.getProperty("day"), prop.getProperty("month"), prop.getProperty("year"));
	}
	

	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}


}
