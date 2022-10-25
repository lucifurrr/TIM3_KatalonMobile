#Author: Tommy Abdullah

@DeleteProduct @SMOKE
Feature: Cancel Delete Product
  As a user, I want to check delete function

  @Del001
  Scenario: Del001 - Cancel delete product
	Then User login
	Then User tap daftar jual button
	Then User make sure the active tab is product tab
	When User tap delete button
	Then pop up delete product appears
	Then User tap batalkan button
	Then User make sure back to product tab
	
	@Del002
  Scenario: Del002 - Delete product
	When User tap delete button
	Then pop up delete product appears
	Then User tap hapus button
	Then a toast message appears