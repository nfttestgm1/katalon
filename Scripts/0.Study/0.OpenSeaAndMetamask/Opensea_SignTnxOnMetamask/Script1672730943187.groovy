import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
//import org.openqa.selenium.remote.DesiredCapabilities as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.callTestCase(findTestCase('0.Study/0.OpenSeaAndMetamask/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://testnets.opensea.io/')

WebUI.waitForElementVisible(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/wallet_icon'), 5)

WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/wallet_icon'))

//WebUI.delay(3)

//doan nay dang gap van de
//neu chua login metamask thi se thay bieu tuong metamask xuat hien
if (WebUI.verifyElementPresent(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/my_wallet_text'), 5, 
    FailureHandling.OPTIONAL)) {

    WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/metamask_icon'))

    WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), password_wrong)

    WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Unlock_btn'))

    //    WebUI.delay(3)
    WebUI.sendKeys(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), Keys.chord(Keys.CONTROL, 
            'a'))

    WebUI.sendKeys(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), Keys.chord(Keys.BACK_SPACE))

    //    WebUI.delay(3)
    WebUI.setText(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), password_true)

    WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Unlock_btn'))
}

WebUI.switchToWindowUrl('https://testnets.opensea.io/')

//click thang Account icon sau khi da login metamask thanh cong
WebUI.waitForElementVisible(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/account_icon'), 0)

WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/account_icon'))

//WebUI.delay(3)

//thi thoang metamask bi dien disconnect wallet, can connect lai
//neu chua login metamask thi se thay bieu tuong metamask xuat hien
if (WebUI.verifyElementPresent(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/account_circle'), 5, 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/wallet_icon'))

    WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/metamask_icon'))

    WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), password_wrong)

    WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Unlock_btn'))

    //    WebUI.delay(3)
    WebUI.sendKeys(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), Keys.chord(Keys.CONTROL, 
            'a'))

    WebUI.sendKeys(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), Keys.chord(Keys.BACK_SPACE))

    //    WebUI.delay(3)
    WebUI.setText(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Password_textbox'), password_true)

    WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/Page_Chainlist/Unlock_btn'))

    WebUI.switchToWindowUrl('https://testnets.opensea.io/')
}

WebUI.waitForElementVisible(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/account_icon'), 0)

WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/account_icon'))

WebUI.delay(3)

//String parentWindowHandle = driver.getWindowHandle();
//WebUI.waitForElementClickable(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/span_My_Collections'), 5)

WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/span_My_Collections'))

WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/a_Create_a_collection'))



/*
try {
	WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.STOP_ON_FAILURE)
//	WebUI.waitForElementClickable(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/Sign_metamask_permission'), 3)
	WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/Sign_metamask_permission'))
//	WebUI.delay(3)
	
}
catch (Exception e) {
	this.println(e)
}

WebUI.switchToWindowUrl('https://testnets.opensea.io/collection/create')
//WebUI.delay(3)
*/

//neu thay yeu cau Sign (mooi ngay 1 lan thi manh dan Sign tnx)

if(WebUI.switchToWindowTitle('MetaMask Notification', FailureHandling.OPTIONAL)) {

	WebUI.waitForElementClickable(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/Sign_metamask_permission'), 3)
	WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/Sign_metamask_permission'))
}
	WebUI.delay(3)
WebUI.uploadFile(findTestObject('Object Repository/0.Study/RecordOnExistingBrowser/testnets.opensea.io/logo_image'), fileToUpload1)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/0.Study/RecordOnExistingBrowser/testnets.opensea.io/featured_image'), 
    fileToUpload2)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/0.Study/RecordOnExistingBrowser/testnets.opensea.io/banner_image'), fileToUpload3)

WebUI.delay(3)

WebUI.setText(findTestObject('0.Study/RecordOnExistingBrowser/testnets.opensea.io/name_field'), GlobalVariable.sampleCollectionName)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/0.Study/RecordOnExistingBrowser/testnets.opensea.io/button_Create'))

WebUI.delay(3)

