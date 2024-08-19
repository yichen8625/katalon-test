<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>取得訂單列表</description>
   <name>OrderList</name>
   <tag></tag>
   <elementGuidId>2b466984-a6eb-4ad7-bf03-82ebb3790f21</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>x3zKFtnms2vIJ1zUEqtD/BNbmBX4XHpROoQ+VkYKYprsirvXdDArSrLZlg+/vw8Xx+6BB/4QSuCL5oWZQ+XCfH3zcauEuh63YClWz8ba1Ffx469G6UtDO58Kbw4S4tPLE3EgGHcvCO2g086yPvMRA78slQZkS3A0MEUaFVWdFIjG4NaPBKcsFa3+YWPCTp13mTSJInGXdvQx1RC1JVpgTvbD8Rod4UtqFvqvF4CppfHPnyRc5rsE//RtEIzpe0mak++keZICJ+93K66E7CJwDb330qv+wQBGnx3gYvzWSHI/PhIKa1zurM/kjDF5i5Pl39HvcCUeq9YXEx8fHxhiB7vWAhwUP4rvOmacGC9bgMk9hB7xFB/slm07WSclzju6Qr70BUVM1KEJ/QSbkiNqR+lr4zZ4c9+NH8ZGJ2dnODQ3U5a57zmNNHOxrJl/Ze/pWsmclQyqFpyO+NbFwaQMhNgyonz2pJWG4In+rJMpwl/3mrWMrcH1VdJrgPuU0k8gQKPHqad2t7Epwy87Kx9CQm/W0pe1uyyB2xi4nTNZND1HP9GDgA8lzFlbBcOI37tZDbcMHQaEYwdj7OYda1fv7kL+sedizSubjB7eIZsF/GJ1n2tA/bduL7GISGIq/xg1F8LzfSV7WrvtZjgiwGn2RG77W2qXTko/ABILMb3up6jS+mERAAKpIXQLmGS2H55gjA6JSYJuBHMEEIzGXlg66ct+QpQ1PbW/ABDIrPxTOrM=</value>
      <webElementGuid>b91d7550-4f90-4ed8-908b-333037390549</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://ecs-dev.kingnetsmart.com.tw/api/v2/Order/GetOrderInfo?page=${page}&amp;rows=${row}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>6eb3a44f-c774-44c1-a96a-fbc1e72d0afc</id>
      <masked>false</masked>
      <name>page</name>
   </variables>
   <variables>
      <defaultValue>'30'</defaultValue>
      <description></description>
      <id>62130b06-da50-47f9-96aa-b5910723a847</id>
      <masked>false</masked>
      <name>row</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
