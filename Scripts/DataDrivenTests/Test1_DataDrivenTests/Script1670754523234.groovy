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

String name = 'Automation'

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

/*
//Way 1: using data file
WebUI.setText(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'), username)
WebUI.setText(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), password)
*/

//
//Way 2:
//println("findTestData(\"data1\").getRowNumbers() = " +findTestData("data1").getRowNumbers())
for (def rowNum = 1; rowNum <= findTestData("data1").getRowNumbers(); rowNum++) 
{
	WebUI.openBrowser('')
	WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	WebUI.setText(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'), findTestData("data1").getValue(1,rowNum))
	WebUI.setText(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), findTestData("data1").getValue(2,rowNum))
	WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/button_Login'))
	Thread.sleep(2000);
	WebUI.closeBrowser()
}

//WebUI.click(findTestObject('Object Repository/RecordOnExistingBrowser/OpenChainlist/Page_OrangeHRM/Page_OrangeHRM/button_Login'))
//Thread.sleep(2000);
//WebUI.closeBrowser()

