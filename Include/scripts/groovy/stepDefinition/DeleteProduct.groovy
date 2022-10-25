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



public class DeleteProduct {
	@Then("User login")
	public void user_login() {
		WebUI.callTestCase(findTestCase('stepDefinition/Feature Login/Login001 - Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User tap daftar jual button")
	public void user_tap_daftar_jual_button() {
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User make sure the active tab is product tab")
	public void user_make_sure_the_active_tab_is_product_tab() {
		WebUI.callTestCase(findTestCase('Pages/DaftarJualSaya/Tap Tab Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap delete button")
	public void user_tap_delete_button() {
		WebUI.callTestCase(findTestCase('Pages/DaftarJualSaya/Tap Delete Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("pop up delete product appears")
	public void pop_up_delete_product_appears() {
		WebUI.callTestCase(findTestCase('Pages/DeleteProduct/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User tap batalkan button")
	public void user_tap_batalkan_button() {
		WebUI.callTestCase(findTestCase('Pages/DeleteProduct/Tap batalkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User make sure back to product tab")
	public void user_make_sure_back_to_product_tab() {
		WebUI.callTestCase(findTestCase('Pages/DaftarJualSaya/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User tap hapus button")
	public void user_tap_hapus_button() {
		WebUI.callTestCase(findTestCase('Pages/DeleteProduct/Tap hapus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("a toast message appears")
	public void a_toast_message_appears() {
		WebUI.callTestCase(findTestCase('Pages/DeleteProduct/Verify Message'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}