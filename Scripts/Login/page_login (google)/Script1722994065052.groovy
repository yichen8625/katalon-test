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

'生活服務官網首頁'
WebUI.navigateToUrl(GlobalVariable.G_URL)

'click 會員專區 tab'
WebUI.click(findTestObject('Object Repository/Page_echome/tab_account'))

'click 登入/註冊 tab'
WebUI.click(findTestObject('Object Repository/Page_echome/tab_login'))

'同意 cookies rules'
WebUI.click(findTestObject('Object Repository/Page_echome/button_cookies'))

'點擊google登入'
WebUI.click(findTestObject('Object Repository/Page_login/button_google'))

'input google account'
WebUI.setText(findTestObject('Object Repository/Page_login/google/input_account'), mail)

'click 下一步 btn'
WebUI.click(findTestObject('Object Repository/Page_login/google/button_next'))

'input google password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_login/google/input_password'),pw )

'click 下一步 btn'
WebUI.click(findTestObject('Object Repository/Page_login/google/button_next2'))

/*
WebUI.click(findTestObject(), test, 1000)

WebUI.
*/
