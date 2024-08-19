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

'導航至[QA自動化測試_多金流_現金 (勿動)]'
WebUI.navigateToUrl('https://dev.dailypro.com.tw/category/279/623/')

WebUI.waitForPageLoad(2)

'選取品項A'
WebUI.click(findTestObject('Object Repository/Page_service/button_item'))

'新增至購物清單'
WebUI.click(findTestObject('Object Repository/Page_service/button_addcart'))

'選擇預期服務日期與時段'
WebUI.waitForAngularLoad(5)

WebUI.scrollToPosition(0, 422)

WebUI.click(findTestObject('Object Repository/Page_service/checkbox_date'))

WebUI.click(findTestObject('Object Repository/Page_service/button_date'))

'點擊閱讀並同意服務條款'
WebUI.click(findTestObject('Object Repository/Page_service/label_confirm'))

WebUI.click(findTestObject('Object Repository/Page_service/button_confirm'))

'Click 下一步'
WebUI.click(findTestObject('Object Repository/Page_service/button_nextstep'))

'輸入訂購人姓名'
WebUI.waitForPageLoad(1)

//全選刪除
WebUI.sendKeys(findTestObject('Object Repository/Page_service/input_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_service/input_name'), Keys.chord(Keys.BACK_SPACE))

//輸入訂購人
WebUI.setText(findTestObject('Object Repository/Page_service/input_name'), 'Noah')

'Email'
WebUI.scrollToElement(findTestObject('Object Repository/Page_service/input_email'), 2)

//全選刪除
WebUI.sendKeys(findTestObject('Object Repository/Page_service/input_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_service/input_email'), Keys.chord(Keys.BACK_SPACE))

// email
WebUI.setText(findTestObject('Object Repository/Page_service/input_email'), 'test123@test.com')

'選擇付款方式'
WebUI.scrollToPosition(0, 722)

WebUI.click(findTestObject('Object Repository/Page_service/button_payment'))

/* 信用卡付款流程

'Enter payment page'
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_payment/input_card-number'), card_no)

WebUI.setText(findTestObject('Object Repository/Page_payment/input_card-expiration-date'), expiration_date)

WebUI.setText(findTestObject('Object Repository/Page_payment/input_card-ccv'), ccv)

//確定付款
WebUI.scrollToElement(findTestObject('Object Repository/Page_payment/button_pay_confirm'), 2)

WebUI.click(findTestObject('Object Repository/Page_payment/button_pay_confirm'))

'OTP verify page'
WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/Page_payment/input_otp'), otp)

WebUI.click(findTestObject('Object Repository/Page_payment/button_otp_confirm'))

WebUI.delay(5)
*/

'確認訂購'
WebUI.scrollToPosition(0, 1522)

WebUI.click(findTestObject('Object Repository/Page_service/button_orderconfirm'))

'Pay order popup'
WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_service/button_pay'))

WebUI.waitForPageLoad(4)

WebUI.setViewPortSize(1920, 1080)

WebUI.delay(5)

WebUI.takeFullPageScreenshot('C:\\Users\\noahc\\Katalon Studio\\EcWeb - create and cancel order\\螢幕截圖\\完成付款\\create.png')


/*
//API ElementPropertyValue Test
'取得訂單列表訂單資訊'
WS.sendRequest(findTestObject('OrderList'))

def response = WS.sendRequest(findTestObject('OrderList'))

WS.getElementPropertyValue(response, 'order_id'[0])
*/

WebUI.datetransfer

