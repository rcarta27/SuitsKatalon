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

WebUI.navigateToUrl('https://cmiti-dev.outsystemsenterprise.com/STOCKSADMINSYSTEMS/')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_Input_UsernameVal'), 'lemms14345')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_Input_PasswordVal'), 'mkFEn9pTYmSGCzLQlGwcKg==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login/input_Username_Input_UsernameVal'))

WebUI.click(findTestObject('Object Repository/Page_Login/i_Password_icon fa fa-eye-slash fa-2x'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_Input_PasswordVal_1'), '@New1234')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_User Management_icon fa fa-power-off fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Logout'))

