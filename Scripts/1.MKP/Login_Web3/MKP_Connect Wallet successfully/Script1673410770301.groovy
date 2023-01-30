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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.MKP_url_dev)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('3.DEX/Login/button_Login_Web3_Auth'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_Email'), 'manhtt2@email.testing.vng.com.vn')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_Continue'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_Enter 6 digit verification code_1'), '9')

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_Enter 6 digit verification code_2'), '9')

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_Enter 6 digit verification code_3'), '9')

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_Enter 6 digit verification code_4'), '9')

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_Enter 6 digit verification code_5'), '9')

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_Enter 6 digit verification code_6'), '9')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.switchToWindowTitle('YoVerse Market')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/img_header_profile_avatar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/1.MKP/Settings/button_Login_Web3_Auth'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.closeBrowser()

