package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

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

public class Register {
	//Sign up using unregistered email
	@Then("User tap link daftar")
	public void user_tap_link_daftar() {
		WebUI.callTestCase(findTestCase('Pages/Register/Tap Link Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input nama")
	public void user_input_nama() {
		WebUI.callTestCase(findTestCase('Pages/Register/Input Nama'), [('nama') : 'Afi Sherma'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input unregistered email {string}")
	public void user_input_unregistered_email(String string) {
		WebUI.callTestCase(findTestCase('Pages/Register/Input Email'), [('email') : 'pltnmchllgn21@yopmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input nomor hp")
	public void user_input_nomor_hp() {
		WebUI.callTestCase(findTestCase('Pages/Register/Input Nomor HP'), [('nohp') : '08122121123'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User scroll down")
	public void user_scroll_down() {
		Mobile.swipe(48, 1173, 0, 0)
	}

	@Then("User input kota")
	public void user_input_kota() {
		WebUI.callTestCase(findTestCase('Pages/Register/Input Kota'), [('kota') : 'Semarang'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input alamat")
	public void user_input_alamat() {
		WebUI.callTestCase(findTestCase('Pages/Register/Input Alamat'), [('alamat') : 'Jalan DI Panjaitan 70'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click daftar button")
	public void user_click_daftar_button() {
		WebUI.callTestCase(findTestCase('Pages/Register/Tap Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can see pop up message Verify your email")
	public void user_can_see_pop_up_message_Verfify_your_email() {
		WebUI.callTestCase(findTestCase('Pages/Register/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//Sign up with registered email
	@Then("User click daftar button1")
	public void user_click_daftar_button1() {
		WebUI.callTestCase(findTestCase('Pages/Register/Tap Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User verify email sudah digunakan")
	public void user_verify_email_sudah_digunakan() {
		WebUI.callTestCase(findTestCase('Pages/Register/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//Sign up with name field blank
	@Then("User make name field blank")
	public void user_make_name_field_blank() {
		WebUI.callTestCase(findTestCase('Pages/Register/Input Nama'), [('nama') : ''], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can see pop up message Nama tidak boleh kosong")
	public void user_can_see_pop_up_message_Nama_tidak_boleh_kosong() {
		WebUI.callTestCase(findTestCase('Pages/Register/Verify Blank Content'), [:], FailureHandling.STOP_ON_FAILURE)	
	}
	
	@Then("User close app")
	public void user_close_app() {
		Mobile.closeApplication()
	}
	
	@Then("User open app")
	public void user_open_app() {
		Mobile.startApplication('Apk/secondhand.apk', true)
	}	
}
