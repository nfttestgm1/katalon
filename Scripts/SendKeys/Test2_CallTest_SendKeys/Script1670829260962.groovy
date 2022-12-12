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

WebUI.callTestCase(findTestCase('LoginTest/Test1_LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/span_Time'))

WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/a_My Info'))

WebUI.sendKeys(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/input_Employee Id'), 
    Keys.chord(Keys.CONTROL, 'a'))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/input_Employee Id'), 
    Keys.chord(Keys.CONTROL, 'c'))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/input_Other Id'), Keys.chord(
        Keys.CONTROL, 'v'))

Thread.sleep(2000)

WebUI.closeBrowser()

