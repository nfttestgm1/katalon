import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.github.kklisura.cdt.protocol.types.profiler.Profile
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.ui.SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
//import org.openqa.selenium.remote.DesiredCapabilities as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile as FirefoxProfile
import org.openqa.selenium.firefox.ProfilesIni as ProfilesIni
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.*;
////import com.microsoft.edge.seleniumtools.EdgeDriver
//import com.microsoft.edge.seleniumtools.EdgeOptions

WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()

switch (executedBrowser) {
    case WebUIDriverType.CHROME_DRIVER:
        System.setProperty('webdriver.chrome.driver', './webdrivers/chromedriver.exe')
        //Open existing Chrome Profile (da login san account)
        ChromeOptions options = new ChromeOptions()
		//List<String> eSwitches = new ArrayList()
		//eSwitches.add('enable-automation')
		//options.setExperimentalOption('excludeSwitches', eSwitches)
        options.addArguments('--user-data-dir=C:/Users/LAP15239-local/AppData/Local/Google/Chrome/User Data')
        options.addArguments('--profile-directory=Profile 4')
        //For use with ChromeDriver:
        WebDriver driver = new ChromeDriver(options)
        //Change to default driver
        DriverFactory.changeWebDriver(driver)
        break
    case WebUIDriverType.FIREFOX_DRIVER:
		System.setProperty('webdriver.gecko.driver', './webdrivers/geckodriver.exe')
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile FF = profile.getProfile("default-release-2");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(FF);
		//options.addArguments("--start-maximized"); set nay ma katalon cung k nhan, can tim cach khac
		//System.setProperty("webdriver.firefox.bin", "C:/Users/LAP15239-local/AppData/Local/Mozilla/Firefox/Profiles")
        WebDriver driver = new FirefoxDriver(options);
        // let Katalon Studio to use the WebDriver created here
        DriverFactory.changeWebDriver(driver)
		WebUI.maximizeWindow()
        break
	/* chua lam duoc voi Edge chromium
	case WebUIDriverType.EDGE_CHROMIUM_DRIVER:
		https://forum.katalon.com/t/edge-chromium-edgeoption-addarguments-not-available/52996/3
		https://github.com/katalon-studio/katalon-studio-testing-framework/blob/master/Include/scripts/groovy/com/kms/katalon/core/webui/driver/WebUIDriverType.java
		//Setting system properties of EdgeDriver
		System.setProperty('webdriver.edge.driver', './webdrivers/msedgedriver.exe')
		EdgeOptions options = new EdgeOptions();
		options.add_argument("start-maximized")
		options.use_chromium = True
		// Here you set the path of the profile ending with User Data not the profile folder
		option.add_argument('user-data-dir=C:/Users/LAP15239-local/AppData/Local/Microsoft/Edge/User Data');
		// Here you specify the actual profile folder
		options.add_argument('profile-directory=Default');
		EdgeDriver driver = new EdgeDriver(options);
		DriverFactory.changeWebDriver(driver)
		break
		/*
		// Here you set the path of the profile ending with User Data not the profile folder
		options.addArguments('user-data-dir=C:/Users/LAP15239-local/AppData/Local/Microsoft/Edge/User Data');
		// Here you specify the actual profile folder
		options.addArguments('profile-directory=Default');
		EdgeDriver driver = new EdgeDriver(options);
		// let Katalon Studio to use the WebDriver created here
		DriverFactory.changeWebDriver(driver)
		break
	*/
    default:
		System.println("Thanks!")
        break
}



