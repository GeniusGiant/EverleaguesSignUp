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

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC003 - Open Email/01 td_Everleagues Team'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC003 - Open Email/01 td_Everleagues Team'))

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC003 - Open Email/02 a_Activation link'), 0)

WebUI.click(findTestObject('TC001 - Sign Up/TC003 - Open Email/02 a_Activation link'))

WebUI.waitForPageLoad(15)

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('TC001 - Sign Up/TC003 - Open Email/03 img_Username_img-logo'), 0)

WebUI.switchToWindowTitle('Everleagues')

