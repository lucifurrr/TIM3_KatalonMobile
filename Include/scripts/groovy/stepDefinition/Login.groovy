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



class Login {
@Then("User click akun button")
public void user_click_akun_button() {
	WebUI.callTestCase(findTestCase('Pages/Navigation/Click Akun'), [:], FailureHandling.STOP_ON_FAILURE)
}

@Then("User click masuk button")
public void user_click_masuk_button() {
	WebUI.callTestCase(findTestCase('Pages/Login/Click masuk'), [:], FailureHandling.STOP_ON_FAILURE)
}

@Then("App show message error on email {string}")
public void app_show_message_error_on_email(String message1) {
	WebUI.callTestCase(findTestCase('Pages/Login/Read Error Message'), [('message') : message1], FailureHandling.STOP_ON_FAILURE)
}

@Then("User input registered email {string}")
public void user_input_registered_email(String email) {
	WebUI.callTestCase(findTestCase('Pages/Login/Input email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
}

@Then("App show message error on password {string}")
public void app_show_message_error_on_password(String message2) {
	WebUI.callTestCase(findTestCase('Pages/Login/Read Error Message'), [('message') : message2], FailureHandling.STOP_ON_FAILURE)
}

@Then("User clear text on email field")
public void user_clear_text_on_email_field() {
	Mobile.clearText(findTestObject('login/textfield_email'), 0)
}

@Then("User input password {string}")
public void user_input_password(String password) {
	WebUI.callTestCase(findTestCase('Pages/Login/Input password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
}

@Then("User clear text on password field")
public void user_clear_text_on_password_field() {
	Mobile.clearText(findTestObject('login/textfield_password'), 0)
}

@Then("User redirected to homepage")
public void user_redirected_to_homepage() {
	WebUI.callTestCase(findTestCase('Pages/Akun/Verify Content after Login'), [:], FailureHandling.STOP_ON_FAILURE)
}
}