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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.HttpMessage
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.webservice.verification.WSResponseManager as WSResponseManager
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent

token = WS.sendRequest(findTestObject('Get_Token'))

'store json response to variable'
def slurper = new groovy.json.JsonSlurper()

def response = slurper.parseText(token.getResponseBodyContent())

def tokenacces = response.access_token

def expired = response.expires_in

println('acces token : ' + tokenacces)

println('expired : ' + expired)

'store var to global variable'
GlobalVariable.global_token = tokenacces

KeywordUtil.markPassed('acces token : ' + GlobalVariable.global_token)

'verify response status code'
WS.verifyResponseStatusCode(token, 200)

'show response to report in test suite'
response = token.getResponseText()

KeywordUtil.logInfo("$response")

def img_upload = (RequestObject)findTestObject('Images_Upload1', [('token') : tokenacces, ('ktp') : ktp, ('id') : id,
	('kk') : kk])

'Cek response data'
ResponseObject response_in = WS.sendRequest(img_upload)

KeywordUtil.markPassed('Insert data : ' + no)

'verify response status code'
WS.verifyResponseStatusCode(response_in, 200)

'show response to report in test suite'
String response_feedback = response_in.getResponseText()

'print log response text body'
KeywordUtil.logInfo("$response_feedback")

