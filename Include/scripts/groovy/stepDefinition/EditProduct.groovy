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



class EditProduct {
	@Then("User tap product detail")
	public void user_tap_product_detail() {
		Mobile.tap(findTestObject('Page Edit Product/card_productDetail'), 0)
	}

	@Then("User verify element exist")
	public void user_verify_element_exist() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Element Visible'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input product name {string}")
	public void user_input_product_name(product_name) {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Name'), [('product_name') : product_name], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input product price {string}")
	public void user_input_product_price(product_price) {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Price'), [('product_price') : product_price], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User choose category")
	public void user_choose_category() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Choose Category'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input product place {string}")
	public void user_input_product_place(product_place) {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Place'), [('product_place') : product_place], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input product description {string}")
	public void user_input_product_description(product_description) {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Input Product Description'), [('product_description') : product_description],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click button change image")
	public void user_click_button_change_image() {
		Mobile.tap(findTestObject('Page Edit Product/button_changeImage'), 0)
	}

	@Then("User tap category")
	public void user_tap_category() {
		Mobile.tapAtPosition(48, 632)
	}

	@Then("User tap perbarui product")
	public void user_tap_perbarui_product() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Tap Perbarui Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User verify element success")
	public void user_verify_element_success() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Element Success'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User verify description empty")
	public void user_verify_description_empty() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Empty Description'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}