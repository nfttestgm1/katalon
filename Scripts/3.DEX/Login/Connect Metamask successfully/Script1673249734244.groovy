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

WebUI.callTestCase(findTestCase('3.DEX/BeforeTest/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.DEX_url_dev)

//neu chua login metamask thi se thay bieu tuong metamask xuat hien
if (WebUI.verifyElementPresent(findTestObject('Object Repository/3.DEX/Login/button_Connect_Wallet'), 5, FailureHandling.OPTIONAL)) {
	
	WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_Connect_Wallet'))

	WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.STOP_ON_FAILURE)

	WebUI.setText(findTestObject('Object Repository/3.DEX/Login/Password_textbox'), password_wrong1)
	
	WebUI.click(findTestObject('Object Repository/3.DEX/Login/Unlock_btn'))

	//    WebUI.delay(3)
	WebUI.sendKeys(findTestObject('Object Repository/3.DEX/Login/Password_textbox'), Keys.chord(Keys.CONTROL,'a'))

	WebUI.sendKeys(findTestObject('Object Repository/3.DEX/Login/Password_textbox'), Keys.chord(Keys.BACK_SPACE))

	//    WebUI.delay(3)
	WebUI.setText(findTestObject('Object Repository/3.DEX/Login/Password_textbox'), password_true1)

	WebUI.click(findTestObject('Object Repository/3.DEX/Login/Unlock_btn'))
}


WebUI.click(findTestObject('Object Repository/3.DEX/Login/tg_exchange'))

//WebUI.click(findTestObject('Object Repository/3.DEX/Login/div_Wallet'))

//WebUI.click(findTestObject('null'))

