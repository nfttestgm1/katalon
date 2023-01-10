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

WebUI.callTestCase(findTestCase('3.DEX/BeforeTest/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.DEX_url_dev)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.verifyElementVisible(findTestObject('Object Repository/3.DEX/Login/avatar_dex'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/3.DEX/Login/button_Login_Web3_Auth'), 10, FailureHandling.STOP_ON_FAILURE)

//get total amount before send token
String amountBeforeBuyToken = WebUI.getText(findTestObject('Object Repository/3.DEX/Login/total_user_amount'), FailureHandling.STOP_ON_FAILURE)

//System.out.println('amountBeforeBuyToken: ' +amountBeforeBuyToken)
String[] arrOfStr = amountBeforeBuyToken.split(' ', 2)

String amountBeforeBuyTokenString = arrOfStr[0]

//System.out.println('arrOfStr: ' +arrOfStr)
//System.out.println('amountBeforeBuyTokenString: ' +amountBeforeBuyTokenString)
//amountBeforeBuyTokenStringReplace = amountBeforeBuyTokenString.replaceAll(",", "");
//System.out.println('type' +amountBeforeBuyTokenStringReplace.getClass().getName())
double amountBeforeBuyTokenDouble = Double.parseDouble(amountBeforeBuyTokenString.replaceAll(',', ''))

System.out.println('amountBeforeBuyTokenDouble: ' + amountBeforeBuyTokenDouble)

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/div_DEX'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/div_DEX'))

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/tg_exchange'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/tg_exchange'))

//WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_price'), '10')

/*get current market price
String currentMarketPrice_TG = WebUI.getText(findTestObject('Object Repository/3.DEX/Login/market_price_tg'), FailureHandling.STOP_ON_FAILURE)
String[] arrOfStr1 = currentMarketPrice_TG.split(' ', 2)
System.out.println('currentMarketPrice_TG: ' + (arrOfStr1[0]))
double currentMarketPrice_TG_Double = Double.parseDouble((arrOfStr1[0]).replaceAll(',', ''))
System.out.println('currentMarketPrice_TG_Double: ' + currentMarketPrice_TG_Double)
System.out.println('GlobalVariable.token_amount: ' + GlobalVariable.token_amount)
*/

//input amount to buy
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_amount'), GlobalVariable.token_amount.toString())

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_buyTG'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_buyTG'))

//Handle Buy popup - Let's me Edit
WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_Lets_me_Edit'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_Lets_me_Edit'))

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_buyTG'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_buyTG'))

//Handle Buy popup - Confirm
WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_ReviewToConfirm'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_ReviewToConfirm'))

//Handle web3 window after Confirm - Cancel
WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_Cancel'), 5)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_Cancel'))

/*Thi thoang sau khi Cancel van hien Cancel lan 2
WebUI.delay(GlobalVariable.globalDelayTime)

System.out.println('WebUI.getWindowIndex(): ' + WebUI.getWindowIndex())

if (WebUI.getWindowIndex() > 0) {
    WebUI.verifyElementVisible(findTestObject('Object Repository/3.DEX/Login/button_Cancel'), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_Cancel'))
}

WebUI.delay(10)
*/

//Input amount again to redo transaction
WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.switchToWindowTitle('Decentralized Exchange')

WebUI.setText(findTestObject('Object Repository/3.DEX/Login/input_amount'), GlobalVariable.token_amount.toString())

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_buyTG'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_buyTG'))

//Handle Buy popup - Confirm
WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_ReviewToConfirm'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_ReviewToConfirm'))

//Handle web3 window after Confirm - Confirm web3
WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/button_Confirm_Web3_Tnx'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/button_Confirm_Web3_Tnx'))

//Return to DEX main page
WebUI.switchToWindowTitle('Decentralized Exchange')

WebUI.waitForElementClickable(findTestObject('Object Repository/3.DEX/Login/div_DEX'), 5)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.click(findTestObject('Object Repository/3.DEX/Login/div_DEX'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/3.DEX/Login/svg_loadingTnx'), 10, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/3.DEX/Login/avatar_dex'), FailureHandling.STOP_ON_FAILURE)

//get total amount after send token
String amountAfterBuyToken = WebUI.getText(findTestObject('Object Repository/3.DEX/Login/total_user_amount'), FailureHandling.STOP_ON_FAILURE)

String[] arrOfStr2 = amountAfterBuyToken.split(' ', 2)

String amountAfterBuyTokenString = arrOfStr2[0]

//amountAfterBuyTokenStringReplace = amountAfterBuyTokenString.replaceAll(",", "");
//System.out.println('type' +amountAfterBuyTokenStringReplace.getClass().getName())
double amountAfterBuyTokenDouble = Double.parseDouble(amountAfterBuyTokenString.replaceAll(',', ''))

System.out.println('amountAfterBuyTokenDouble: ' + amountAfterBuyTokenDouble)

//System.out.println('before: ' + (amountBeforeBuyTokenDouble - GlobalVariable.token_amount*currentMarketPrice_TG_Double))
//System.out.println('before: ' + (amountBeforeBuyTokenDouble - GlobalVariable.token_amount*8.54))
//System.out.println('before1: ' +amountBeforeBuyTokenDouble)
//System.out.println('before2: ' +GlobalVariable.token_amount)
//System.out.println('before3: ' +currentMarketPrice_TG_Double)
//System.out.println('after: ' +amountAfterBuyTokenDouble)

//WebUI.verifyEqual(amountBeforeBuyTokenDouble - (GlobalVariable.token_amount * currentMarketPrice_TG_Double), amountAfterBuyTokenDouble)
WebUI.verifyEqual(amountBeforeBuyTokenDouble - GlobalVariable.token_amount*8.54, amountAfterBuyTokenDouble)

WebUI.delay(2)

WebUI.closeBrowser()