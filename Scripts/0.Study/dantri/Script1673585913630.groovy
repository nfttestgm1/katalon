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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dantri.com.vn/tet-2023/net-dep-lao-dong/20230109001932439.htm')

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Object Repository/0.Study/dantri/dantri2/button_sau'),
	5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri2/button_sau'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri/button_dangnhap_ngoai'))

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri/button_ng k'))

WebUI.setText(findTestObject('Object Repository/0.Study/dantri/dantri/input_H v tn_name'), user)

WebUI.setText(findTestObject('Object Repository/0.Study/dantri/dantri/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/0.Study/dantri/dantri/input_Mt khu_password'), pass)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri/button_click_to_login'))

WebUI.waitForElementClickable(findTestObject('Object Repository/0.Study/dantri/dantri2/button_sau'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri2/button_sau'), FailureHandling.OPTIONAL)

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/0.Study/dantri/dantri/tab_dangnhap'), GlobalVariable.globalDelayTime, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri/tab_dangnhap'))

WebUI.setText(findTestObject('Object Repository/0.Study/dantri/dantri/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/0.Study/dantri/dantri/input_Mt khu_password'), pass)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri/button_click_to_login'))

WebUI.scrollToPosition(9999999, 9999999, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/0.Study/dantri/dantri/lazy'), GlobalVariable.globalDelayTime, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/0.Study/dantri/dantri/Tym_bai_viet'), GlobalVariable.globalDelayTime, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri/Tym_bai_viet'))

WebUI.delay(GlobalVariable.globalDelayTime)

WebUI.setText(findTestObject('Object Repository/0.Study/dantri/dantri/textarea_add_comment'), text)

WebUI.click(findTestObject('Object Repository/0.Study/dantri/dantri/button_Gi bnh lun'))

WebUI.closeBrowser()

