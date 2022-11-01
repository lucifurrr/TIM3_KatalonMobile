#Author: Dhiki Purwanto

@ViewProductList @Smoke
Feature: View Product List
	As a user, I want to see all product list.
	
	@ViewProductList001
	Scenario: ViewProductList001-User Want to See All Product List
	Then User Login with valid credential
	Then User Tap Beranda
	Then User Tap Semua