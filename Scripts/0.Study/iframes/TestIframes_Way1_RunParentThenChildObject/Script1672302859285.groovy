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

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

import java.awt.Robot
import java.awt.event.KeyEvent


WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html')

WebUI.switchToFrame(findTestObject('0.Study/RecordOnExistingBrowser/Selenium/iframe'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('0.Study/RecordOnExistingBrowser/Selenium/selenium_packages_1'))

WebUI.delay(3)

int currentTab = WebUI.getWindowIndex()
System.out.println("currentTab: " +currentTab)

//Press Ctrl+T to open new tab
JavascriptExecutor js = ((driver) as JavascriptExecutor)
js.executeScript("window.open();")

//Robot robot = new Robot()
//robot.keyPress(KeyEvent.VK_CONTROL)
//robot.keyPress(KeyEvent.VK_T)
//robot.keyRelease(KeyEvent.VK_CONTROL)
//robot.keyRelease(KeyEvent.VK_T)

//Go in to new tab
WebUI.switchToWindowIndex(currentTab +1)
WebUI.delay(5)

WebUI.navigateToUrl('https://24h.com.vn')
WebUI.delay(5)

//Go in to new tab
WebUI.switchToWindowIndex(currentTab)
WebUI.delay(5)

WebUI.navigateToUrl('https://zing.vn')
WebUI.delay(5)
//WebUI.closeBrowser()


