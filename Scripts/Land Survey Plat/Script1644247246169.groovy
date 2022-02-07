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

WebUI.navigateToUrl('https://www.denvergov.org/landsurveydata/search')

WebUI.setText(findTestObject('Object Repository/Page_Public Works Survey Data Tool/input_Plat Category_mat-input-1'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/div_SubdivisionPlat CategoryLegal Descripti_ef3a89'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/span_'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/span_NE'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/input_Quarter_mat-input-2'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/div_Township'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/div_Range'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/span_61'))

WebUI.click(findTestObject('Object Repository/Page_Public Works Survey Data Tool/span_Search'))

