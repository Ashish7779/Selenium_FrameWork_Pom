package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//div[@class='oajrlxb2 gs1a9yip g5ia77u1 mtkw9kbi tlpljxtp qensuy8j ppp5ayq2 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv nhd2j8a9 mg4g778l pfnyh3mw p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x tgvbjcpo hpfvmrgz jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr f1sip0of du4w35lb n00je7tq arfg74bv qs9ysxi8 k77z8yql btwxx1t3 abiwlrkh p8dawk7l lzcic4wl oo9gr5id q9uorilb']//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")
	WebElement profilePage;

//	@FindBy(xpath = "//a[@href='https://www.facebook.com/friends/']//div[@class='goun2846 mk2mc5f4 ccm00jje s44p3ltw rt8b4zig sk4xxmp2 n8ej3o3l agehan2d rq0escxv j83agx80 buofh1pr g5gj957u i1fnvgqd kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x hpfvmrgz jb3vyjys qt6c0cv9 l9j0dhe7 du4w35lb bp9cbjyn btwxx1t3 dflh9lhu scb9dxdr nnctdnn4']//div[@class='j83agx80 cbu4d94t tvfksri0 aov4n071 bi6gxh9e l9j0dhe7 o8rfisnq m6uieof3 icc0peqn hx8drtub j13r6fgp nddp3pr2']//img[@class='hu5pjgll bixrwtb6']")
//	WebElement friendsLink;
	@FindBy(xpath = "//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o']//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1'][contains(text(),'दोस्त')]")
	WebElement friendsLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public FriendsPage clickOnfriendsLink(){
		friendsLink.click();
		return new FriendsPage();
	}
	public ProfilePage clickOnprofilePage(){
		profilePage.click();
		return new ProfilePage();
	}
	

}
