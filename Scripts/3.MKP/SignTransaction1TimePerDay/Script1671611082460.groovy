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
//import org.openqa.selenium.remote.DesiredCapabilities as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


//import org.openqa.selenium.Keys as Keys
System.setProperty('webdriver.chrome.driver', 'C:/Users/LAP15239-local/Katalon Studio/git/katalon/webdrivers/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

//options.setExperimentalOption("useAutomationExtension", false);
List<String> eSwitches = new ArrayList()
eSwitches.add('enable-automation')
options.setExperimentalOption('excludeSwitches', eSwitches)

options.addArguments('--user-data-dir=C:/Users/LAP15239-local/AppData/Local/Google/Chrome/User Data')
options.addArguments('--profile-directory=Profile 4')

// For use with ChromeDriver:
WebDriver driver = new ChromeDriver(options)

//Change to default driver
DriverFactory.changeWebDriver(driver)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://testnets.opensea.io/')

WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/wallet_icon'))

//neu chua login metamask thi se thay bieu tuong metamask xuat hien
if (WebUI.verifyElementPresent(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/my_wallet_text'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/metamask_icon'))
    WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.STOP_ON_FAILURE)
    WebUI.setText(findTestObject('RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), password_true)
    WebUI.click(findTestObject('RecordOnExistingBrowser/Page_Chainlist/Unlock_btn')) 
}

WebUI.switchToWindowUrl('https://testnets.opensea.io/')

//click thang Account icon sau khi da login metamask thanh cong
WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/account_icon'))

//neu chua login metamask thi se thay bieu tuong metamask xuat hien
if (WebUI.verifyElementPresent(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/account_circle'), 5, FailureHandling.OPTIONAL)) {
	
	WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/wallet_icon'))
	
	WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/metamask_icon'))
	
	WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.STOP_ON_FAILURE)

	//    WebUI.delay(3)
	WebUI.setText(findTestObject('RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), password_true)

	WebUI.click(findTestObject('RecordOnExistingBrowser/Page_Chainlist/Unlock_btn'))
		
		WebUI.switchToWindowUrl('https://testnets.opensea.io/')
}

WebUI.waitForElementVisible(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/account_icon'), 0)

WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/account_icon'))

WebUI.delay(3)

//String parentWindowHandle = driver.getWindowHandle();

WebUI.waitForElementClickable(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/span_My_Collections'), 5)

WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/span_My_Collections'))

WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/a_Create_a_collection'))

try {
	WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.STOP_ON_FAILURE)
//	WebUI.waitForElementClickable(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/Sign_metamask_permission'), 3)
	WebUI.click(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/Sign_metamask_permission'))
//	WebUI.delay(3)
	
}
catch (Exception e) {
	this.println(e)
}

WebUI.switchToWindowUrl('https://testnets.opensea.io/collection/create')
//WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/logo_image'), fileToUpload1)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/featured_image'), fileToUpload2)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/banner_image'), fileToUpload3)

WebUI.delay(3)

WebUI.setText(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/name_field'),
	'manh3')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/button_Create'))
WebUI.delay(3)

//WebUI.click(findTestObject('RecordOnExistingBrowser/Page_The Internet/file_submit'))

/*
def filePath = RunConfiguration.getProjectDir() + '/imageToUpload/test1.png'

WebUI.waitForElementVisible(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/logo_image'), 5)
//Upload test-photo.png to input_browse's
WebUI.uploadFile(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/logo_image'), 'C:/Users/LAP15239-local/Katalon Studio/git/katalon/imageToUpload/test1.png')

//WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/logo_image'))
//
//WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/featured_image'))
//
//WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/banner_image'))

WebUI.delay(3)

WebUI.setText(findTestObject('RecordOnExistingBrowser/testnets.opensea.io/name_field'), 
    'manh2')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/testnets.opensea.io/button_Create'))
WebUI.delay(3)
//WebUI.closeBrowser()

*/
