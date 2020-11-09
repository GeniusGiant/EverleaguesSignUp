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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.delay(3)

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/input_Last Name_password1'))

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC004 - Password Verification/input_Last Name_password1'))

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/input_Last Name_password1'))

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC004 - Password Verification/02 ConfirmPassword'))

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/02 ConfirmPassword'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC004 - Password Verification/03 PassErrorMessage'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/input_Last Name_password1'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC004 - Password Verification/04 ConfirmPassErrorMessage'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/input_Last Name_password1'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC004 - Password Verification/input_Last Name_password1'), 'qa24680P')

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/02 ConfirmPassword'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC004 - Password Verification/02 ConfirmPassword'), 'qa24680P')

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/05 Checkbox'))

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC004 - Password Verification/06 span_Confirm'))

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/06 span_Confirm'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC004 - Password Verification/07 h2_Sign Up Success'), 0)

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC004 - Password Verification/08 button_Ok'))

WebUI.click(findTestObject('TC001 - Sign Up/TC004 - Password Verification/08 button_Ok'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC004 - Password Verification/09 h4_Add My Organization'), 0)

WebUI.delay(3)

