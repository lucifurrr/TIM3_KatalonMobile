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



class SearchProduct {
	@Then("User input keyword {string}")
	public void user_input_keyword(search_keyword) {
		WebUI.callTestCase(findTestCase('Pages/homepage/Input Search'), [('input_search') : search_keyword], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User wait until element present")
	public void user_wait_until_element_present() {
		Mobile.waitForElementPresent(findTestObject('Homepage/product_tango'), 0)
	}
	
	@Then("User tap in product search")
	public void user_tap_in_product_search() {
		WebUI.callTestCase(findTestCase('Pages/homepage/Tap Product Exist'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User tap in product not in list")
	public void user_tap_in_product_not_in_list() {
		WebUI.callTestCase(findTestCase('Pages/homepage/Tap Product Not Exist'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}