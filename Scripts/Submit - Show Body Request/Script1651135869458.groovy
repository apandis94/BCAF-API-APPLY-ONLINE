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


KeywordUtil.markPassed('Insert data : ' + no)

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

def submit_data = (RequestObject)findTestObject('Apply_Online', [('token') : tokenacces, ('ip_addres') : ip_addres
            , ('user_id') : user_id, ('i_cabang') : i_cabang, ('i_typekonsumen') : i_typekonsumen, ('i_statusperkawinan') : i_statusperkawinan
            , ('p_alamat') : p_alamat, ('p_kecamatan') : p_kecamatan, ('p_agama') : p_agama, ('p_tanggallahir') : p_tanggallahir
            , ('p_tempatlahir') : p_tempatlahir, ('p_noidentitas') : p_noidentitas, ('p_typeidentitas') : p_typeidentitas, ('p_jeniskelamin') : p_jeniskelamin
            , ('p_kabupaten') : p_kabupaten, ('p_kelurahan') : p_kelurahan, ('p_kodepos') : p_kodepos, ('p_nama') : p_nama
            , ('p_namaibu') : p_namaibu, ('p_provinsi') : p_provinsi, ('o_namaperusahaan') : o_namaperusahaan, ('o_jabatan') : o_jabatan
            , ('o_totalpenghasilan') : o_totalpenghasilan, ('o_alamat') : o_alamat, ('o_ekonomikode') : o_ekonomikode, ('o_establishedsince') : o_establishedsince
            , ('o_exttelp') : o_exttelp, ('o_jenisusaha') : o_jenisusaha, ('o_kecamatan') : o_kecamatan, ('o_kodefax') : o_kodefax, ('o_kodenotelp') : o_kodenotelp
            , ('o_kodepos') : o_kodepos, ('o_notelp') : o_notelp, ('o_pekerjaan') : o_pekerjaan, ('s_kodepos') : s_kodepos
            , ('s_alamatperusahaan') : s_alamatperusahaan, ('s_agama') : s_agama, ('s_alamat') : s_alamat, ('s_tanggallahir') : s_tanggallahir
            , ('s_kotalahir') : s_kotalahir, ('s_exttelp') : s_exttelp, ('s_faxperusahaan') : s_faxperusahaan, ('s_kartuidentitas') : s_kartuidentitas
            , ('s_jabatan') : s_jabatan, ('s_jeniskelamin') : s_jeniskelamin, ('s_kabupaten') : s_kabupaten, ('s_kecamatan') : s_kecamatan
            , ('s_kecamatanperusahaan') : s_kecamatanperusahaan, ('s_kelurahan') : s_kelurahan, ('s_kodenotelpperusahaan') : s_kodenotelpperusahaan, ('s_kodeposperusahaan') : s_kodeposperusahaan
            , ('s_namaperusahaan') : s_namaperusahaan, ('s_namaspouse') : s_namaspouse, ('s_noktp') : s_noktp
            , ('s_notelperusahaan') : s_notelperusahaan, ('s_ocktp') : s_ocktp, ('s_ockartunama') : s_ockartunama, ('s_ocpekerjaan') : s_ocpekerjaan
            , ('s_ocprovinsi') : s_ocprovinsi, ('d_dealerid') : d_dealerid, ('d_maindealerid') : d_maindealerid, ('d_dealeralamat') : d_dealeralamat
            , ('d_dealerauth') : d_dealerauth, ('d_dealercabang') : d_dealercabang, ('d_dealernama') : d_dealernama
            , ('d_dealerfax') : d_dealerfax, ('d_dealerkota') : d_dealerkota, ('d_dealernohp') : d_dealernohp, ('d_dealernorek') : d_dealernorek
            , ('v_bpkbnumber') : v_bpkbnumber, ('v_brand') : v_brand, ('v_carcondition') : v_carcondition, ('v_kind') : v_kind
            , ('v_model') : v_model, ('v_nopol') : v_nopol, ('v_purpose') : v_purpose, ('v_type') : v_type
            , ('v_typeid') : v_typeid, ('v_tahun') : v_tahun, ('l_plafon') : l_plafon, ('l_admfee') : l_admfee
            , ('l_biayaprocess') : l_biayaprocess, ('l_blacklist') : l_blacklist, ('l_carinsfee') : l_carinsfee, ('l_dp') : l_dp, ('l_dppercent') : l_dppercent
            , ('l_effectiverate') : l_effectiverate, ('l_firstpayment') : l_firstpayment, ('l_flatrate') : l_flatrate, ('l_hargachasis') : l_hargachasis
            , ('l_hargakaroseri') : l_hargakaroseri, ('l_installment') : l_installment, ('l_kolommutasidebit') : l_kolommutasidebit, ('l_kolommutasikredit') : l_kolommutasikredit
            , ('l_kolommutasisaldo') : l_kolommutasisaldo, ('l_lifeinsurance') : l_lifeinsurance, ('l_lifeinsurancefee') : l_lifeinsurancefee, ('l_loantype') : l_loantype
            , ('l_otr') : l_otr, ('l_principal') : l_principal, ('l_provisionpercent') : l_provisionpercent, ('l_provisionfee') : l_provisionfee
            , ('l_provisionpayment') : l_provisionpayment, ('l_residualvalue') : l_residualvalue, ('l_tenor') : l_tenor, ('l_totaloutstanding') : l_totaloutstanding
            , ('l_tujuan') : l_tujuan, ('f_cabangkcubca') : f_cabangkcubca, ('f_norek') : f_norek, ('c_contactperson') : c_contactperson
            , ('in_branchcarinsurance') : in_branchcarinsurance, ('in_branchlifeinsurance') : in_branchlifeinsurance
            , ('in_carins') : in_carins, ('in_insdeduc') : in_insdeduc, ('in_inspayment') : in_inspayment, ('in_instype') : in_instype
            , ('in_lifeins') : in_lifeins, ('in_rscc') : in_rscc, ('in_rsmb') : in_rsmb, ('in_tjh') : in_tjh
            , ('od_userinput') : od_userinput, ('od_bukti') : od_bukti, ('od_luastanah') : od_luastanah, ('od_luasbangunan') : od_luasbangunan
            , ('od_namamo') : od_namamo, ('od_namabm') : od_namabm, ('od_sumberapp') : od_sumberapp, ('od_idapp') : od_idapp, ('od_appbranch') : od_appbranch
            , ('bp_bpkbowner') : bp_bpkbowner, ('bp_bodynumber') : bp_bodynumber, ('bp_warna') : bp_warna, ('bp_nomesin') : bp_nomesin
            , ('kk_pendidikan') : kk_pendidikan, ('np_npwpnumber') : np_npwpnumber, ('cb_cabang') : cb_cabang, ('kn_kodefax') : kn_kodefax
            , ('fap_pdhmany') : fap_pdhmany, ('fap_alamatrumah') : fap_alamatrumah, ('fap_statusrumah') : fap_statusrumah, ('fap_kelurahan') : fap_kelurahan, ('fap_kecamatan') : fap_kecamatan
            , ('fap_kabupaten') : fap_kabupaten, ('fap_provinsi') : fap_provinsi, ('fap_kodepos') : fap_kodepos, ('fap_lamatinggaltahun') : fap_lamatinggaltahun
            , ('fap_lamatinggalbulan') : fap_lamatinggalbulan, ('fap_supportperson') : fap_supportperson, ('fap_alamatemail') : fap_alamatemail, ('fap_alamatemaillain') : fap_alamatemaillain
            , ('fap_kabemail') : fap_kabemail, ('fap_provinsilain') : fap_provinsilain, ('fap_kodeposlain') : fap_kodeposlain
            , ('fap_emailkantor') : fap_emailkantor, ('fap_kodetelp1') : fap_kodetelp1, ('fap_notelop1') : fap_notelop1, ('fap_kodetelp2') : fap_kodetelp2
            , ('fap_notelop2') : fap_notelop2, ('fap_kodetelp3') : fap_kodetelp3, ('fap_notelop3') : fap_notelop3, ('fap_prefixtelp1') : fap_prefixtelp1
            , ('fap_nohp1') : fap_nohp1, ('fap_prefixtelp2') : fap_prefixtelp2, ('fap_nohp2') : fap_nohp2, ('fap_namacontactperson') : fap_namacontactperson
            , ('fap_alamatcontactperson') : fap_alamatcontactperson, ('fap_kotacontactperson') : fap_kotacontactperson, ('fap_kodeposcontactperson') : fap_kodeposcontactperson
            , ('fap_kodetelpcontactperson') : fap_kodetelpcontactperson, ('fap_nombertelpcontactperson') : fap_nombertelpcontactperson, ('fap_relations') : fap_relations
            , ('fap_carabayar') : fap_carabayar])

'Print Body Request'
//call request body content
HttpTextBodyContent body2 = submit_data.getBodyContent()

//Variable get request body text
String req = body2.getText()

'Cek response data'
ResponseObject response_in = WS.sendRequest(submit_data)

'verify response status code'
WS.verifyResponseStatusCode(response_in, 200)

'show response to report in test suite'
String response_feedback = response_in.getResponseText()

'store json response to variable'
def slurper2 = new groovy.json.JsonSlurper()

def response_out = slurper2.parseText(response_in.getResponseBodyContent())

def noid = response_out.id

def massage = response_out.desc

println('nomber id : ' + noid)

println('status : ' + massage)

'store var to global variable'
GlobalVariable.glb_dataid = noid

KeywordUtil.markPassed('nomber id : ' + GlobalVariable.glb_dataid)

KeywordUtil.markPassed('status : ' + massage)

'verify response status code'
WS.verifyResponseStatusCode(response_in, 200)

'show response to report in test suite'
response_out = response_in.getResponseText()

'--------------------------------------------------'

'print log request text body'
KeywordUtil.logInfo("$req")

KeywordUtil.logInfo("$response_out")

'Verify response'
WebUI.verifyMatch(massage, 'Success', false, FailureHandling.STOP_ON_FAILURE)




