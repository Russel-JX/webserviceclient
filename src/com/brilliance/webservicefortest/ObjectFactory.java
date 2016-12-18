
package com.brilliance.webservicefortest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brilliance.webservicefortest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWelcomeResponse_QNAME = new QName("http://webserviceFortest.brilliance.com/", "getWelcomeResponse");
    private final static QName _GetWelcome_QNAME = new QName("http://webserviceFortest.brilliance.com/", "getWelcome");
    private final static QName _GetAge_QNAME = new QName("http://webserviceFortest.brilliance.com/", "getAge");
    private final static QName _GetAgeResponse_QNAME = new QName("http://webserviceFortest.brilliance.com/", "getAgeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brilliance.webservicefortest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAgeResponse }
     * 
     */
    public GetAgeResponse createGetAgeResponse() {
        return new GetAgeResponse();
    }

    /**
     * Create an instance of {@link GetAge }
     * 
     */
    public GetAge createGetAge() {
        return new GetAge();
    }

    /**
     * Create an instance of {@link GetWelcome }
     * 
     */
    public GetWelcome createGetWelcome() {
        return new GetWelcome();
    }

    /**
     * Create an instance of {@link GetWelcomeResponse }
     * 
     */
    public GetWelcomeResponse createGetWelcomeResponse() {
        return new GetWelcomeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceFortest.brilliance.com/", name = "getWelcomeResponse")
    public JAXBElement<GetWelcomeResponse> createGetWelcomeResponse(GetWelcomeResponse value) {
        return new JAXBElement<GetWelcomeResponse>(_GetWelcomeResponse_QNAME, GetWelcomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceFortest.brilliance.com/", name = "getWelcome")
    public JAXBElement<GetWelcome> createGetWelcome(GetWelcome value) {
        return new JAXBElement<GetWelcome>(_GetWelcome_QNAME, GetWelcome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceFortest.brilliance.com/", name = "getAge")
    public JAXBElement<GetAge> createGetAge(GetAge value) {
        return new JAXBElement<GetAge>(_GetAge_QNAME, GetAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceFortest.brilliance.com/", name = "getAgeResponse")
    public JAXBElement<GetAgeResponse> createGetAgeResponse(GetAgeResponse value) {
        return new JAXBElement<GetAgeResponse>(_GetAgeResponse_QNAME, GetAgeResponse.class, null, value);
    }

}
