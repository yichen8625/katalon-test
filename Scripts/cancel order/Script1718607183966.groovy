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

WebUI.navigateToUrl('https://dev.dailypro.com.tw/member/orderList')

//點擊查看訂單詳情
WebUI.click(findTestObject('Object Repository/Page_order/button_order-detail'))

WebUI.waitForPageLoad(1)
WebUI.delay(1)

//下滑至取消訂單處
WebUI.scrollToPosition(0, 2100)

//取消訂單
WebUI.click(findTestObject('Object Repository/Page_order/button_cancel-order'))

//輸入取消原因
WebUI.click(findTestObject('Object Repository/Page_order/button_other'))
WebUI.setText(findTestObject('Object Repository/Page_order/input_cancel-reason'), 'Test')

//完成取消訂單
WebUI.click(findTestObject('Object Repository/Page_order/button_cancel'))
WebUI.delay(3)
WebUI.takeFullPageScreenshot('C:\\Users\\noahc\\Katalon Studio\\EcWeb - create and cancel order\\螢幕截圖\\取消訂單\\cancel.png')

WebUI.delay(null, FailureHandling.STOP_ON_FAILURE)

// WebUI.click(findTestObject('')) 
