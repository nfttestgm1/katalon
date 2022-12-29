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

WebUI.callTestCase(findTestCase('z.MKP/BeforeTest/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.MKP_url)

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/img_header_profile_avatar'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_My Profile'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Owned'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Sell'))

WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Timed Auction'))

//Method - select highest bidder
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Method'))
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Sell to the highest bidder'))

//Duration
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_timed-auction-duration'))
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_dateRange'))
//select 24 hours from dropdown
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Date Range_24 hours'))
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Confirm_Duration'))

//Minimum bid increment
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_minimum-bid-increment'))
//select 5% from dropdown
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Bid Increment_5'))


//Starting Price
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_start-price-token'))
//select STAR from dropdown
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Token_0'))

//Set Price to sell
WebUI.setText(findTestObject('Object Repository/1.MKP/Sell/input_price-amount'), GlobalVariable.priceToSell)

//Set Buy Now option
//enable Buy Now
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/span_Include Buy Now option'))
//select STAR as token
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_buy-now-token'))

//Set Price to Buy Now
WebUI.setText(findTestObject('Object Repository/1.MKP/Sell/input_buy-now-amount'), GlobalVariable.priceToBuyNow)

//Private Listing
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/span_Private_Listing'))
//Add Member
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Manage member'))
WebUI.setText(findTestObject('Object Repository/1.MKP/Sell/input_Wallet Address or Username'), 'lamldt')
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Add member'))
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/div_Done'))

//WebUI.sleep(2000)
WebUI.waitForElementClickable((findTestObject('Object Repository/1.MKP/Sell/button_Place on market')), 5)
WebUI.click(findTestObject('Object Repository/1.MKP/Sell/button_Place on market'))
WebUI.click(findTestObject('1.MKP/Sell/button_Close_Popup'))

WebUI.closeBrowser()