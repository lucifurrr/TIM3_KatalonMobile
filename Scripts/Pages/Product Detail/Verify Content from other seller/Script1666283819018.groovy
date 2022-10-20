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

Mobile.verifyElementVisible(findTestObject('page_product_detail/image_product'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/text_product_name'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/text_product_price'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/image_product_owner'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/text_product_owner_name'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/text_product_owner_city'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/header_Detail_Produk'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/text_category'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/text_product_category'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/text_product_desc'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/button_nego'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/button_back'), 0)

Mobile.verifyElementVisible(findTestObject('page_product_detail/textfield_search'), 0)

