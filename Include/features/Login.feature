#Author: Tommy Abdullah

@LOGIN @SMOKE
Feature: Login
  As a user, I want to login in Secondhand Store.

    @LOGIN002
  	Scenario: LOGIN002 - Login without input  email and password
  	Then User click akun button
	Then User click masuk button
	Then User click masuk button
	Then App show message error on email "Email tidak boleh kosong"

  @LOGIN003
  Scenario: LOGIN003 - Login only input email
	Then User input registered email "apps1@thomi.anonaddy.me"
	Then User click masuk button
	Then App show message error on password "Email tidak boleh kosong"

 @LOGIN004
  Scenario: LOGIN004 - Login only input password
	And User clear text on email field
	Then User input password "123456"
	Then User click masuk button
	Then App show message error on email "Email tidak boleh kosong"
    
    @LOGIN001
  	Scenario: LOGIN001 - Login with valid email and password
	And User clear text on email field
	Then User input registered email "apps1@thomi.anonaddy.me"
	And User clear text on password field
	Then User input password "123456"
	Then User click masuk button
	Then User redirected to homepage