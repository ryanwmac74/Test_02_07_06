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

WebUI.navigateToUrl('https://www.denvergov.org/campaignfinancereport')

WebUI.click(findTestObject('Object Repository/Page_Login/a_Sign-in or Sign-up (2)'))

WebUI.setText(findTestObject('Object Repository/Page_City and County of Denver - Sign up or_2a444f/input_Email address_Email address (1)'), 
    'ryan.mcnamara@denvergov.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_City and County of Denver - Sign up or_2a444f/input_Forgot your password_Password (1)'), 
    'hFow20/Uu/pTsQ2nSo6UlA==')

WebUI.click(findTestObject('Object Repository/Page_City and County of Denver - Sign up or_2a444f/button_Sign in (1)'))

WebUI.delay(15)

