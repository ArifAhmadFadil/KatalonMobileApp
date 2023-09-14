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

Mobile.startApplication('C:\\Users\\LENOVO\\Documents\\MOBILE AUTOMATIONS\\app.apk', true)

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/txt_city'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (9)'), 'city', 0)

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText - prov'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/txt_provincy'), 'provincy', 0)

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (12)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/txt_postal_code'), '55858', 0)

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/android.widget.EditText (14)'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/txt_mobile_phone'), '558525145', 0)

Mobile.tap(findTestObject('Object Repository/COBA/coba003/coba005/btn_txt_bisnis'), 0)

Mobile.setText(findTestObject('Object Repository/COBA/coba003/coba005/txt_bussiness_mobile'), '0856525652', 0)

Mobile.hideKeyboard()

Mobile.closeApplication()
