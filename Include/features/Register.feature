#Author: Afi Sherma

@Register @SMOKE
Feature: Register
  As a user, I want to sign up at SecondHand Store website

	@REG001
  Scenario: REG001 - User want to sign up using unregistered email
	Then User click akun button
	Then User click masuk button
	Then User tap link daftar
	Then User input nama
	Then User input unregistered email "pltnmchllgn16@yopmail.com"
	Then User input password "123456"
	Then User input nomor hp 
	Then User scroll down
	Then User input kota
	Then User input alamat
	Then User click daftar button
	Then User can see pop up message Verify your email
	Then User close app
	
	@REG002
  Scenario: REG002 - User want to sign up using registered email
	Then User open app
	Then User click akun button
	Then User click masuk button
	Then User tap link daftar
	Then User input nama
	Then User input registered email "apps1@thomi.anonaddy.me"
	Then User input password "123456"
	Then User input nomor hp 
	Then User scroll down
	Then User input kota
	Then User input alamat
	Then User click daftar button1
	Then User verify email sudah digunakan
	Then User close app
	
	@REG003
	Scenario: REG003 - User want to sign up with blank name field
	Then User open app
	Then User click akun button
	Then User click masuk button
	Then User tap link daftar
	Then User make name field blank
	Then User input unregistered email "pltnmchllgn19@yopmail.com"
	Then User input password "123456"
	Then User input nomor hp 
	Then User scroll down
	Then User input kota
	Then User input alamat
	Then User click daftar button
	Then User can see pop up message Nama tidak boleh kosong