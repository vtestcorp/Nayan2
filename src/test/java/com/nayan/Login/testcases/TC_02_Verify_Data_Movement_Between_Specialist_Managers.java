package com.nayan.Login.testcases;

import org.testng.annotations.Test;

import com.nayan.pageobjects.DashBoardPage;
import com.nayan.pageobjects.LoginPage;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_02_Verify_Data_Movement_Between_Specialist_Managers extends BaseClass {

	LoginPage loginPage;
	DashBoardPage dashBoardPage;

	@Test(enabled = true)
	public void verify_Data_Movement_Between_Specialist_Managers() throws Exception {

		test = extent.createTest("TC_02_Verify_Data_Movement_Between_Specialist_Managers","Verify the data movement between Specialist and managers.");

		loginPage = new LoginPage(driver, test);
		dashBoardPage = new DashBoardPage(driver, test);

//		  openApp();
		  loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s1_Email"));
		  loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s1_Password"));
		  
		  loginPage.clickSignInButton(); 
		  loginPage.click_NextButton();
		  loginPage.click_NextButton(); 
		  loginPage.click_StartWorking_Button();
		  
		  dashBoardPage.click_English_Button();
		  dashBoardPage.click_StartWork_Button(); 
		  // 1st
		  dashBoardPage.click_Select_Button(); 
		  // dashBoardPage.selectArea(378,1027, 890, 1235); 
		  dashBoardPage.selectArea(413, 911, 498, 960);
		  dashBoardPage.click_Submit_Button(); 
		  //2nd
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(413,911, 498, 960); 
		  dashBoardPage.click_Submit_Button(); 
		  //3rd
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(413,911, 498, 960); 
		  dashBoardPage.click_Submit_Button(); 
		  //4th
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(413,911, 498, 960); 
		  dashBoardPage.click_Submit_Button();
		  dashBoardPage.click_Back_Button();
		  dashBoardPage.click_Expand_Button();
		  dashBoardPage.get_TotalAnnotatedRecords();
		  dashBoardPage.click_Profile_Button();
		  dashBoardPage.click_Logout_Button();
		  
		// s2 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s2_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s2_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();

		// s2 Validate Record 1
		dashBoardPage.click_True_Button();
		// s2 Validate Record 2
		dashBoardPage.click_True_Button();
		// s2 Validate Record 3
		dashBoardPage.click_True_Button();
		// s2 Validate Record 4
		dashBoardPage.click_True_Button();
		// s2 logout
		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();

		/*		// s3 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s3_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s3_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();

		// s3 Validate Record 1
		dashBoardPage.click_True_Button();
		// Validate Record 2
		dashBoardPage.click_True_Button();
		// s3 logout
		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
		
		// s4 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s4_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "s4_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();

		// Validate Record 1
		dashBoardPage.click_True_Button();
		// Validate Record 2
		dashBoardPage.click_True_Button();
		// s4 logout
		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();*/

		        // m1 login
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m1_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m1_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// Validate Record 1
				dashBoardPage.click_False_Button();
				// Validate Record 2
				dashBoardPage.click_False_Button();
				// Validate Record 3
				dashBoardPage.click_False_Button();
				// Validate Record 4
				dashBoardPage.click_False_Button();
				// m1 logout
				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();
				/*
				// m2 login
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m2_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m2_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// Validate Record 1
				dashBoardPage.click_False_Button();
				// Validate Record 2
				dashBoardPage.click_False_Button();
				// m2 logout
				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();
				
				// m3 login
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m3_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m3_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// Validate Record 1
				dashBoardPage.click_False_Button();
				// Validate Record 2
				dashBoardPage.click_False_Button();
				// m3 logout
				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();
				
				// m4 login
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m4_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_02_Verify_Data_Movement_Between_Specialist_Managers, "m4_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// Validate Record 1
				dashBoardPage.click_False_Button();
				// Validate Record 2
				dashBoardPage.click_False_Button();
				// m4 logout
				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();*/
		
		
		Thread.sleep(1000);
	}
}