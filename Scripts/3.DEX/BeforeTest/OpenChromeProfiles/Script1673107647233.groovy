import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

//System.setProperty('webdriver.chrome.driver', 'C:/Users/LAP15239-local/Katalon Studio/git/katalon/webdrivers/chromedriver.exe')
System.setProperty('webdriver.chrome.driver', './webdrivers/chromedriver.exe')

//Open existing Chrome Profile (da login san account)
ChromeOptions options = new ChromeOptions()
List<String> eSwitches = new ArrayList()
//eSwitches.add('enable-automation')
options.setExperimentalOption('excludeSwitches', eSwitches)
options.addArguments('--user-data-dir=C:/Users/LAP15239-local/AppData/Local/Google/Chrome/User Data')
options.addArguments('--profile-directory=Profile 4')

// For use with ChromeDriver:
WebDriver driver = new ChromeDriver(options)

//Change to default driver
DriverFactory.changeWebDriver(driver)

WebUI.maximizeWindow()

