package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddItem {
	@Then("User Login with valid credential")
	public void user_Login_with_valid_credential() {
		WebUI.callTestCase(findTestCase('stepDefinition/Feature Login/Login001 - Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Tap Beranda")
	public void user_Tap_Beranda() {
		WebUI.callTestCase(findTestCase('Pages/Navigation/Tap Beranda'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Tap Jual")
	public void user_Tap_Jual() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Tap Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Nama Produk")
	public void user_Input_Nama_Produk() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Input Nama Produk'), [('product_name') : 'KACAMATA CAT EYE'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Harga Produk")
	public void user_Input_Harga_Produk() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Input Harga Produk'), [('product_price') : '15000'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Select Kategori")
	public void user_Select_Kategori() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Select Kategori'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Lokasi")
	public void user_Input_Lokasi() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Input Lokasi'), [('product_location') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Input Deskripsi")
	public void user_Input_Deskripsi() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Input Deskripsi'), [('product_description') : 'Kacamata Kekinian'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Upload Foto Produk")
	public void user_Upload_Foto_Produk() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Upload Foto Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Tap Terbitkan")
	public void user_Tap_Terbitkan() {
		WebUI.callTestCase(findTestCase('Pages/AddItem/Tap Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}