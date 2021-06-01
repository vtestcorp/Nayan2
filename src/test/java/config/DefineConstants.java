package config;

public class DefineConstants {
	// Test data file Path
	public static final String Path_TestData = "";
	
	// Explicit Wait Time
	public static final int explicitWait_10 = 10;
	
	public static final int explicitWait_20 = 20;
	
	public static final int explicitWait_30 = 30;

	public static final int explicitWait_60 = 60;

	public static final String PROJECT_PATH = System.getProperty("user.dir");

	public static final String PROJECT_OS = System.getProperty("os.name");
	
	public static final String browser = "android";

	public static final String TestData_Folder = "Test_Data";
		
	public static final String Nayan_TestData_Folder = "Nayan";

	public static final String There_is_no_data_for_this_view = "There is no data for this view";
	
	// Desired Capabilities	
	public static final String Desired_Capabilities = TestData_Folder + "//" + Nayan_TestData_Folder + "//" + "DesiredCapabilities.json";
	
	// Nayan Module Json file	
	public static final String TC_01_Login_With_Valid_Credentials = TestData_Folder + "//" + Nayan_TestData_Folder + "//"+ "TC_01_Login_With_Valid_Credentials.json";
	public static final String TC_02_Verify_Data_Movement_Between_Specialist_Managers = TestData_Folder + "//" + Nayan_TestData_Folder + "//"+ "TC_02_Verify_Data_Movement_Between_Specialist_Managers.json";
	public static final String TC_03_Verify_Data_Movement_Between_Managers = TestData_Folder + "//" + Nayan_TestData_Folder + "//"+ "TC_03_Verify_Data_Movement_Between_Managers.json";
	
			
}