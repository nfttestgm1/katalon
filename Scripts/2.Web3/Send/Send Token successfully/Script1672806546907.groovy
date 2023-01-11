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
import java.lang.Integer as Integer

WebUI.callTestCase(findTestCase('2.Web3/BeforeTest/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://web3.dev.yoverse.io/wallet')

WebUI.delay(3)

String beforeSendString = WebUI.getText(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/div_totalBalance'))
System.out.println('beforeSendString: ' +beforeSendString)

double beforeSendDouble = Double.parseDouble(beforeSendString.replaceAll(",", ""));

// - GlobalVariable.valueToSendStar
System.out.println('beforeSendDouble: ' +beforeSendDouble)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/tab_tokens'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/div_home_token_0'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.verifyElementVisible(findTestObject('2.Web3/Send/Send_Tokens/section_Back to Wallet Home'),FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Send'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/section_Send To'),FailureHandling.STOP_ON_FAILURE)

//input invalid username
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/input_Setting_username_input'), 'mn')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.verifyElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Done'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Done'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/div_invalid_username'),FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Next'), FailureHandling.STOP_ON_FAILURE)

//ctrl A + back thi moi work
WebUI.delay(GlobalVariable.globalDelayTime)
WebUI.sendKeys(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/input_Setting_username_input'), Keys.chord(Keys.CONTROL,'a'))
WebUI.sendKeys(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/input_Setting_username_input'), Keys.chord(Keys.BACK_SPACE))

//input valid username
WebUI.setText(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/input_Setting_username_input'), 'manhtt')

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Done'), 5)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Done'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Next'), 5)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/section_Amount'), FailureHandling.STOP_ON_FAILURE)

//input insufficient amount
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/input_token_input'), '0.0')

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/text_Insufficient balance'),FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Next'), FailureHandling.STOP_ON_FAILURE)

//input valid amount
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/input_token_input'), GlobalVariable.valueToSendStar.toString())

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Next'), 5)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_Next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/section_Confirm'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/div_gas_fee'),FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/div_total_paid'),FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_ConfirmToSend'), 5)

WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/button_ConfirmToSend'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/section_Wallet'),FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/text_accountname'),FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

String afterSendString = WebUI.getText(findTestObject('Object Repository/2.Web3/Send/Send_Tokens/div_totalBalance'))
System.out.println('afterSendString: ' +afterSendString)

double afterSendDouble = Double.parseDouble(afterSendString.replaceAll(",", ""));
System.out.println('afterSendDouble: ' +afterSendDouble)

WebUI.verifyEqual(beforeSendDouble - GlobalVariable.valueToSendStar, afterSendDouble)

WebUI.closeBrowser()