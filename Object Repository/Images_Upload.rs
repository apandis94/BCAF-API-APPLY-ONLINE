<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Images_Upload</name>
   <tag></tag>
   <elementGuidId>a9b6e2b6-6949-4617-809c-ec676002c7d6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;images_ktp&quot;,
      &quot;value&quot;: &quot;D:\\Kerja\\Sigma Aprova\\ME\\KTP.jpg&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    },
    {
      &quot;name&quot;: &quot;images_npwp&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    },
    {
      &quot;name&quot;: &quot;images_cover&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    },
    {
      &quot;name&quot;: &quot;images_ktp_pasangan&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    },
    {
      &quot;name&quot;: &quot;images_fap&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    },
    {
      &quot;name&quot;: &quot;images_bpkb&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    },
    {
      &quot;name&quot;: &quot;images_slip&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    },
    {
      &quot;name&quot;: &quot;id&quot;,
      &quot;value&quot;: &quot;319012&quot;,
      &quot;type&quot;: &quot;Text&quot;,
      &quot;contentType&quot;: &quot;text/html&quot;
    },
    {
      &quot;name&quot;: &quot;images_kk&quot;,
      &quot;value&quot;: &quot;D:\\Kerja\\Sigma Aprova\\ME\\kk.jpg&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;image/jpeg&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
   </httpHeaderProperties>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api-dev.bcaf.id:8445/imagesapplyonline</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'6AJlP86Hc5Gkov63SGfRg6G2mH5W'</defaultValue>
      <description></description>
      <id>40d03f38-520d-494a-8778-8c0947d516a6</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
