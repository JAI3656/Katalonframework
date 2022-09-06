import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle(Url, 'Orders - Untitled')

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Button'))

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Edit'))

Windows.setText(findWindowsObject('Object Repository/Demo_recorddesktop/Edit'), Customername)

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(1)'))

Windows.setText(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(1)'), street)

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(2)'))

Windows.setText(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(2)'), city)

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(3)'))

Windows.setText(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(3)'), state)

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(4)'))

Windows.setText(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(4)'), zip)

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/RadioButton'))

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(5)'))

Windows.setText(findWindowsObject('Object Repository/Demo_recorddesktop/Edit(5)'), cardnumber)

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Pane'))

Windows.setText(findWindowsObject('Object Repository/Demo_recorddesktop/Pane'), expirationdate)

Windows.click(findWindowsObject('Object Repository/Demo_recorddesktop/Button(1)'))

Windows.closeApplication()

