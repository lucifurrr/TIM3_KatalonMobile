#Author: Sandri Alfarisi

@PesananSaya @SMOKE
Feature: View and Click Pesanan Saya
  As a user, I want to view and click pesanan saya

  @PESANAN001
  Scenario: PESANAN001 - View and Click Pesanan Saya
	Then User login
	Then User click akun button
	Then User tap pesanan saya button
	Then user see one of product pesanan saya
	Then user tap one of product