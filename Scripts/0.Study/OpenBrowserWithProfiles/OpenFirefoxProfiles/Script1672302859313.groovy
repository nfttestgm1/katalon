import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.remote.DesiredCapabilities as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

System.setProperty('webdriver.chrome.driver', 'C:/Users/LAP15239-local/Katalon Studio/git/katalon/webdrivers/geckodriver.exe')

ChromeOptions options = new ChromeOptions()

//options.setExperimentalOption("useAutomationExtension", false);
List<String> eSwitches = new ArrayList()

eSwitches.add('enable-automation')

options.setExperimentalOption('excludeSwitches', eSwitches)

//options.setExperimentalOption("excludeSwitches", ["enable-automation"]);
//options.addArguments("--start-maximized");
options.addArguments('--user-data-dir=C:/Users/LAP15239-local/AppData/Local/Google/Chrome/User Data')

options.addArguments('--profile-directory=Profile 4')

//DesiredCapabilities caps = new DesiredCapabilities()
//caps.setCapability(ChromeOptions.CAPABILITY, options)
//WebDriver driver = new ChromeDriver(caps)
// For use with ChromeDriver:

WebDriver driver = new ChromeDriver(options)

//Change to default driver
DriverFactory.changeWebDriver(driver)

WebUI.switchToWindowIndex(2)

WebUI.navigateToUrl('https://zing.vn')

WebUI.closeBrowser()

/* Lưu ý cần phải tắt hết Chrome nếu không sẽ chạy FAILED */

