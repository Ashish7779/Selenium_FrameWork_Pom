package com.fb.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LogOutPage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.ProfilePage;

public class ProfilePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ProfilePage profilePage;
	LogOutPage  logOutPage;
	public ProfilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		profilePage = new ProfilePage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Facebook");
	}
	@Test(priority=2)
	public void verifyProfilePageTest() {
		profilePage = homePage.clickOnprofilePage();
	}
	@Test(priority=3)
	public void verifyLogOutPageTest() {
		logOutPage = profilePage.clickOnlogOutPage();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
