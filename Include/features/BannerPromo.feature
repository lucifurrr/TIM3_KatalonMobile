#Author: Sandri Alfarisi

@BannerPromo @SMOKE
Feature: Tap and Swipe Banner Promo
  As a user, I want to check banner product function

  @BANNER001
  Scenario: BANNER001 - Tap and swipe Banner without login
	Then User tap and swipe on banner promo
	
	@BANNER002
  Scenario: BANNER002 - Tap and swipe Banner with login
	Then User login
	Then User tap beranda button
	Then User tap and swipe on banner promo