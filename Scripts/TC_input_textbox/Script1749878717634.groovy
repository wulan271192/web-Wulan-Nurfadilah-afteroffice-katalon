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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DemoQA/Element/button_element'), 0)

WebUI.verifyElementPresent(findTestObject('DemoQA/Element/button_element'), 2)

WebUI.click(findTestObject('DemoQA/Element/button_element'))

WebUI.verifyElementPresent(findTestObject('DemoQA/Element/TextBox/Menu_textbox'), 1)

WebUI.click(findTestObject('DemoQA/Element/TextBox/Menu_textbox'))

WebUI.setText(findTestObject('DemoQA/Element/TextBox/input_Fullname'), 'Wulan Nurfadilah S')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('DemoQA/Element/TextBox/input_UserEmail'), 0)

WebUI.setText(findTestObject('DemoQA/Element/TextBox/input_UserEmail'), 'wulan@gmail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('DemoQA/Element/TextBox/input_CurrentAddress'), 'jalan jakarta raya nomor 67 DKI Jakarta')

WebUI.delay(2)

WebUI.setText(findTestObject('DemoQA/Element/TextBox/input_PermanentAddress'), 'jalan kebayoran Square No 89 TangseL')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('DemoQA/Element/TextBox/Button_Submit'), 0)

WebUI.click(findTestObject('DemoQA/Element/TextBox/Button_Submit'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('DemoQA/Element/TextBox/text_name'), 0)

WebUI.verifyElementPresent(findTestObject('DemoQA/Element/TextBox/text_email'), 0)

WebUI.verifyElementPresent(findTestObject('DemoQA/Element/TextBox/text_currentAddress'), 0)

WebUI.verifyElementPresent(findTestObject('DemoQA/Element/TextBox/input_PermanentAddress'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

