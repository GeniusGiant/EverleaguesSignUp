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

WebUI.click(findTestObject('TC001 - Sign Up/TC002 - Sign Up/02 input_Email_email'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC002 - Sign Up/02 input_Email_email'), GlobalVariable.UserEmail)

WebUI.click(findTestObject('TC001 - Sign Up/TC002 - Sign Up/03 input_Email_firstName'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC002 - Sign Up/03 input_Email_firstName'), GlobalVariable.Name)

WebUI.click(findTestObject('TC001 - Sign Up/TC002 - Sign Up/04 input_Field is required_lastName'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC002 - Sign Up/04 input_Field is required_lastName'), 'Tester')

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC002 - Sign Up/05 span_Sign up'))

WebUI.click(findTestObject('TC001 - Sign Up/TC002 - Sign Up/05 span_Sign up'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC002 - Sign Up/img_Did not receive your activation email or the activation link is expired_img-logo'), 
    0)

WebUI.delay(3)

