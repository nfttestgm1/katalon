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
//import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.support.ui.Select as Select

WebUI.callTestCase(findTestCase('1.MKP/BeforeTest/OpenMultiBrowsers'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.MKP_url)

WebUI.waitForElementClickable(findTestObject('Object Repository/1.MKP/Sell/img_header_profile_avatar'), 5)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/img_header_profile_avatar'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_My Profile'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Owned'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Sell'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Fixed Price'))

WebUI.setText(findTestObject('Object Repository/1.MKP/Sell/input_fixed-price-amount'), GlobalVariable.priceToSell)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/span_Private_Listing'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/span_Private_Listing'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_fixed-price-duration'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_dateRange'))

//select 24 hours from dropdown
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Date Range_3 days'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Confirm_Duration'))

WebUI.waitForElementClickable(findTestObject('Object Repository/1.MKP/Sell/button_Place on market'), 5)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Place on market'))

//close popup web3
WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('1.MKP/Sell/button_Cancel'))

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()

