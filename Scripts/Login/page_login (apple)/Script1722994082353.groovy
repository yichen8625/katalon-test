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

'input phone number'
WebUI.setText(findTestObject('Object Repository/Page_login/input_phone'), phone)

'click 下一步 btn'
WebUI.click(findTestObject('Object Repository/Page_login/button_next'))

'input phone password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_login/input_pw'),pw )

'click 登入 btn'
WebUI.click(findTestObject('Object Repository/Page_login/button_login'))

// Test add a link
