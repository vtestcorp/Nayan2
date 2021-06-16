package com.nayan.Login.testcases;

import org.testng.annotations.Test;

import com.nayan.pageobjects.DashBoardPage;
import com.nayan.pageobjects.LoginPage;

import base.BaseClass;
import config.DefineConstants;
import helperMethods.JsonUtils;

public class TC_03_Verify_Data_Movement_Between_Managers extends BaseClass {

	LoginPage loginPage;
	DashBoardPage dashBoardPage;

	@Test(enabled = true)
	public void verify_Data_Movement_Between_Specialist_Managers() throws Exception {

		test = extent.createTest("TC_03_Verify_Data_Movement_Between_Managers", "Verify_Data_Movement_Between_Managers");

		loginPage = new LoginPage(driver, test);
		dashBoardPage = new DashBoardPage(driver, test);

        // openApp();
		  loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s0_Email"));
		  loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s0_Password"));
		  driver.hideKeyboard();
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
		  // 5th
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(413,911, 498, 960); 
		  dashBoardPage.click_Submit_Button();
		  System.out.println("5th done");
		  //6th
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(413,911, 498, 960); 
		  dashBoardPage.click_Submit_Button();
		  
		  dashBoardPage.click_Back_Button();		  
		  dashBoardPage.click_Expand_Button();
		  dashBoardPage.get_TotalAnnotatedRecords();
		  dashBoardPage.click_Profile_Button();
		  dashBoardPage.click_Logout_Button();
		  
		  System.out.println("s1 started");
		  
		// s1 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s1_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s1_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();

		// s1 Validate Record 1
		dashBoardPage.click_True_Button();
		// s1 Validate Record 2
		dashBoardPage.click_True_Button();
		// s1 Validate Record 3
		dashBoardPage.click_True_Button();
		// s1 Validate Record 4
		dashBoardPage.click_True_Button();
		// s1 Validate Record 5
		dashBoardPage.click_True_Button();
		// s1 Validate Record 6
		dashBoardPage.click_True_Button();
		// s1 logout
		dashBoardPage.click_Positive_Button();
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
		System.out.println("s2 started");
		
		// s2 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s2_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s2_Password"));
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
		// s2 Validate Record 5
		dashBoardPage.click_True_Button();
		// s2 Validate Record 6
		dashBoardPage.click_True_Button();
		// s2 logout
		dashBoardPage.click_Positive_Button();
//		dashBoardPage.click_Back_Button();		
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
		System.out.println("s3 started");
		
		// s3 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s3_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s3_Password"));
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
		// Validate Record 3
		dashBoardPage.click_True_Button();
		// Validate Record 4
		dashBoardPage.click_True_Button();
		// Validate Record 5
		dashBoardPage.click_True_Button();
		//  Validate Record 6
		dashBoardPage.click_True_Button();
		// s3 logout
		dashBoardPage.click_Positive_Button();
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
		System.out.println("s4 started");
		
		// s4 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s4_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "s4_Password"));
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
		// Validate Record 3
		dashBoardPage.click_True_Button();
		// Validate Record 4
		dashBoardPage.click_True_Button();
		// Validate Record 5
		dashBoardPage.click_True_Button();
		// Validate Record 6
		dashBoardPage.click_True_Button();
		// s4 logout
		dashBoardPage.click_Positive_Button();
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
		System.out.println("m0 started");
		
		// m0 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m0_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m0_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();
		Thread.sleep(1000);
		
		
		/*List<MobileElement> images=driver.findElements(By.className("android.widget.ImageView"));
		
		
		
		images.get(1).click();
		images.get(2).click();
		images.get(3).click();
		images.get(4).click();
		images.get(5).click();*/
		
		// Reject Record 1
		dashBoardPage.longPress(233, 971);
		// Reject Record 2
		dashBoardPage.click(766,861);
		// Reject Record 3
		dashBoardPage.click(244, 1387);
		// Reject Record 4
		dashBoardPage.click(769,1384);
		// Reject Record 5
		dashBoardPage.click(236,1909);
		// Reject Record 6
		dashBoardPage.click(833,1789);
		// m0 logout
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Reject_Button();
		dashBoardPage.click_RejectPopUp_Button();
		dashBoardPage.click_SubmitRecords_Button();
		dashBoardPage.click_SubmitRecordsButtonPopUp();
		dashBoardPage.click_Positive_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
				
		System.out.println("m1 started");				
		// m1 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m1_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m1_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();
		Thread.sleep(1000);
		
		// Reject Record 1
		dashBoardPage.longPress(233, 971);
		// Reject Record 2
		dashBoardPage.click(766,861);
		// Reject Record 3
		dashBoardPage.click(244, 1387);
		// Reject Record 4
		dashBoardPage.click(769,1384);
		// Reject Record 5
		dashBoardPage.click(236,1909);
		// Reject Record 6
		dashBoardPage.click(833,1789);
		// m1 logout
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Reject_Button();
		dashBoardPage.click_RejectPopUp_Button();
		dashBoardPage.click_SubmitRecords_Button();
		dashBoardPage.click_SubmitRecordsButtonPopUp();
		dashBoardPage.click_Positive_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
				
		System.out.println("m2 started");				
		// m2 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m2_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m2_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();
		Thread.sleep(1000);
		
		// Reject Record 1
		dashBoardPage.longPress(233, 971);
		// Reject Record 2
		dashBoardPage.click(766,861);
		// Reject Record 3
		dashBoardPage.click(244, 1387);
		// Reject Record 4
		dashBoardPage.click(769,1384);
		// Reject Record 5
		dashBoardPage.click(236,1909);
		// Reject Record 6
		dashBoardPage.click(833,1789);
		// m2 logout
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Reject_Button();
		dashBoardPage.click_RejectPopUp_Button();
		dashBoardPage.click_SubmitRecords_Button();
		dashBoardPage.click_SubmitRecordsButtonPopUp();
		dashBoardPage.click_Positive_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
				
		System.out.println("m3 started");			
		// m3 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m3_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m3_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();
		Thread.sleep(1000);
		
		// Reject Record 1
		dashBoardPage.longPress(233, 971);
		// Reject Record 2
		dashBoardPage.click(766,861);
		// Reject Record 3
		dashBoardPage.click(244, 1387);
		// Reject Record 4
		dashBoardPage.click(769,1384);
		// Reject Record 5
		dashBoardPage.click(236,1909);
		// Reject Record 6
		dashBoardPage.click(833,1789);
		// m3 logout
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Reject_Button();
		dashBoardPage.click_RejectPopUp_Button();
		dashBoardPage.click_SubmitRecords_Button();
		dashBoardPage.click_SubmitRecordsButtonPopUp();
		dashBoardPage.click_Positive_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
		
		System.out.println("m4 started annotation");
		
		// m4 login
		loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m4_Email"));
		loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m4_Password"));
		loginPage.clickSignInButton();
		loginPage.click_NextButton();
		loginPage.click_NextButton();
		loginPage.click_StartWorking_Button();
		dashBoardPage.click_English_Button();
		dashBoardPage.click_StartWork_Button();
		  // 1st
		  dashBoardPage.click_Select_Button(); 
		  // dashBoardPage.selectArea(378,1027, 890, 1235); 
		  dashBoardPage.selectArea(540, 1098, 674, 1154);
		  dashBoardPage.click_Submit_Button(); 
		  //2nd
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(540, 1098, 674, 1154); 
		  dashBoardPage.click_Submit_Button(); 
		  //3rd
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(540, 1098, 674, 1154); 
		  dashBoardPage.click_Submit_Button(); 
		  //4th
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(540, 1098, 674, 1154); 
		  dashBoardPage.click_Submit_Button();		  
		  // 5th
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(540, 1098, 674, 1154); 
		  dashBoardPage.click_Submit_Button();
		  System.out.println("5th done");
		  //6th
		  dashBoardPage.click_Select_Button(); 
		  dashBoardPage.selectArea(540, 1098, 674, 1154); 
		  dashBoardPage.click_Submit_Button();
		/*dashBoardPage.click_Submit_Button();
		dashBoardPage.click_Submit_Button();
		dashBoardPage.click_Submit_Button();
		dashBoardPage.click_Submit_Button();
		dashBoardPage.click_Submit_Button();
		dashBoardPage.click_Submit_Button();*/

		/*// Reject Record 1
		dashBoardPage.longPress(233, 971);
		// Reject Record 2
		dashBoardPage.click(766,861);
		// Reject Record 3
		dashBoardPage.click(244, 1387);
		// Reject Record 4
		dashBoardPage.click(769,1384);
		// Reject Record 5
		dashBoardPage.click(236,1909);
		// Reject Record 6
		dashBoardPage.click(833,1789);
		// m4 logout
//		dashBoardPage.click_Back_Button();
		dashBoardPage.click_Approve_Button();
		dashBoardPage.click_ApprovePopUp_Button();
		dashBoardPage.click_SubmitRecords_Button();
		dashBoardPage.click_SubmitRecordsButtonPopUp();*/
		dashBoardPage.click_Positive_Button();
		dashBoardPage.click_Profile_Button();
		dashBoardPage.click_Logout_Button();
		
		System.out.println("main started");
		// Managers validate records
		
		        // m0
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m0_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m0_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// m1 Validate Record 1
				dashBoardPage.click_True_Button();
				// m1 Validate Record 2
				dashBoardPage.click_True_Button();
				// m1 Validate Record 3
				dashBoardPage.click_True_Button();
				// m1 Validate Record 4
				dashBoardPage.click_True_Button();
				// m1 Validate Record 5
				dashBoardPage.click_True_Button();
				// m1 Validate Record 6
				dashBoardPage.click_True_Button();
				// m1 logout
				dashBoardPage.click_Positive_Button();
//				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();
				
				// m1
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m1_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m1_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// s1 Validate Record 1
				dashBoardPage.click_True_Button();
				// s1 Validate Record 2
				dashBoardPage.click_True_Button();
				// s1 Validate Record 3
				dashBoardPage.click_True_Button();
				// s1 Validate Record 4
				dashBoardPage.click_True_Button();
				// s1 Validate Record 5
				dashBoardPage.click_True_Button();
				// s1 Validate Record 6
				dashBoardPage.click_True_Button();
				// s1 logout
				dashBoardPage.click_Positive_Button();
//				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();
		
				// m2
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m2_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m2_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// s1 Validate Record 1
				dashBoardPage.click_True_Button();
				// s1 Validate Record 2
				dashBoardPage.click_True_Button();
				// s1 Validate Record 3
				dashBoardPage.click_True_Button();
				// s1 Validate Record 4
				dashBoardPage.click_True_Button();
				// s1 Validate Record 5
				dashBoardPage.click_True_Button();
				// s1 Validate Record 6
				dashBoardPage.click_True_Button();
				// s1 logout
				dashBoardPage.click_Positive_Button();
//				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();
				
				// m3
				loginPage.enterEmail(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m3_Email"));
				loginPage.enterPassword(JsonUtils.getData(DefineConstants.TC_03_Verify_Data_Movement_Between_Managers, "m3_Password"));
				loginPage.clickSignInButton();
				loginPage.click_NextButton();
				loginPage.click_NextButton();
				loginPage.click_StartWorking_Button();
				dashBoardPage.click_English_Button();
				dashBoardPage.click_StartWork_Button();

				// s1 Validate Record 1
				dashBoardPage.click_True_Button();
				// s1 Validate Record 2
				dashBoardPage.click_True_Button();
				// s1 Validate Record 3
				dashBoardPage.click_True_Button();
				// s1 Validate Record 4
				dashBoardPage.click_True_Button();
				// s1 Validate Record 5
				dashBoardPage.click_True_Button();
				// s1 Validate Record 6
				dashBoardPage.click_True_Button();
				// s1 logout
				dashBoardPage.click_Positive_Button();
//				dashBoardPage.click_Back_Button();
				dashBoardPage.click_Profile_Button();
				dashBoardPage.click_Logout_Button();
		Thread.sleep(1000);
	}
}