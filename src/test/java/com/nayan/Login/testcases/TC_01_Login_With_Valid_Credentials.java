package com.nayan.Login.testcases;

import org.testng.annotations.Test;

import com.nayan.pageobjects.DashBoardPage;
import com.nayan.pageobjects.LoginPage;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_01_Login_With_Valid_Credentials extends BaseClass {

	LoginPage loginPage;
	DashBoardPage dashBoardPage;

	@Test(enabled = true)
	public void loginWithValidCredentials() throws Exception {

		test = extent.createTest("TC_01_Login_With_Valid_Credentials","User should be able to login with valid credentials");

		loginPage = new LoginPage(driver, test);
		dashBoardPage = new DashBoardPage(driver, test);

		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_01_Login_With_Valid_Credentials, "Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_01_Login_With_Valid_Credentials, "Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
	}
}