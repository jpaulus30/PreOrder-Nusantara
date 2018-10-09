import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Pre-booking Dwidayatour Pesta/input_Nama Lengkap_promo_preor'), 'Johanes')

WebUI.selectOptionByValue(findTestObject('Page_Pre-booking Dwidayatour Pesta/Jenis Kelamin'), Male, false)

WebUI.setText(findTestObject('Object Repository/Page_Pre-booking Dwidayatour Pesta/input_Email_promo_preorder_ema'), 'email@email.com')

WebUI.setText(findTestObject('Object Repository/Page_Pre-booking Dwidayatour Pesta/input_No. Telepon  HP_promo_pr'), '0812345543')

WebUI.selectOptionByValue(findTestObject('Page_Pre-booking Dwidayatour Pesta/Lokasi'), lokasi, false)

WebUI.setText(findTestObject('Page_Pre-booking Dwidayatour Pesta/input_Kota Keberangkatan_from_'), kota_berangkat)

WebUI.focus(findTestObject('Page_Pre-booking Dwidayatour Pesta/div_Jakarta (CGK) - Soekarno H'))

WebUI.click(findTestObject('Page_Pre-booking Dwidayatour Pesta/div_Jakarta (CGK) - Soekarno H'))

WebUI.setText(findTestObject('Page_Pre-booking Dwidayatour Pesta/input_Kota Tujuan_to_text'), kota_tujuan)

WebUI.focus(findTestObject('Page_Pre-booking Dwidayatour Pesta/div_Denpasar (DPS) - Bali Ngur'))

WebUI.click(findTestObject('Page_Pre-booking Dwidayatour Pesta/div_Denpasar (DPS) - Bali Ngur'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Pre-booking Dwidayatour Pesta/input_Tanggal Keberangkatan_pr'), tanggal_keberangkatan)

WebUI.sendKeys(findTestObject('Page_Pre-booking Dwidayatour Pesta/input_Tanggal Keberangkatan_pr'), Keys.chord(Keys.ENTER))

/*--------------*/
/*For Date Picker Tanggal Berangkat*/
/*--------------*/
WebUI.focus(findTestObject('Page_Pre-booking Dwidayatour Pesta/input_Tanggal Pulang_promo_pre'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Pre-booking Dwidayatour Pesta/input_Tanggal Pulang_promo_pre'), tanggal_kembali)

WebUI.sendKeys(findTestObject('Page_Pre-booking Dwidayatour Pesta/input_Tanggal Pulang_promo_pre'), Keys.chord(Keys.ENTER))

/*--------------*/
WebUI.setText(findTestObject('Object Repository/Page_Pre-booking Dwidayatour Pesta/input_Nama lengkap_preorder_pa'), findTestData(
        'New Test Data').getValue(1, 2))

WebUI.click(findTestObject('Object Repository/Page_Pre-booking Dwidayatour Pesta/button_PRE-ORDER NOW'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pre-booking Dwidayatour Pesta/h2_Terima kasih telah melakuka'), 
    FailureHandling.STOP_ON_FAILURE)

