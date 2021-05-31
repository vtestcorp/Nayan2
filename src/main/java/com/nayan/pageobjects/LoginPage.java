package com.nayan.pageobjects;

import java.io.IOException;

import org.bson.codecs.ByteArrayCodec;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import helperMethods.Screenshots;
import helperMethods.WaitTypes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	private WebDriver driver;
	// public AppiumDriver<MobileElement> driver;
	private WaitTypes applyWait;
	private ExtentTest test;
	private Actions action;

	public LoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.applyWait = new WaitTypes(driver);
		this.test = test;
		action = new Actions(driver);
	}

//	@FindBy(xpath = "//android.widget.EditText[@text='Email or Username']")
	// @FindBy(id = "co.nayan.c3specialist_v2.qa_new:id/usernameInput")
	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='co.nayan.c3specialist_v2.qa_new:id/usernameInput']")
	private WebElement emailID_TextBox;

	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='co.nayan.c3specialist_v2.qa_new:id/passwordInput']")
	private WebElement password_TextBox;

	@FindBy(xpath = "//android.widget.Button[@resource-id='co.nayan.c3specialist_v2.qa_new:id/buttonSubmit']")
	private WebElement signIn_Button;		
	
	@FindBy(xpath = "//android.widget.Button[@resource-id='co.nayan.c3specialist_v2.qa_new:id/nextBtn']")
	private WebElement next_Button;
				
	@FindBy(xpath = "//android.widget.Button[@resource-id='co.nayan.c3specialist_v2.qa_new:id/getStartedBtn']")
	private WebElement startWorking_Button;

	public void enterEmail(String inputEmailID) throws IOException {
		applyWait.waitForElementToBeClickable(emailID_TextBox, 30).click();
		action.sendKeys(inputEmailID).build().perform();
		Screenshots.takeScreenshot(driver, "User entered email as " + inputEmailID);
		test.log(Status.INFO, "User entered email as " + inputEmailID);
	}

	public void enterPassword(String inputPassword) throws IOException {
		applyWait.waitForElementToBeClickable(password_TextBox, 30).click();
		action.sendKeys(inputPassword).build().perform();
		Screenshots.takeScreenshot(driver, "User entered password as " + inputPassword);
		test.log(Status.INFO, "User entered password as " + inputPassword);
	}

	public void clickSignInButton() throws IOException {		
		applyWait.waitForElementToBeClickable(signIn_Button, 30).click();	
		Screenshots.takeScreenshot(driver, "User clicked sign in button");
		test.log(Status.INFO, "User clicked sign button after entering credentials");
	}

	public void click_NextButton() throws IOException {
		applyWait.waitForElementToBeClickable(next_Button, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked next button");
		test.log(Status.INFO, "User clicked next button");	
	}
	
	public void click_StartWorking_Button() throws IOException, InterruptedException {
		applyWait.waitForElementToBeClickable(startWorking_Button, 30).click();
		Screenshots.takeScreenshot(driver, "User clicked start working button");
		test.log(Status.INFO, "User clicked start working button");
//		Thread.sleep(6000L);
	}

}
