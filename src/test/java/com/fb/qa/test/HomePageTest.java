package com.fb.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.FriendsPage;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;



public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	FriendsPage friendsPage;
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		friendsPage = new FriendsPage();
	}

	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Facebook");
	}
	@Test(priority=2)
	public void verifyFriendsLinkTest() {
		friendsPage = ((HomePage) homePage).clickOnfriendsLink();
	}



//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}


}