import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.waitForElementPresent(findTestObject('Homepage/imageview_Banner'), 5)

Mobile.tap(findTestObject('Homepage/imageview_Banner'), 0)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
int startY = device_Height * 0.2

'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
int endY = startY

'Storing the startX value'
int startX = device_Width / 1.2

'Storing the endX value'
int endX = device_Width / 6

//int startX = 900
//int startY = 450
//int endX = 180
//int endY = 450


//KeywordLogger log = new KeywordLogger()
//log.logInfo("Start X =" + startX.toString(), "Start Y =" + startY.toString(), "End X =" + endX.toString(), "End Y =" + endY.toString())


'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

Mobile.waitForElementPresent(findTestObject('Homepage/imageview_Banner'), 5)

Mobile.tap(findTestObject('Homepage/imageview_Banner'), 0)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

Mobile.waitForElementPresent(findTestObject('Homepage/imageview_Banner'), 5)

Mobile.tap(findTestObject('Homepage/imageview_Banner'), 0)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

Mobile.waitForElementPresent(findTestObject('Homepage/imageview_Banner'), 5)

Mobile.tap(findTestObject('Homepage/imageview_Banner'), 0)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

Mobile.waitForElementPresent(findTestObject('Homepage/imageview_Banner'), 5)

Mobile.tap(findTestObject('Homepage/imageview_Banner'), 0)

