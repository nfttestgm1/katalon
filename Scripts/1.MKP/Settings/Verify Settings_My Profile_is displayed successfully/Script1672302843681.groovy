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

WebUI.callTestCase(findTestCase('1.MKP/BeforeTest/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.MKP_url)

WebUI.click(findTestObject('Object Repository/1.MKP/Settings/img_header_profile_avatar'))

WebUI.click(findTestObject('Object Repository/1.MKP/Settings/div_Settings'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Update Profile'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Username'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Bio'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Personal site'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Wallet address'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Profile Avatar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Profile Cover'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Settings/div_Save'))

WebUI.closeBrowser()

