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

WebUI.navigateToUrl('https://www.denvergov.org/Government/Agencies-Departments-Offices/Agencies-Departments-Offices-Directory/Recycle-Compost-Trash/Recycle-Compost-Trash-Schedules-and-Reminders')

WebUI.click(findTestObject('Object Repository/Page_Recycle, Compost, Trash Collection Sch_57d3d5/span_Missed Collections'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Recycle, Compost, Trash Collection Sch_57d3d5/span_Holidays'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Recycle, Compost, Trash Collection Sch_57d3d5/h4_Why are routes and schedules changing'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Recycle, Compost, Trash Collection Sch_57d3d5/h4_What is my Recycling week information'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Recycle, Compost, Trash Collection Sch_57d3d5/a_Denver Recycles'))

