#Basic Requirement:
Window 10 or above
Java 8 or above
Developer mode should be on | Settings > For developers
Java, Maven
Windows Kits https://developer.microsoft.com/en-us/windows/downloads/windows-10-sdk
WinAppDriver https://github.com/Microsoft/WinAppDriver

#Steps:
1. Double click WinAppDriver.exe located at C:\Program Files (x86)\Windows Application Driver
2. Run the program e.g. CalculatorTest.java using TestNg

#How to find locators
Double click inspect.exe
Path:
C:\Program Files (x86)\Windows Kits\10\bin\10.0.16299.0\x64
C:\Program Files (x86)\Windows Kits\10\bin\10.0.16299.0\x86


#Todo:
1. How many locator strategies present - done
2. How to find locators - done
3. Right click - done
4. Screen-shot feature
5. Double click
6. How to find colors in an app


#Useful links:
https://github.com/Microsoft/WinAppDriver/tree/master/Tests/UWPControls
https://github.com/Microsoft/WinAppDriver/tree/master/Tests/WebDriverAPI
https://github.com/Microsoft/WinAppDriver/issues/165
https://github.com/Microsoft/WinAppDriver/issues/240
https://github.com/Microsoft/WinAppDriver/issues
setup | https://automatetheplanet.com/automate-windows-desktop-apps-winappdriver/
screenshot | https://automatetheplanet.com/build-browser-extension-full-page-screenshots/
window 10 sdk | https://developer.microsoft.com/en-us/windows/downloads/windows-10-sdk


#Others
C:\Users\Sheetal_Singh\IdeaProjects\TestWin
https://stopbyte.com/t/what-is-the-difference-between-winrt-uwp-universal-windows-platform-and-wpf/13/7


#Locator mapping to methods
findElementByAccessibilityId    AutomationId
findElementByName               Name
findElementById                 RuntimeId (decimal)
findElementByClassName          ClassName
findElementByTagName            LocalizedControlType (upper camel case)