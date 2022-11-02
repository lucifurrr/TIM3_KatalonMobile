#Author : Sofia Awiliyah

@SEARCHPRODUCT
Feature: User want to search product by keyword

  @SEARCHPRODUCT001
  Scenario: User want to edit product with valid credential
    Then User login
    Then User Tap Beranda
    Then User input keyword "tango"
    Then User wait until element present
    Then User tap in product search

  @SEARCHPRODUCT002
  Scenario: User want to edit product with valid credential
    Then User login
    Then User Tap Beranda
    Then User input keyword "potato"
    Then User wait until element present
    Then User tap in product not in list
