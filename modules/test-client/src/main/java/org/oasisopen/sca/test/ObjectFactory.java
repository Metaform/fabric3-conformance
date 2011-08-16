
package org.oasisopen.sca.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasisopen.sca.test package. 
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

    private final static QName _InvokeTest_QNAME = new QName("http://test.sca.oasisopen.org/", "invokeTest");
    private final static QName _InvokeTestResponse_QNAME = new QName("http://test.sca.oasisopen.org/", "invokeTestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasisopen.sca.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvokeTest }
     * 
     */
    public InvokeTest createInvokeTest() {
        return new InvokeTest();
    }

    /**
     * Create an instance of {@link InvokeTestResponse }
     * 
     */
    public InvokeTestResponse createInvokeTestResponse() {
        return new InvokeTestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.sca.oasisopen.org/", name = "invokeTest")
    public JAXBElement<InvokeTest> createInvokeTest(InvokeTest value) {
        return new JAXBElement<InvokeTest>(_InvokeTest_QNAME, InvokeTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.sca.oasisopen.org/", name = "invokeTestResponse")
    public JAXBElement<InvokeTestResponse> createInvokeTestResponse(InvokeTestResponse value) {
        return new JAXBElement<InvokeTestResponse>(_InvokeTestResponse_QNAME, InvokeTestResponse.class, null, value);
    }

}
