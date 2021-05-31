package com.nayan.pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import helperMethods.Screenshots;
import helperMethods.WaitTypes;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DashBoardPage {
	private WebDriver driver;
	// public AppiumDriver<MobileElement> driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private Actions action;
	@SuppressWarnings("rawtypes")
	private TouchAction touchAction;

	@SuppressWarnings("rawtypes")
	public DashBoardPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		action = new Actions(driver);
		touchAction = new TouchAction((PerformsTouchActions) driver);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/englishTxt'][@text='English']")
	private WebElement englishText_Button;

	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='co.nayan.c3specialist_v2.qa_new:id/startWorkContainer']")
	private WebElement startWork_Button;

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/editModeIv'][@package='co.nayan.c3specialist_v2.qa_new']")
	private WebElement select_Button;

	// @FindBy(xpath =
	// "//android.widget.TextView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/submitIv'][@package='co.nayan.c3specialist_v2.qa_new']")
	@FindBy(id = "co.nayan.c3specialist_v2.qa_new:id/submitIv")
	private WebElement submit_Button;

	@FindBy(xpath ="//android.widget.ImageView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/backIv'][@package='co.nayan.c3specialist_v2.qa_new']")
//	@FindBy(id = "co.nayan.c3specialist_v2.qa_new:id/backIv")
//	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[1]")
	private WebElement back_Button;

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/imageExpandIcon'][@package='co.nayan.c3specialist_v2.qa_new'][@index='3']")
//	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
//	@FindBy(xpath = "//android.widget.ImageView[@bounds='[74,676][1006,781]']")
	private WebElement expand_Button;

//	@FindBy(xpath = "//android.widget.TextView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/totalAnnotationsTxt'][@package='co.nayan.c3specialist_v2.qa_new'][@index='0']")
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	private WebElement totalAnnotatedRecords;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/profileIv'][@package='co.nayan.c3specialist_v2.qa_new'][@index='0']")
	private WebElement profileButton;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/logoutTxt'][@package='co.nayan.c3specialist_v2.qa_new'][@text='Log Out'][@index='0']")
	private WebElement logoutButton;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/trueBtn'][@package='co.nayan.c3specialist_v2.qa_new'][@index='2']")
	private WebElement trueButton;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='co.nayan.c3specialist_v2.qa_new:id/falseBtn'][@package='co.nayan.c3specialist_v2.qa_new'][@index='1']")
	private WebElement falseButton;

	public void click_English_Button() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(englishText_Button, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked english button");
		test.log(Status.INFO, "User clicked english button");
	}

	public void click_StartWork_Button() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(startWork_Button, 30).click();
//		touchAction.tap(PointOption.point(787,1341)).perform();
		Screenshots.takeScreenshot(driver, "User clicked on start work button");
		test.log(Status.INFO, "User clicked on start work button");
		Thread.sleep(10000L);
	}

	public void click_Select_Button() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(select_Button, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked on select button");
		test.log(Status.INFO, "User clicked on select button");
		Thread.sleep(3000);
	}

	public void selectArea(int start_x, int start_y, int end_x, int end_y) throws Exception {
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(start_x, start_y))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform()
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Screenshots.takeScreenshot(driver, "User selected annotated area");
		test.log(Status.INFO, "User selected annotated area");
		Thread.sleep(3000);
	}

	public void click_Submit_Button() throws IOException, InterruptedException {
		if (submit_Button.isEnabled()) {
			applyWait.waitForElementToBeClickable(submit_Button, 30).click();
			System.out.println("submit is enabled");
		} else {
			System.out.println("submit is not enabled");
			touchAction.tap(PointOption.point(967, 2022)).perform();
		}
		Screenshots.takeScreenshot(driver, "User clicked submit button");
		test.log(Status.INFO, "User clicked submit button");
		Thread.sleep(3000);
	}

	public void click_Back_Button() throws IOException, InterruptedException {
		/*applyWait.waitForElementToBeClickable(back_Button, 30).click();
		List<WebElement> buttons=driver.findElements(By.className("android.widget.ImageView"));
		System.out.println("total buttons "+buttons);
		buttons.get(0).click();*/
		
//		driver.navigate().back();
		touchAction.tap(PointOption.point(95,81)).perform();
		Screenshots.takeScreenshot(driver, "User clicked back button");
		test.log(Status.INFO, "User clicked back button");
		// Thread.sleep(3000);
	}

	public void click_Expand_Button() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(expand_Button, 30).click();
//		touchAction.tap(PointOption.point(536,724)).perform();
		Screenshots.takeScreenshot(driver, "User clicked expand button");
		test.log(Status.INFO, "User clicked expand button");
		// Thread.sleep(3000);
	}

	public void get_TotalAnnotatedRecords() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(totalAnnotatedRecords, 30);
		String total_Annotated_Records = totalAnnotatedRecords.getText();
		System.out.println("Total Annotated Records are " + total_Annotated_Records);
		Screenshots.takeScreenshot(driver, "Total Annotated Records are " + total_Annotated_Records);
		test.log(Status.INFO, "Total Annotated Records are " + total_Annotated_Records);
		Thread.sleep(3000);
	}
	
	public void click_Profile_Button() throws IOException, InterruptedException {				
		if(profileButton.isEnabled()){
			applyWait.waitForElementToBeClickable(profileButton, 30).click();
		}
		else {
			System.out.println("profile button is not enabled");
			touchAction.tap(PointOption.point(896,1899)).perform();
		}	
			
		
		Screenshots.takeScreenshot(driver, "User clicked profile button");
		test.log(Status.INFO, "User clicked profile button");
		// Thread.sleep(3000);
	}
	
	public void click_Logout_Button() throws IOException, InterruptedException {
		/*if (logoutButton.isEnabled()) {
			applyWait.waitForElementToBeClickable(logoutButton, 30);
			action.click(logoutButton);
			System.out.println("logout is enabled");
		} else {
			System.out.println("logout is not enabled");*/
//			touchAction.tap(PointOption.point(519,1528)).perform();
//		}		
		Screenshots.takeScreenshot(driver, "User clicked logout button");
		test.log(Status.INFO, "User clicked logout button");
		// Thread.sleep(3000);
	}
	
	public void click_True_Button() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(trueButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked true button");
		test.log(Status.INFO, "User clicked true button");
		// Thread.sleep(3000);
	}
	
	public void click_False_Button() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(falseButton, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked false button");
		test.log(Status.INFO, "User clicked false button");
		// Thread.sleep(3000);
	}
}
