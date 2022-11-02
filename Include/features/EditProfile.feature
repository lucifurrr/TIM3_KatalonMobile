# Tri

@EditProfile
Feature: Edit Profile
	User want to edit Profile Akun
	
	@EditProfile001
	Scenario: Edit Profile 001 - User want to change display name
	Then user login
	Then user tap button akun
	Then user tap icon button edit profile 
	Then user tap on name 
	Then user input name 
	Then user tap simpan