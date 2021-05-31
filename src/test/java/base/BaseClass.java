package base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import config.DefineConstants;
import config.DefineProperties;
import helperMethods.JsonUtils;
import helperMethods.Screenshots;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	public static String atest = "";
	public String space = "", hypen = "";
	int invalidLinksCount = 0;
	int invalidImageCount = 0;
//	public WebDriver driver;
	public AndroidDriver<MobileElement> driver;
	// public AppiumDriver<MobileElement> driver;
	public ExtentTest test;
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static String DownloadFilepath, folder, basefold;
	public static int count;

	@SuppressWarnings("deprecation")
	// @Parameters({ "browserType" })
	@BeforeClass
	public void setUp() throws Exception {
		int i = 0;
		while (i < 45) {
			space += " ";

			hypen += "-";

			i++;
		}
		count += 1;
		SimpleDateFormat df = new SimpleDateFormat("_d-M-yyyy_h-mm-ss");
		df.setTimeZone(TimeZone.getTimeZone("Canada/Eastern"));
		// Initialize Extent Report required static fields.
		folder = df.format(new Date());
		basefold = System.getProperty("user.dir") + "\\screenshot\\" + folder + "\\";
		System.out.println(System.getProperty("user.dir"));
		htmlReporter = config.ExtentReports.createInstance("report/extent.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		Thread.sleep(1000);
		if (DefineConstants.browser.equalsIgnoreCase("chrome")) {
			// defineProperties defineBrowser = new defineProperties(browser);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			/*
			 * options.addArguments("excludeSwitches",
			 * "ignore-certificate-errors"); options.addArguments("headless");
			 * options.addArguments("window-size=0x0");
			 * options.addArguments("disable-infobars");
			 */
			options.addArguments("--start-maximized");
			options.addArguments("window-size=1280,1024");
			String path = System.getProperty("user.dir");
			DownloadFilepath = path + "\\Test_Data\\Download";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", DownloadFilepath);
			options.setExperimentalOption("prefs", chromePrefs);
//			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		} else if (DefineConstants.browser.equalsIgnoreCase("firefox")) {
			// DefineProperties defineBrowser = new DefineProperties(browser);
//			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (DefineConstants.browser.equalsIgnoreCase("internetexplorer")) {
			DefineProperties defineBrowser = new DefineProperties(DefineConstants.browser);
//			driver = new InternetExplorerDriver(defineBrowser.setIECapability());
			driver.manage().window().maximize();
			// driver = new RemoteWebDriver(new URL(url),
			// defineBrowser.SauceLabCapabilities());
		} else if (DefineConstants.browser.equalsIgnoreCase("Android")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", JsonUtils.getData(DefineConstants.Desired_Capabilities, "deviceName"));
			caps.setCapability("udid", JsonUtils.getData(DefineConstants.Desired_Capabilities, "udid"));
			caps.setCapability("platformName", JsonUtils.getData(DefineConstants.Desired_Capabilities, "platformName"));
			caps.setCapability("platformVersion",JsonUtils.getData(DefineConstants.Desired_Capabilities, "platformVersion"));
			caps.setCapability("skipUnlock", JsonUtils.getData(DefineConstants.Desired_Capabilities, "skipUnlock"));
			caps.setCapability("appPackage", JsonUtils.getData(DefineConstants.Desired_Capabilities, "appPackage"));
			caps.setCapability("appActivity", JsonUtils.getData(DefineConstants.Desired_Capabilities, "appActivity"));
			caps.setCapability("noReset", JsonUtils.getData(DefineConstants.Desired_Capabilities, "noReset"));
			/*
			 * caps.setCapability("unicodeKeyboard",JsonUtils.getData(
			 * DefineConstants.Desired_Capabilities, "unicodeKeyboard"));
			 * caps.setCapability("resetKeyboard",JsonUtils.getData(
			 * DefineConstants.Desired_Capabilities, "resetKeyboard"));
			 */
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		extent.setSystemInfo("Selenium Version", "3");
		extent.setSystemInfo("Environment", "Testing QA");
	}
	
	public void openApp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", JsonUtils.getData(DefineConstants.Desired_Capabilities, "deviceName"));
		caps.setCapability("udid", JsonUtils.getData(DefineConstants.Desired_Capabilities, "udid"));
		caps.setCapability("platformName", JsonUtils.getData(DefineConstants.Desired_Capabilities, "platformName"));
		caps.setCapability("platformVersion",JsonUtils.getData(DefineConstants.Desired_Capabilities, "platformVersion"));
		caps.setCapability("skipUnlock", JsonUtils.getData(DefineConstants.Desired_Capabilities, "skipUnlock"));
		caps.setCapability("appPackage", JsonUtils.getData(DefineConstants.Desired_Capabilities, "appPackage"));
		caps.setCapability("appActivity", JsonUtils.getData(DefineConstants.Desired_Capabilities, "appActivity"));
		caps.setCapability("noReset", JsonUtils.getData(DefineConstants.Desired_Capabilities, "noReset"));
		/*
		 * caps.setCapability("unicodeKeyboard",JsonUtils.getData(
		 * DefineConstants.Desired_Capabilities, "unicodeKeyboard"));
		 * caps.setCapability("resetKeyboard",JsonUtils.getData(
		 * DefineConstants.Desired_Capabilities, "resetKeyboard"));
		 */
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
	}
	

	public WebDriver getDriver() {
		return driver;
	}

//	@BeforeTest
	public void resetRecords() throws InterruptedException {
		RestAssured.baseURI = "https://c3-v2-qa-new.nayan.co/api/qa/maintenance";
		RequestSpecification requestSpecification = RestAssured.given().header("api-key", "hoEnvzC8X95KHvxFH3fuC3HY");

		Response response = requestSpecification.get("/reset_records");

		System.out.println("Status code is " + response.getStatusCode());

		if (response.getStatusCode() == 200) {
			System.out.println("New records created");
		}
		Thread.sleep(10000L);
	}

	@AfterMethod(timeOut = 10000L, alwaysRun = true)
	public void checkResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			atest += "    " + count + "     " + result.getTestClass().getName() + "." + result.getName()
					+ " - Failed\n";
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test Case FAILED", ExtentColor.RED));
			test.fail(result.getThrowable());
			test.addScreenCaptureFromPath(Screenshots.takeScreenshot(driver, result.getMethod().getMethodName()));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			atest += "    " + count + "     " + result.getTestClass().getName() + "." + result.getName()
					+ " - Passed\n";
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			atest += "    " + count + "     " + result.getTestClass().getName() + "." + result.getName()
					+ " - Skipped\n";
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.YELLOW));
		}
	}

	@AfterClass
	public void tearDown() throws IOException {
		extent.flush();
		driver.quit();
	}

}