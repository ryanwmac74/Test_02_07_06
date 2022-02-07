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

WebUI.navigateToUrl('https://www.denvergov.org/electionresults#/results/20211102')

WebUI.click(findTestObject('Object Repository/Page_Denver Election Results/button_Select an election'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Denver Election Results/a_Coordinated Election -November 2, 2021'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Denver Election Results/button_Select an election'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Denver Election Results/a_General Election -November 3, 2020'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Denver Election Results/button_Select an election'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Denver Election Results/a_Presidential Primary Election -March 3, 2020'))

WebUI.closeBrowser()

