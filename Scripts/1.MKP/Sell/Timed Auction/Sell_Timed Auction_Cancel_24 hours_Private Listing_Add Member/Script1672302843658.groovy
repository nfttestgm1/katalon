//
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.support.ui.Select

WebUI.callTestCase(findTestCase('1.MKP/BeforeTest/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.MKP_url)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable((findTestObject('Object Repository/1.MKP/Sell/img_header_profile_avatar')), 5)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/img_header_profile_avatar'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_My Profile'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Owned'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Sell'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Timed Auction'))

//select highest bidder
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Method'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Sell to the highest bidder'))

//Duration
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_timed-auction-duration'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_dateRange'))

//select 24 hours from dropdown
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Date Range_24 hours'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Confirm_Duration'))

//Set Price to sell
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/1.MKP/Sell/input_price-amount'), GlobalVariable.priceToSell)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/span_Include Buy Now option'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/span_Include Buy Now option'))

//Private Listing
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/span_Private_Listing'))

//Add Member
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Manage member'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/1.MKP/Sell/input_Wallet Address or Username'), 'lamldt')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Add member'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Done'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable((findTestObject('Object Repository/1.MKP/Sell/button_Place on market')), 5)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Place on market'))

/*
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.closeWindowIndex(1)

//WebUI.click(findTestObject('1.MKP/Sell/button_Close_Popup'))

WebUI.delay(GlobalVariable.globalDelayTime)
*/

//Buy success
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_Approve_Web3_Tnx'), 5)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_Approve_Web3_Tnx'))

WebUI.delay(GlobalVariable.globalDelayTime)
//

WebUI.closeBrowser()