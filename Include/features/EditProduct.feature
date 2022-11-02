#Author : Sofia Awiliyah

@EDITPRODUCT
Feature: User want to edit product

  @EDITPRODUCT001
  Scenario: User want to edit product with valid credential
    Then User login
    Then User click akun button
    Then User tap daftar jual button
    Then User tap product detail
    Then User verify element exist
    Then User input product name "ASUS VIVOBOOK 14"
    Then User input product price "11000000"
    Then User choose category
    Then User input product place "tangerang"
    Then User input product description "Laptop ASUS VIVOBOOK 14, intel CORE i5"
    Then User click button change image
    Then User tap category
    Then User tap perbarui product
    Then User verify element success

  @EDITPRODUCT002
  Scenario: User want to edit product without fill product description
    Then User login
    Then User click akun button
    Then User tap daftar jual button
    Then User tap product detail
    Then User verify element exist
    Then User input product name "ASUS VIVOBOOK 14"
    Then User input product price "11000000"
    Then User choose category
    Then User input product place "tangerang"
    Then User input product description ""
    Then User click button change image
    Then User tap category
    Then User tap perbarui product
    Then User verify description empty

  @EDITPRODUCT003
  Scenario: User want to edit product without photos
    Then User login
    Then User click akun button
    Then User tap daftar jual button
    Then User tap product detail
    Then User verify element exist
    Then User input product name "ASUS VIVOBOOK 14"
    Then User input product price "11000000"
    Then User choose category
    Then User input product place "tangerang"
    Then User input product description "Asus Vivobook 14 Intel iCore 5 2021"
    Then User tap category
    Then User tap perbarui product

  @EDITPRODUCT004
  Scenario: User want to edit product without select category
    Then User login
    Then User click akun button
    Then User tap daftar jual button
    Then User tap product detail
    Then User verify element exist
    Then User input product name "ASUS VIVOBOOK 14"
    Then User input product price "11000000"
    Then User input product place "tangerang"
    Then User input product description "Asus Vivobook 14 Intel iCore 5 2021"
    Then User click button change image
    Then User tap perbarui product
