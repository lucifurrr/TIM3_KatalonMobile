#Author: Dhiki Purwanto

@AddItem @Smoke
Feature: Add Item
	As a user, I want to add item.
	
	@AddItem001
	Scenario: AddItem001-User Want to Add Item
	Then User Login with valid credential
	Then User Tap Beranda
	Then User Tap Jual
	Then User Input Nama Produk
	Then User Input Harga Produk
	Then User Select Kategori
	Then User Input Lokasi
	Then User Input Deskripsi
	Then User Upload Foto Produk
	Then User Tap Terbitkan