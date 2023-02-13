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

WebUI.callTestCase(findTestCase('1.MKP/BeforeTest/OpenMultiBrowsers'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.MKP_url_test)

//Click on Explore button at Home
WebUI.waitForElementClickable(findTestObject('Object Repository/1.MKP/Explore/div_Explore'), 10)
WebUI.click(findTestObject('Object Repository/1.MKP/Explore/div_Explore'))

WebUI.waitForElementVisible(findTestObject('Object Repository/1.MKP/Explore/div_Filters'), 10)
Explore_URL = WebUI.getUrl()
WebUI.verifyMatch(Explore_URL, GlobalVariable.MKP_url_test + '/listing', false)

//Click on Collections button in Explore
WebUI.waitForElementClickable(findTestObject('1.MKP/Explore/button_Collections'), 10)
WebUI.click(findTestObject('1.MKP/Explore/button_Collections'))

WebUI.waitForElementVisible(findTestObject('1.MKP/Explore/div_Category'), 10)
Collections_URL = WebUI.getUrl()
WebUI.verifyMatch(Collections_URL, GlobalVariable.MKP_url_test + GlobalVariable.listing_collections_path, false)
WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Explore/div_Filters'))
WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Explore/div_Category'))

WebUI.closeBrowser()

