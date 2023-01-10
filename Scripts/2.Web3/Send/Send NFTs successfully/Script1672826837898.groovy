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

WebUI.callTestCase(findTestCase('2.Web3/BeforeTest/OpenChromeProfiles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://web3.dev.yoverse.io/wallet')

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/tab_NFTs'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/tab_NFTs'))

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/item_1155'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/item_1155'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/div_Back_to_Wallet_Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/item_1155'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/item_1155_collection_0'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/div_Back_to_Collectibles'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/item_1155'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Send'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/section_Send To'),FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/input_username'),5, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/input_username'), 'manhtt')

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Done'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Done'))

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Next'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/section_Amount'),FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/input_number_of_nfts'),5, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/input_number_of_nfts'), '1')

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Next'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/section_Confirm'),FailureHandling.STOP_ON_FAILURE)

//can phai delay thi moi work, loi o doan goi chain
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Send_To_Confirm'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/button_Send_To_Confirm'))

//WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/section_Wallet'),FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
WebUI.verifyElementVisible(findTestObject('Object Repository/2.Web3/Send/Send_NFTs/text_accountname'),FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()