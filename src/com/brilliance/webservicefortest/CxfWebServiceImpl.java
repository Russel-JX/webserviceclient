package com.brilliance.webservicefortest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2016-12-18T16:53:30.306+08:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://webserviceFortest.brilliance.com/", name = "CxfWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface CxfWebServiceImpl {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getWelcome2", targetNamespace = "http://webserviceFortest.brilliance.com/", className = "com.brilliance.webservicefortest.GetWelcome2")
    @WebMethod
    @ResponseWrapper(localName = "getWelcome2Response", targetNamespace = "http://webserviceFortest.brilliance.com/", className = "com.brilliance.webservicefortest.GetWelcome2Response")
    public java.lang.String getWelcome2(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAge2", targetNamespace = "http://webserviceFortest.brilliance.com/", className = "com.brilliance.webservicefortest.GetAge2")
    @WebMethod
    @ResponseWrapper(localName = "getAge2Response", targetNamespace = "http://webserviceFortest.brilliance.com/", className = "com.brilliance.webservicefortest.GetAge2Response")
    public int getAge2(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}
