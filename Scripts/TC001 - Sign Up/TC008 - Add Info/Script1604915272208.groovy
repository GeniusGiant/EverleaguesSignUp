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

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/01 input_Payment_orgName'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/02 input_Field is required_ouCode'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/03 span_Service Industry'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/07 span_Other Service Business'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/04 mat-error_Field is required'), 0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/05 mat-error_Field is required'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/01 input_Payment_orgName'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC005 - Additional Info/01 input_Payment_orgName'), 'Test Organization')

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/02 input_Field is required_ouCode'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC005 - Additional Info/02 input_Field is required_ouCode'), GlobalVariable.Name)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC005 - Additional Info/08 button_Next'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/08 button_Next'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/09 div_Subscription'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/10 div_Free'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/11 span_Free'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/12 div_Yearly'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/13 span_Yearly'))

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC005 - Additional Info/14 button_Create'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/14 button_Create'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/15 h4_Order Summary'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/16 div_None_mat-checkbox-inner-container'))

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC005 - Additional Info/17 button_Confirm Order'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/17 button_Confirm Order'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/18 h2_Create Organization Success'), 
    0)

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/19 button_Ok'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/20 h4_Invite members'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/21 input_Invite members_mat-input-13'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/22 input_Field is required_mat-input-14'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/23 input_Field is required_mat-input-15'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/24 span_Role'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/25 span_Co-worker'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/26 mat-error_Field is required'), 0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/27 mat-error_Field is required'), 0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/28 mat-error_Enter a valid email'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/21 input_Invite members_mat-input-13'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC005 - Additional Info/21 input_Invite members_mat-input-13'), 'Norvs01')

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/22 input_Field is required_mat-input-14'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC005 - Additional Info/22 input_Field is required_mat-input-14'), 'Tester')

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/23 input_Field is required_mat-input-15'))

WebUI.setText(findTestObject('TC001 - Sign Up/TC005 - Additional Info/23 input_Field is required_mat-input-15'), 'norvs01@mailinator.com')

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC005 - Additional Info/29 button_Send Invitation'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/29 button_Send Invitation'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/30 h4_EVERLEAGUES (v01022 build 183)'), 
    0)

WebUI.verifyElementClickable(findTestObject('TC001 - Sign Up/TC005 - Additional Info/31 div_HW'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/31 div_HW'))

WebUI.click(findTestObject('TC001 - Sign Up/TC005 - Additional Info/32 h4_Sign Out'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC005 - Additional Info/33 img_Email_img-logo'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

