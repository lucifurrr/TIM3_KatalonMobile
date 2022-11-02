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

WebUI.callTestCase(findTestCase('stepDefinition/Feature Login/Login001 - Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Navigation/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Akun/Click Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page Edit Product/card_productDetail'), 0)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Element Visible'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Name'), [('product_name') : 'ASUS VIVOBOOK 14'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Price'), [('product_price') : '11000000'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Choose Category'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Place'), [('product_place') : 'tangerang'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Description'), [('product_description') : 'Laptop ASUS VIVOBOOK 14, intel CORE i5'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page Edit Product/button_changeImage'), 0)

Mobile.tapAtPosition(48, 632)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Tap Perbarui Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Element Success'), [:], FailureHandling.STOP_ON_FAILURE)

