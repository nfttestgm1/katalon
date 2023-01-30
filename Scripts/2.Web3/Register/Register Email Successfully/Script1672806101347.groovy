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
import internal.GlobalVariable
import sun.nio.fs.WindowsFileSystemProvider

import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.WEB3_url_dev)

String ts = System.currentTimeMillis().toString()

System.out.println('ts: ' +ts)	

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('2.Web3/Register/input_email'), 'reg' +ts + '@email.testing.vng.com.vn')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/2.Web3/Register/button_Continue_Submit'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Register/input_Enter 6 digit verification code_1'), '9')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Register/input_Enter 6 digit verification code_2'), '9')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Register/input_Enter 6 digit verification code_3'), '9')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Register/input_Enter 6 digit verification code_4'), '9')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Register/input_Enter 6 digit verification code_5'), '9')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Register/input_Enter 6 digit verification code_6'), '9')

usernameToSet = 'reg' + ts
System.out.println("username to set: " + usernameToSet)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Register/input_username'), usernameToSet)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Register/button_Continue_Button'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/2.Web3/Register/button_Continue_Button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Register/div_accountname'))

String username = WebUI.getText(findTestObject('Object Repository/2.Web3/Register/div_accountname'))
System.out.println("username: " + username)

WebUI.verifyMatch(username, usernameToSet, false)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.closeBrowser()